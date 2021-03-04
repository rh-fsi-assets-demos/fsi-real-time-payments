package rtp.demo.domain.account;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	private static final long serialVersionUID = 2937912282607738347L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, unique = true)
	private BigInteger id;
	@Column(name = "ACCOUNT_ID", unique = true, nullable = true, length = 256)
	String accountId;
	@Column(name = "ACCOUNT_HOLDER_ID", unique = false, nullable = true, length = 256)
	String accountHolderId;
	@Column(name = "STATUS", unique = false, nullable = true, length = 256)
	String status;
	@JsonIgnore
	@Column(name = "STATUS_UPDATE_DATE_TIME", unique = false, nullable = true)
	LocalDateTime statusUpdateDateTime = LocalDateTime.now();
	@Column(name = "CURRENCY", unique = false, nullable = true, length = 256)
	String currency;
	@Column(name = "ACCOUNT_TYPE", unique = false, nullable = true, length = 256)
	String accountType;
	@Column(name = "ACCOUNT_SUBTYPE", unique = false, nullable = true, length = 256)
	String accountSubType;
	@Column(name = "DESCRIPTION", unique = false, nullable = true, length = 256)
	String description;
	@Column(name = "NICKNAME", unique = false, nullable = true, length = 256)
	String nickname;
	@JsonIgnore
	@Column(name = "OPENING_DATE", unique = false, nullable = true)
	LocalDate openingDate = LocalDate.now();
	@JsonIgnore
	@Column(name = "MATURITY_DATE", unique = false, nullable = true)
	LocalDate maturityDate = LocalDate.now().plusYears(1l);
	@Column(name = "ACCOUNT_SCHEME_NAME", unique = false, nullable = true, length = 256)
	String accountSchemeName;
	@Column(name = "ACCOUNT_IDENTIFICATION", unique = false, nullable = true, length = 256)
	String accountIdentification;
	@Column(name = "ACCOUNT_NAME", unique = false, nullable = true, length = 256)
	String accountName;
	@Column(name = "ACCOUNT_SECONDARY_IDENTIFICATION", unique = false, nullable = true, length = 256)
	String accountSecondaryIdentification;
	@Column(name = "SERVICER_SCHEME_NAME", unique = false, nullable = true, length = 256)
	String servicerSchemeName;
	@Column(name = "SERVICER_IDENTIFICATION", unique = false, nullable = true, length = 256)
	String servicerIdentification;
	@Column(name = "BALANCE_CREDIT_DEBIT_INDICATOR", unique = false, nullable = true, length = 256)
	String balanceCreditDebitIndicator;
	@Column(name = "BALANCE_TYPE", unique = false, nullable = true, length = 256)
	String balanceType;
	@Column(name = "BALANCE_AMOUNT", unique = false, nullable = true, length = 256)
	String balanceAmount;
	@Column(name = "BALANCE_CURRENCY", unique = false, nullable = true, length = 256)
	String balanceCurrency;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderId() {
		return accountHolderId;
	}

	public void setAccountHolderId(String accountHolderId) {
		this.accountHolderId = accountHolderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getStatusUpdateDateTime() {
		return statusUpdateDateTime;
	}

	public void setStatusUpdateDateTime(LocalDateTime statusUpdateDateTime) {
		this.statusUpdateDateTime = statusUpdateDateTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountSubType() {
		return accountSubType;
	}

	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getAccountSchemeName() {
		return accountSchemeName;
	}

	public void setAccountSchemeName(String accountSchemeName) {
		this.accountSchemeName = accountSchemeName;
	}

	public String getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(String accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountSecondaryIdentification() {
		return accountSecondaryIdentification;
	}

	public void setAccountSecondaryIdentification(String accountSecondaryIdentification) {
		this.accountSecondaryIdentification = accountSecondaryIdentification;
	}

	public String getServicerSchemeName() {
		return servicerSchemeName;
	}

	public void setServicerSchemeName(String servicerSchemeName) {
		this.servicerSchemeName = servicerSchemeName;
	}

	public String getServicerIdentification() {
		return servicerIdentification;
	}

	public void setServicerIdentification(String servicerIdentification) {
		this.servicerIdentification = servicerIdentification;
	}

	public String getBalanceCreditDebitIndicator() {
		return balanceCreditDebitIndicator;
	}

	public void setBalanceCreditDebitIndicator(String balanceCreditDebitIndicator) {
		this.balanceCreditDebitIndicator = balanceCreditDebitIndicator;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	public String getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getBalanceCurrency() {
		return balanceCurrency;
	}

	public void setBalanceCurrency(String balanceCurrency) {
		this.balanceCurrency = balanceCurrency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolderId == null) ? 0 : accountHolderId.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((accountIdentification == null) ? 0 : accountIdentification.hashCode());
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountSchemeName == null) ? 0 : accountSchemeName.hashCode());
		result = prime * result
				+ ((accountSecondaryIdentification == null) ? 0 : accountSecondaryIdentification.hashCode());
		result = prime * result + ((accountSubType == null) ? 0 : accountSubType.hashCode());
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((balanceAmount == null) ? 0 : balanceAmount.hashCode());
		result = prime * result + ((balanceCreditDebitIndicator == null) ? 0 : balanceCreditDebitIndicator.hashCode());
		result = prime * result + ((balanceCurrency == null) ? 0 : balanceCurrency.hashCode());
		result = prime * result + ((balanceType == null) ? 0 : balanceType.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((openingDate == null) ? 0 : openingDate.hashCode());
		result = prime * result + ((servicerIdentification == null) ? 0 : servicerIdentification.hashCode());
		result = prime * result + ((servicerSchemeName == null) ? 0 : servicerSchemeName.hashCode());
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
		Account other = (Account) obj;
		if (accountHolderId == null) {
			if (other.accountHolderId != null)
				return false;
		} else if (!accountHolderId.equals(other.accountHolderId))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (accountIdentification == null) {
			if (other.accountIdentification != null)
				return false;
		} else if (!accountIdentification.equals(other.accountIdentification))
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountSchemeName == null) {
			if (other.accountSchemeName != null)
				return false;
		} else if (!accountSchemeName.equals(other.accountSchemeName))
			return false;
		if (accountSecondaryIdentification == null) {
			if (other.accountSecondaryIdentification != null)
				return false;
		} else if (!accountSecondaryIdentification.equals(other.accountSecondaryIdentification))
			return false;
		if (accountSubType == null) {
			if (other.accountSubType != null)
				return false;
		} else if (!accountSubType.equals(other.accountSubType))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (balanceAmount == null) {
			if (other.balanceAmount != null)
				return false;
		} else if (!balanceAmount.equals(other.balanceAmount))
			return false;
		if (balanceCreditDebitIndicator == null) {
			if (other.balanceCreditDebitIndicator != null)
				return false;
		} else if (!balanceCreditDebitIndicator.equals(other.balanceCreditDebitIndicator))
			return false;
		if (balanceCurrency == null) {
			if (other.balanceCurrency != null)
				return false;
		} else if (!balanceCurrency.equals(other.balanceCurrency))
			return false;
		if (balanceType == null) {
			if (other.balanceType != null)
				return false;
		} else if (!balanceType.equals(other.balanceType))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (openingDate == null) {
			if (other.openingDate != null)
				return false;
		} else if (!openingDate.equals(other.openingDate))
			return false;
		if (servicerIdentification == null) {
			if (other.servicerIdentification != null)
				return false;
		} else if (!servicerIdentification.equals(other.servicerIdentification))
			return false;
		if (servicerSchemeName == null) {
			if (other.servicerSchemeName != null)
				return false;
		} else if (!servicerSchemeName.equals(other.servicerSchemeName))
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
		return "Account [id=" + id + ", accountId=" + accountId + ", accountHolderId=" + accountHolderId + ", status="
				+ status + ", statusUpdateDateTime=" + statusUpdateDateTime + ", currency=" + currency
				+ ", accountType=" + accountType + ", accountSubType=" + accountSubType + ", description=" + description
				+ ", nickname=" + nickname + ", openingDate=" + openingDate + ", maturityDate=" + maturityDate
				+ ", accountSchemeName=" + accountSchemeName + ", accountIdentification=" + accountIdentification
				+ ", accountName=" + accountName + ", accountSecondaryIdentification=" + accountSecondaryIdentification
				+ ", servicerSchemeName=" + servicerSchemeName + ", servicerIdentification=" + servicerIdentification
				+ ", balanceCreditDebitIndicator=" + balanceCreditDebitIndicator + ", balanceType=" + balanceType
				+ ", balanceAmount=" + balanceAmount + ", balanceCurrency=" + balanceCurrency + "]";
	}

}
