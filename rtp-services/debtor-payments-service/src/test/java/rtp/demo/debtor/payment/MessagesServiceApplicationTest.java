package rtp.demo.debtor.payment;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import rtp.demo.debtor.payment.Message;
import rtp.demo.domain.payment.Payment;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class MessagesServiceApplicationTest {
//
//	@LocalServerPort
//	private String port;
//
//	@Autowired
//	private WebClient.Builder builder;
//
//	private WebClient client;
//
//	@Before
//	public void setUp() {
//		client = builder.baseUrl("http://localhost:" + port).build();
//	}
//
//	@Test
//	public void shouldSendAndReceiveMessages() {
//		List<Payment> payments = new ArrayList<Payment>();
//		Message first = new Message(payments);
//		Message second = new Message(payments);
//
//		StepVerifier.create(receiveMessages()).then(() -> sendMessage(first)).then(() -> sendMessage(second))
//				.expectNext(first).expectNext(second).thenCancel().verify();
//	}
//
//	private Flux<Message> receiveMessages() {
//		return client.get().accept(APPLICATION_STREAM_JSON).retrieve().bodyToFlux(Message.class);
//	}
//
//	private void sendMessage(Message message) {
//		client.post().contentType(APPLICATION_JSON).syncBody(message).retrieve().bodyToMono(Message.class).block();
//	}
//}