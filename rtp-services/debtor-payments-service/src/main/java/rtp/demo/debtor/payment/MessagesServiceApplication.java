package rtp.demo.debtor.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import rtp.demo.payment.repository.PaymentRepository;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.accepted;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@EnableJpaRepositories("rtp.demo.payment.repository")
@ComponentScan(basePackages = { "rtp.demo.payment.repository", "rtp.demo.domain.payment", "rtp.demo.domain.account",
		"rtp.demo.debtor.payment", "io.swagger", "rtp.demo.domain", "io.swagger.configuration" })
@EntityScan(basePackages = { "rtp.demo.domain.payment", "rtp.demo.domain.account" })
public class MessagesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagesServiceApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> router(MessagesBroker broker) {
		return route().POST("/payments", request -> paymentsPostHandler(request, broker)).build();
	}

	private Mono<ServerResponse> paymentsPostHandler(ServerRequest request, MessagesBroker broker) {
		Mono<Message> messageMono = null;
		try {
			// Publish a message to a broker and retain its instance to be returned as an
			// HTTP response body
			messageMono = request.bodyToMono(Message.class).doOnNext(broker::publish);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accepted().contentType(APPLICATION_JSON).body(messageMono, Message.class);
	}

}
