package rtp.demo.debtor.payments.hub;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.Consumed;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;

import org.apache.kafka.streams.kstream.JoinWindows;
import org.apache.kafka.streams.kstream.Joined;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.beans.factory.annotation.Autowired;

import rtp.demo.domain.payment.Payment;
import rtp.demo.domain.payment.serde.PaymentSerde;
import rtp.demo.payment.repository.PaymentRepository;

public class StreamJoin {

	@Autowired
	private PaymentRepository paymentRepository;

	private static final Logger LOG = Logger.getLogger(StreamJoin.class.getName());

	private String inputTopic1 = "debtor-format-validation-output";
	private String inputTopic2 = "debtor-aml-check-output";
	private String inputTopic3 = "debtor-fraud-check-output";
	private String outputTopicName = "debtor-accepted-payments";

	private String bootstrapServers = "rtp-demo-cluster-kafka-bootstrap:9092";
	private String applicationId = "debtor-pending-payments";
	private String clientId = "debtor-pending-payments-client";

	private Properties streamsConfiguration = new Properties();
	private KafkaStreams streams;

	public StreamJoin() {
		LOG.info("Configuring Creditor Payments Stream");

		final Serde<Payment> paymentSerde = new PaymentSerde();

		streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, applicationId);
		streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, paymentSerde.getClass().getName());
		streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, clientId);

		StreamsBuilder builder = new StreamsBuilder();

		KStream<String, Payment> payment1Stream = builder.stream(inputTopic1,
				Consumed.with(Serdes.String(), paymentSerde));

		KStream<String, Payment> payment2Stream = builder.stream(inputTopic2,
				Consumed.with(Serdes.String(), paymentSerde));

		@SuppressWarnings("deprecation")
		KStream<String, Payment> pendingPaymentsStream = payment1Stream.join(payment2Stream,
				(payment1, payment2) -> new Payment(payment1, payment2, "AcceptedSettlementInProcess"),
				JoinWindows.of(TimeUnit.MINUTES.toMillis(5)), Serdes.String(), paymentSerde, paymentSerde);

		try {

			payment1Stream.print();
			payment2Stream.print();

			LOG.info("Joined stream: ");
			pendingPaymentsStream.print();

			pendingPaymentsStream.foreach((key, value) -> {
				LOG.info("Updating Payment: " + key);
				Payment retrievedPayment = (Payment) paymentRepository.findByDomesticPaymentId(key);

				if (retrievedPayment != null) {
					retrievedPayment.setStatus("AcceptedSettlementInProcess");
					paymentRepository.save(retrievedPayment);
				}
			});

			pendingPaymentsStream.to(outputTopicName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfiguration);
			streams.start();
			Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void startStream() {
		LOG.info("Starting Creditor Payments Stream");
		streams.start();
	}

	public void closeStream() {
		LOG.info("Stopping Creditor Payments Stream");
		streams.close();
	}
}