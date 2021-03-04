package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.ValidationComplete;

public interface ValidationCompleteRepository extends CrudRepository<ValidationComplete, Long> {

	List<ValidationComplete> findByDomesticPaymentId(String domesticPaymentId);

}
