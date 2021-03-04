package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.payment.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

	List<Payment> findByDomesticPaymentId(String domesticPaymentId);

	List<Payment> findByDebtorAccountIndentification(String debtorAccountIndentification);

	List<Payment> findByCreditorAccountIndentification(String creditorAccountIndentification);

}