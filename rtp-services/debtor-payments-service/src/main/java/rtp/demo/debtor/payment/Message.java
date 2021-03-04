package rtp.demo.debtor.payment;

import java.util.ArrayList;
import java.util.List;

import rtp.demo.domain.payment.Payment;

public class Message {

	private List<Payment> payments = new ArrayList<Payment>();

	public Message() {
	}

	public Message(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
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
		Message other = (Message) obj;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [payments=" + payments + "]";
	}

}