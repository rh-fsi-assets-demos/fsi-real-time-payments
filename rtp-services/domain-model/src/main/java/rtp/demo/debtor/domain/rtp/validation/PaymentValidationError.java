package rtp.demo.debtor.domain.rtp.validation;

public class PaymentValidationError {

	private String errorMessage;
	private PaymentValidationErrorCode errorCode;

	public PaymentValidationError() {
	}

	public PaymentValidationError(String errorCode, String errorMessage) {
		super();
		this.errorCode = PaymentValidationErrorCode.fromString(errorCode);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public PaymentValidationErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(PaymentValidationErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
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
		PaymentValidationError other = (PaymentValidationError) obj;
		if (errorCode != other.errorCode)
			return false;
		if (errorMessage == null) {
			if (other.errorMessage != null)
				return false;
		} else if (!errorMessage.equals(other.errorMessage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentValidationError [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}

}
