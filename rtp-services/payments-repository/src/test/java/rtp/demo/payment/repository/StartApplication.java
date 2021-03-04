package rtp.demo.payment.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("rtp.demo.domain.payment")
public class StartApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	@Autowired
	private PaymentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

	}

	public PaymentRepository getRepository() {
		return repository;
	}

	public void setRepository(PaymentRepository repository) {
		this.repository = repository;
	}

}