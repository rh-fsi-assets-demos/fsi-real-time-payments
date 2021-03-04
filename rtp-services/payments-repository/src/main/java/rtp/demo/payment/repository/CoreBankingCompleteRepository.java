package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.CoreBankingComplete;

public interface CoreBankingCompleteRepository extends CrudRepository<CoreBankingComplete, Long> {

	List<CoreBankingComplete> findByDomesticPaymentId(String domesticPaymentId);

}
