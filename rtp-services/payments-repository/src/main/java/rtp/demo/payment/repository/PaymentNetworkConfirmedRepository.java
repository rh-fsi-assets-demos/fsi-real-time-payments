package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.PaymentNetworkConfirmed;

public interface PaymentNetworkConfirmedRepository extends CrudRepository<PaymentNetworkConfirmed, Long> {

	List<PaymentNetworkConfirmed> findByDomesticPaymentId(String domesticPaymentId);

}
