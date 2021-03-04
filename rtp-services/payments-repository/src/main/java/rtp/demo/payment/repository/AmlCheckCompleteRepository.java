package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.AmlCheckComplete;

public interface AmlCheckCompleteRepository extends CrudRepository<AmlCheckComplete, Long> {

	List<AmlCheckComplete> findByDomesticPaymentId(String domesticPaymentId);

}
