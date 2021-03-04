package rtp.demo.debtor.payment;

import java.util.List;
import java.time.Instant;
import java.util.ArrayList;

import org.junit.Test;
import reactor.test.StepVerifier;
import rtp.demo.debtor.payment.Message;
import rtp.demo.debtor.payment.MessagesBroker;
import rtp.demo.domain.payment.Payment;

public class MessagesBrokerTest {

//	@Test
//	public void shouldPublishAndSubscribe() {
//		MessagesBroker broker = new MessagesBroker();
//		List<Payment> payments = new ArrayList<Payment>();
//		Message first = new Message(payments);
//		Message second = new Message(payments);
//
//		StepVerifier.create(broker.subscribe()).then(() -> broker.publish(first)).expectNext(first)
//				.then(() -> broker.publish(second)).expectNext(second).thenCancel().verify();
//	}
}