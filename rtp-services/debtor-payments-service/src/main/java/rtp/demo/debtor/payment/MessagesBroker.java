package rtp.demo.debtor.payment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import rtp.demo.debtor.payment.producer.DebtorPaymentsProducer;
import rtp.demo.domain.payment.Payment;
import rtp.demo.payment.repository.PaymentRepository;

/**
 * A messages broker to send messages to Kafka
 */
@Component
public class MessagesBroker {

	@Autowired
	private PaymentRepository paymentRepository;

	private final Flux<Message> messagesFlux;
	private AtomicReference<FluxSink<Message>> messagesSink = new AtomicReference<>();
	private DebtorPaymentsProducer producer = new DebtorPaymentsProducer();

	public MessagesBroker() {
		messagesFlux = Flux.create(messagesSink::set).share();
	}

	/**
	 * Publish message to a broker.
	 *
	 * @param message
	 */
	public void publish(Message message) {

		try {
			for (Payment payment : message.getPayments()) {
//				System.out.println(message);
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
//				LocalDateTime now = LocalDateTime.now();
//				payment.setPaymentId("PAY" + formatter.format(now));
//				payment.setTransactionType("DEBIT");
//				payment.setStatus("PENDING");
//				producer.sendMessage(payment.getPaymentId(), payment);
//
//				// paymentRepository.save(payment);
//				System.out.println("Broker sent message: " + payment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (messagesSink.get() != null) {
			messagesSink.get().next(message);
		}
	}

	/**
	 * Subscribe to a broker in order to receive newly published messages.
	 *
	 * @return Flux of messages
	 */
	public Flux<Message> subscribe() {
		return messagesFlux;
	}

	public PaymentRepository getPaymentRepository() {
		return paymentRepository;
	}

	public void setPaymentRepository(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

}
