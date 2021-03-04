package rtp.demo.debtor.domain.rtp.validation;

import java.util.Set;

import rtp.demo.domain.payment.Payment;

public class PaymentValidationRequest {

	private Payment payment;
	private Set<PaymentValidationError> paymentValidationErrors;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Set<PaymentValidationError> getPaymentValidationErrors() {
		return paymentValidationErrors;
	}

	public void setPaymentValidationErrors(Set<PaymentValidationError> paymentValidationErrors) {
		this.paymentValidationErrors = paymentValidationErrors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((paymentValidationErrors == null) ? 0 : paymentValidationErrors.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentValidationRequest other = (PaymentValidationRequest) obj;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (paymentValidationErrors == null) {
			if (other.paymentValidationErrors != null)
				return false;
		} else if (!paymentValidationErrors.equals(other.paymentValidationErrors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentValidationRequest [payment=" + payment + ", paymentValidationErrors=" + paymentValidationErrors
				+ "]";
	}

}
