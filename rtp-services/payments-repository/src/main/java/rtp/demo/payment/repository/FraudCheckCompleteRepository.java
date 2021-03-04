package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.FraudCheckComplete;

public interface FraudCheckCompleteRepository extends CrudRepository<FraudCheckComplete, Long> {

	List<FraudCheckComplete> findByDomesticPaymentId(String domesticPaymentId);

}
