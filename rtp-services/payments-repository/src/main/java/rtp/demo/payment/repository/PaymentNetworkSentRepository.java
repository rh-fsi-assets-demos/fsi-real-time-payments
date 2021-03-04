package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.PaymentNetworkSent;

@EntityScan("rtp.demo.domain.topics")
public interface PaymentNetworkSentRepository extends CrudRepository<PaymentNetworkSent, Long> {

	// List<ValidationComplete> findByDomesticPaymentId(String domesticPaymentId);
	List<PaymentNetworkSent> findByDomesticPaymentId(String domesticPaymentId);
}
