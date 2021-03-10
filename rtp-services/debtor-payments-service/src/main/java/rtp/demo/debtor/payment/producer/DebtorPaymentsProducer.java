package rtp.demo.debtor.payment.producer;

import java.util.Properties;
import java.util.logging.Logger;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import rtp.demo.debtor.payment.producer.DebtorPaymentsProducer;
import rtp.demo.debtor.payment.producer.DebtorPaymentsProducerConfig;
import rtp.demo.domain.payment.Payment;

public class DebtorPaymentsProducer {

	private static final Logger LOGGER = Logger.getLogger(DebtorPaymentsProducer.class.getName());

	private DebtorPaymentsProducerConfig config;
	private KafkaProducer<String, Payment> producer;
	private Properties props;

	public DebtorPaymentsProducer() {
		this.config = DebtorPaymentsProducerConfig.fromEnv();
		this.props = DebtorPaymentsProducerConfig.createProperties(config);
		this.producer = new KafkaProducer<>(props);
	}

	public void sendMessage(String key, Payment payment) throws InterruptedException {
		LOGGER.info("Kafka sending message: {}" + payment);
		producer.send(new ProducerRecord<>(config.getTopic(), key, payment));

		LOGGER.info("Kafka message sent.");
	}

	public void closeProducer() {
		producer.close();
	}

}