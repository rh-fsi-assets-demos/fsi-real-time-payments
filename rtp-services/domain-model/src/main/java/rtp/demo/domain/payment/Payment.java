package rtp.demo.domain.payment;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PAYMENT")
public class Payment implements Serializable {

	private static final long serialVersionUID = 6320977454651634641L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, unique = true)
	private BigInteger id;
	@Column(name = "DOMESTIC_PAYMENT_ID", unique = true, nullable = true, length = 256)
	private String domesticPaymentId;
	@Column(name = "CONSENT_ID", unique = false, nullable = true, length = 256)
	private String consentId;
	@Column(name = "STATUS", unique = false, nullable = true, length = 256)
	private String status;
	@JsonIgnore
	@Transient
	@Column(name = "CREATION_DATE_TIME", unique = false, nullable = true, length = 256)
	private LocalDateTime creationDateTime = LocalDateTime.now();
	@JsonIgnore
	@Transient
	@Column(name = "STATUS_UPDATE_DATE_TIME", unique = false, nullable = true, length = 256)
	private LocalDateTime statusUpdateDateTime = LocalDateTime.now();

	@Column(name = "REFUND_ACCOUNT_SCHEME_NAME", unique = false, nullable = true, length = 256)
	private String refundAccountSchemeName;
	@Column(name = "REFUND_ACCOUNT_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String refundAccountIdentification;
	@Column(name = "REFUND_ACCOUNT_NAME", unique = false, nullable = true, length = 256)
	private String refundAccountName;

	@Column(name = "INITIATION_INSTRUCTION_IDENTIICATION", unique = false, nullable = true, length = 256)
	private String initiationInstructionIdentification;
	@Column(name = "INITIATION_END_TO_END_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String initiationEndToEndIdentification;
	@Column(name = "INITIATION_INSTRUCTED_AMOUNT", unique = false, nullable = true, length = 256)
	private String initiatiionInstructedAmount;
	@Column(name = "INITIATION_INSTRUCTED_CURRENCY", unique = false, nullable = true, length = 256)
	private String initiatiionInstructedCurrency;

	@Column(name = "DEBTOR_ACCOUNT_SCHEME_NAME", unique = false, nullable = true, length = 256)
	private String debtorAccountSchemeName;
	@Column(name = "DEBTOR_ACCOUNT_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String debtorAccountIndentification;
	@Column(name = "DEBTOR_ACCOUNT_NAME", unique = false, nullable = true, length = 256)
	private String debtorAccountName;
	@Column(name = "DEBTOR_ACCOUNT_SECONDARY_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String debtorAccountSecondaryIdentification;

	@Column(name = "CREDITOR_ACCOUNT_SCHEME_NAME", unique = false, nullable = true, length = 256)
	private String creditorAccountSchemeName;
	@Column(name = "CREDITOR_ACCOUNT_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String creditorAccountIndentification;
	@Column(name = "CREDITOR_ACCOUNT_NAME", unique = false, nullable = true, length = 256)
	private String creditorAccountName;
	@Column(name = "CREDITOR_ACCOUNT_SECONDARY_IDENTIFICATION", unique = false, nullable = true, length = 256)
	private String creditorAccountSecondaryIdentification;

	@Column(name = "REMITTANCE_INFORMATION_REFERENCE", unique = false, nullable = true, length = 256)
	private String remittanceInformationReference;
	@Column(name = "REMITTANCE_INFORMATION_UNSTRUCTURED", unique = false, nullable = true, length = 256)
	private String remittanceInformationUnstructured;

	public Payment(Payment payment1, Payment payment2, String status) {
		this.id = payment1.getId();
		this.domesticPaymentId = payment1.getDomesticPaymentId();
		this.status = status;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDomesticPaymentId() {
		return domesticPaymentId;
	}

	public void setDomesticPaymentId(String domesticPaymentId) {
		this.domesticPaymentId = domesticPaymentId;
	}

	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public LocalDateTime getStatusUpdateDateTime() {
		return statusUpdateDateTime;
	}

	public void setStatusUpdateDateTime(LocalDateTime statusUpdateDateTime) {
		this.statusUpdateDateTime = statusUpdateDateTime;
	}

	public String getRefundAccountSchemeName() {
		return refundAccountSchemeName;
	}

	public void setRefundAccountSchemeName(String refundAccountSchemeName) {
		this.refundAccountSchemeName = refundAccountSchemeName;
	}

	public String getRefundAccountIdentification() {
		return refundAccountIdentification;
	}

	public void setRefundAccountIdentification(String refundAccountIdentification) {
		this.refundAccountIdentification = refundAccountIdentification;
	}

	public String getRefundAccountName() {
		return refundAccountName;
	}

	public void setRefundAccountName(String refundAccountName) {
		this.refundAccountName = refundAccountName;
	}

	public String getInitiationInstructionIdentification() {
		return initiationInstructionIdentification;
	}

	public void setInitiationInstructionIdentification(String initiationInstructionIdentification) {
		this.initiationInstructionIdentification = initiationInstructionIdentification;
	}

	public String getInitiationEndToEndIdentification() {
		return initiationEndToEndIdentification;
	}

	public void setInitiationEndToEndIdentification(String initiationEndToEndIdentification) {
		this.initiationEndToEndIdentification = initiationEndToEndIdentification;
	}

	public String getInitiatiionInstructedAmount() {
		return initiatiionInstructedAmount;
	}

	public void setInitiatiionInstructedAmount(String initiatiionInstructedAmount) {
		this.initiatiionInstructedAmount = initiatiionInstructedAmount;
	}

	public String getInitiatiionInstructedCurrency() {
		return initiatiionInstructedCurrency;
	}

	public void setInitiatiionInstructedCurrency(String initiatiionInstructedCurrency) {
		this.initiatiionInstructedCurrency = initiatiionInstructedCurrency;
	}

	public String getDebtorAccountSchemeName() {
		return debtorAccountSchemeName;
	}

	public void setDebtorAccountSchemeName(String debtorAccountSchemeName) {
		this.debtorAccountSchemeName = debtorAccountSchemeName;
	}

	public String getDebtorAccountIndentification() {
		return debtorAccountIndentification;
	}

	public void setDebtorAccountIndentification(String debtorAccountIndentification) {
		this.debtorAccountIndentification = debtorAccountIndentification;
	}

	public String getDebtorAccountName() {
		return debtorAccountName;
	}

	public void setDebtorAccountName(String debtorAccountName) {
		this.debtorAccountName = debtorAccountName;
	}

	public String getDebtorAccountSecondaryIdentification() {
		return debtorAccountSecondaryIdentification;
	}

	public void setDebtorAccountSecondaryIdentification(String debtorAccountSecondaryIdentification) {
		this.debtorAccountSecondaryIdentification = debtorAccountSecondaryIdentification;
	}

	public String getCreditorAccountSchemeName() {
		return creditorAccountSchemeName;
	}

	public void setCreditorAccountSchemeName(String creditorAccountSchemeName) {
		this.creditorAccountSchemeName = creditorAccountSchemeName;
	}

	public String getCreditorAccountIndentification() {
		return creditorAccountIndentification;
	}

	public void setCreditorAccountIndentification(String creditorAccountIndentification) {
		this.creditorAccountIndentification = creditorAccountIndentification;
	}

	public String getCreditorAccountName() {
		return creditorAccountName;
	}

	public void setCreditorAccountName(String creditorAccountName) {
		this.creditorAccountName = creditorAccountName;
	}

	public String getCreditorAccountSecondaryIdentification() {
		return creditorAccountSecondaryIdentification;
	}

	public void setCreditorAccountSecondaryIdentification(String creditorAccountSecondaryIdentification) {
		this.creditorAccountSecondaryIdentification = creditorAccountSecondaryIdentification;
	}

	public String getRemittanceInformationReference() {
		return remittanceInformationReference;
	}

	public void setRemittanceInformationReference(String remittanceInformationReference) {
		this.remittanceInformationReference = remittanceInformationReference;
	}

	public String getRemittanceInformationUnstructured() {
		return remittanceInformationUnstructured;
	}

	public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
		this.remittanceInformationUnstructured = remittanceInformationUnstructured;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consentId == null) ? 0 : consentId.hashCode());
		result = prime * result + ((creationDateTime == null) ? 0 : creationDateTime.hashCode());
		result = prime * result
				+ ((creditorAccountIndentification == null) ? 0 : creditorAccountIndentification.hashCode());
		result = prime * result + ((creditorAccountName == null) ? 0 : creditorAccountName.hashCode());
		result = prime * result + ((creditorAccountSchemeName == null) ? 0 : creditorAccountSchemeName.hashCode());
		result = prime * result + ((creditorAccountSecondaryIdentification == null) ? 0
				: creditorAccountSecondaryIdentification.hashCode());
		result = prime * result
				+ ((debtorAccountIndentification == null) ? 0 : debtorAccountIndentification.hashCode());
		result = prime * result + ((debtorAccountName == null) ? 0 : debtorAccountName.hashCode());
		result = prime * result + ((debtorAccountSchemeName == null) ? 0 : debtorAccountSchemeName.hashCode());
		result = prime * result + ((debtorAccountSecondaryIdentification == null) ? 0
				: debtorAccountSecondaryIdentification.hashCode());
		result = prime * result + ((domesticPaymentId == null) ? 0 : domesticPaymentId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((initiatiionInstructedAmount == null) ? 0 : initiatiionInstructedAmount.hashCode());
		result = prime * result
				+ ((initiatiionInstructedCurrency == null) ? 0 : initiatiionInstructedCurrency.hashCode());
		result = prime * result
				+ ((initiationEndToEndIdentification == null) ? 0 : initiationEndToEndIdentification.hashCode());
		result = prime * result
				+ ((initiationInstructionIdentification == null) ? 0 : initiationInstructionIdentification.hashCode());
		result = prime * result + ((refundAccountIdentification == null) ? 0 : refundAccountIdentification.hashCode());
		result = prime * result + ((refundAccountName == null) ? 0 : refundAccountName.hashCode());
		result = prime * result + ((refundAccountSchemeName == null) ? 0 : refundAccountSchemeName.hashCode());
		result = prime * result
				+ ((remittanceInformationReference == null) ? 0 : remittanceInformationReference.hashCode());
		result = prime * result
				+ ((remittanceInformationUnstructured == null) ? 0 : remittanceInformationUnstructured.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusUpdateDateTime == null) ? 0 : statusUpdateDateTime.hashCode());
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
		Payment other = (Payment) obj;
		if (consentId == null) {
			if (other.consentId != null)
				return false;
		} else if (!consentId.equals(other.consentId))
			return false;
		if (creationDateTime == null) {
			if (other.creationDateTime != null)
				return false;
		} else if (!creationDateTime.equals(other.creationDateTime))
			return false;
		if (creditorAccountIndentification == null) {
			if (other.creditorAccountIndentification != null)
				return false;
		} else if (!creditorAccountIndentification.equals(other.creditorAccountIndentification))
			return false;
		if (creditorAccountName == null) {
			if (other.creditorAccountName != null)
				return false;
		} else if (!creditorAccountName.equals(other.creditorAccountName))
			return false;
		if (creditorAccountSchemeName == null) {
			if (other.creditorAccountSchemeName != null)
				return false;
		} else if (!creditorAccountSchemeName.equals(other.creditorAccountSchemeName))
			return false;
		if (creditorAccountSecondaryIdentification == null) {
			if (other.creditorAccountSecondaryIdentification != null)
				return false;
		} else if (!creditorAccountSecondaryIdentification.equals(other.creditorAccountSecondaryIdentification))
			return false;
		if (debtorAccountIndentification == null) {
			if (other.debtorAccountIndentification != null)
				return false;
		} else if (!debtorAccountIndentification.equals(other.debtorAccountIndentification))
			return false;
		if (debtorAccountName == null) {
			if (other.debtorAccountName != null)
				return false;
		} else if (!debtorAccountName.equals(other.debtorAccountName))
			return false;
		if (debtorAccountSchemeName == null) {
			if (other.debtorAccountSchemeName != null)
				return false;
		} else if (!debtorAccountSchemeName.equals(other.debtorAccountSchemeName))
			return false;
		if (debtorAccountSecondaryIdentification == null) {
			if (other.debtorAccountSecondaryIdentification != null)
				return false;
		} else if (!debtorAccountSecondaryIdentification.equals(other.debtorAccountSecondaryIdentification))
			return false;
		if (domesticPaymentId == null) {
			if (other.domesticPaymentId != null)
				return false;
		} else if (!domesticPaymentId.equals(other.domesticPaymentId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (initiatiionInstructedAmount == null) {
			if (other.initiatiionInstructedAmount != null)
				return false;
		} else if (!initiatiionInstructedAmount.equals(other.initiatiionInstructedAmount))
			return false;
		if (initiatiionInstructedCurrency == null) {
			if (other.initiatiionInstructedCurrency != null)
				return false;
		} else if (!initiatiionInstructedCurrency.equals(other.initiatiionInstructedCurrency))
			return false;
		if (initiationEndToEndIdentification == null) {
			if (other.initiationEndToEndIdentification != null)
				return false;
		} else if (!initiationEndToEndIdentification.equals(other.initiationEndToEndIdentification))
			return false;
		if (initiationInstructionIdentification == null) {
			if (other.initiationInstructionIdentification != null)
				return false;
		} else if (!initiationInstructionIdentification.equals(other.initiationInstructionIdentification))
			return false;
		if (refundAccountIdentification == null) {
			if (other.refundAccountIdentification != null)
				return false;
		} else if (!refundAccountIdentification.equals(other.refundAccountIdentification))
			return false;
		if (refundAccountName == null) {
			if (other.refundAccountName != null)
				return false;
		} else if (!refundAccountName.equals(other.refundAccountName))
			return false;
		if (refundAccountSchemeName == null) {
			if (other.refundAccountSchemeName != null)
				return false;
		} else if (!refundAccountSchemeName.equals(other.refundAccountSchemeName))
			return false;
		if (remittanceInformationReference == null) {
			if (other.remittanceInformationReference != null)
				return false;
		} else if (!remittanceInformationReference.equals(other.remittanceInformationReference))
			return false;
		if (remittanceInformationUnstructured == null) {
			if (other.remittanceInformationUnstructured != null)
				return false;
		} else if (!remittanceInformationUnstructured.equals(other.remittanceInformationUnstructured))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusUpdateDateTime == null) {
			if (other.statusUpdateDateTime != null)
				return false;
		} else if (!statusUpdateDateTime.equals(other.statusUpdateDateTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", domesticPaymentId=" + domesticPaymentId + ", consentId=" + consentId
				+ ", status=" + status + ", creationDateTime=" + creationDateTime + ", statusUpdateDateTime="
				+ statusUpdateDateTime + ", refundAccountSchemeName=" + refundAccountSchemeName
				+ ", refundAccountIdentification=" + refundAccountIdentification + ", refundAccountName="
				+ refundAccountName + ", initiationInstructionIdentification=" + initiationInstructionIdentification
				+ ", initiationEndToEndIdentification=" + initiationEndToEndIdentification
				+ ", initiatiionInstructedAmount=" + initiatiionInstructedAmount + ", initiatiionInstructedCurrency="
				+ initiatiionInstructedCurrency + ", debtorAccountSchemeName=" + debtorAccountSchemeName
				+ ", debtorAccountIndentification=" + debtorAccountIndentification + ", debtorAccountName="
				+ debtorAccountName + ", debtorAccountSecondaryIdentification=" + debtorAccountSecondaryIdentification
				+ ", creditorAccountSchemeName=" + creditorAccountSchemeName + ", creditorAccountIndentification="
				+ creditorAccountIndentification + ", creditorAccountName=" + creditorAccountName
				+ ", creditorAccountSecondaryIdentification=" + creditorAccountSecondaryIdentification
				+ ", remittanceInformationReference=" + remittanceInformationReference
				+ ", remittanceInformationUnstructured=" + remittanceInformationUnstructured + "]";
	}

}
