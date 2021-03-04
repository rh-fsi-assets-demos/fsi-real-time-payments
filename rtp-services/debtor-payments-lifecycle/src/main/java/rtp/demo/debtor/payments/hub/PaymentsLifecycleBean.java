package rtp.demo.debtor.payments.hub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rtp.demo.domain.payment.Payment;
import rtp.demo.payment.repository.PaymentRepository;

import rtp.demo.payment.repository.*;
import rtp.demo.domain.payment.*;

import rtp.demo.payment.repository.FraudCheckCompleteRepository;

public class PaymentsLifecycleBean {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private ValidationCompleteRepository validationCompleteRepository;
	@Autowired
	private FraudCheckCompleteRepository fraudCheckCompleteRepository;
	@Autowired
	private AmlCheckCompleteRepository amlCheckCompleteRepository;
	@Autowired
	private CoreBankingCompleteRepository coreBankingCompleteRepository;
	@Autowired
	private PaymentNetworkSentRepository paymentNetworkSentRepository;
	@Autowired
	private PaymentNetworkConfirmedRepository paymentNetworkConfirmedRepository;
//	@Autowired
//	private PaymentAuditCompleteRepository paymentAuditCompleteRepository;

	public Payment addStatusFormatValidation(Payment payment) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusFormatValidation payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {

			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",format_validation_complete");
				paymentRepository.save(payment);

				ValidationComplete validationComplete = new ValidationComplete();
				validationComplete.setDomesticPaymentID(payment.getDomesticPaymentId());
				validationCompleteRepository.save(validationComplete);
			}
		}

		return payment;
	}

	public Payment addStatusFraudCheck(Payment payment) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusFraudCheck payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {

			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",fraud_check_complete");
				paymentRepository.save(payment);

				FraudCheckComplete fraudCheckComplete = new FraudCheckComplete();
				fraudCheckComplete.setDomesticPaymentID(payment.getDomesticPaymentId());
				fraudCheckCompleteRepository.save(fraudCheckComplete);
			}
		}

		return payment;
	}

	public Payment addStatusAmlCheck(Payment payment) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusAmlCheck payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {

			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",aml_check_complete");
				paymentRepository.save(payment);

				AmlCheckComplete amlCheckComplete = new AmlCheckComplete();
				amlCheckComplete.setDomesticPaymentID(payment.getDomesticPaymentId());
				amlCheckCompleteRepository.save(amlCheckComplete);
			}
		}

		return payment;
	}

	public Payment addStatusCoreBanking(Payment payment) {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusCoreBanking payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {
			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",core_banking_complete");
				paymentRepository.save(payment);

				CoreBankingComplete CoreBankingComplete = new CoreBankingComplete();

				CoreBankingComplete.setDomesticPaymentID(payment.getDomesticPaymentId());
				coreBankingCompleteRepository.save(CoreBankingComplete);
			}
		}

		return payment;
	}

	public Payment addStatusNetworkSent(Payment payment) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusNetworkSent payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {
			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",payment_network_sent");
				paymentRepository.save(payment);

				PaymentNetworkSent paymentNetworkSent = new PaymentNetworkSent();
				paymentNetworkSent.setDomesticPaymentID(payment.getDomesticPaymentId());
				paymentNetworkSentRepository.save(paymentNetworkSent);
			}
		}

		return payment;
	}

	public Payment addStatusNetworkConfirmation(Payment payment) {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("addStatusNetworkConfirmation payment: " + payment);

		if (payment != null && payment.getDomesticPaymentId() != null) {
			List<Payment> payments = paymentRepository.findByDomesticPaymentId(payment.getDomesticPaymentId());

			if (!payments.isEmpty()) {
				Payment retrievedPayment = payments.get(0);
				payment.setStatus(retrievedPayment.getStatus() + ",payment_network_confirmed");
				paymentRepository.save(payment);

				PaymentNetworkConfirmed paymentNetworkConfirmed = new PaymentNetworkConfirmed();
				paymentNetworkConfirmed.setDomesticPaymentID(payment.getDomesticPaymentId());
				paymentNetworkConfirmedRepository.save(paymentNetworkConfirmed);
			}
		}

		return payment;
	}
}
