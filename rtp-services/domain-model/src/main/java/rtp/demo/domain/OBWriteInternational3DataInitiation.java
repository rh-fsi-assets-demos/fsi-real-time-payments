package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBChargeBearerType1Code;
//import rtp.demo.domain.OBSupplementaryData1;
import rtp.demo.domain.OBWriteDomestic2DataInitiationCreditorAccount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationDebtorAccount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationInstructedAmount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationRemittanceInformation;
import rtp.demo.domain.OBWriteInternational3DataInitiationCreditor;
import rtp.demo.domain.OBWriteInternational3DataInitiationCreditorAgent;
import rtp.demo.domain.OBWriteInternational3DataInitiationExchangeRateInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is
 * used to request movement of funds from the debtor account to a creditor for a
 * single international payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternational3DataInitiation {
	@JsonProperty("InstructionIdentification")
	private String instructionIdentification = null;

	@JsonProperty("EndToEndIdentification")
	private String endToEndIdentification = null;

	@JsonProperty("LocalInstrument")
	private String localInstrument = null;

	/**
	 * Indicator of the urgency or order of importance that the instructing party
	 * would like the instructed party to apply to the processing of the
	 * instruction.
	 */
	public enum InstructionPriorityEnum {
		NORMAL("Normal"),

		URGENT("Urgent");

		private String value;

		InstructionPriorityEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static InstructionPriorityEnum fromValue(String text) {
			for (InstructionPriorityEnum b : InstructionPriorityEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("InstructionPriority")
	private InstructionPriorityEnum instructionPriority = null;

	@JsonProperty("Purpose")
	private String purpose = null;

	@JsonProperty("ExtendedPurpose")
	private String extendedPurpose = null;

	@JsonProperty("ChargeBearer")
	private OBChargeBearerType1Code chargeBearer = null;

	@JsonProperty("CurrencyOfTransfer")
	private String currencyOfTransfer = null;

	@JsonProperty("DestinationCountryCode")
	private String destinationCountryCode = null;

	@JsonProperty("InstructedAmount")
	private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

	@JsonProperty("ExchangeRateInformation")
	private OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation = null;

	@JsonProperty("DebtorAccount")
	private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

	@JsonProperty("Creditor")
	private OBWriteInternational3DataInitiationCreditor creditor = null;

	@JsonProperty("CreditorAgent")
	private OBWriteInternational3DataInitiationCreditorAgent creditorAgent = null;

	@JsonProperty("CreditorAccount")
	private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = null;

	@JsonProperty("RemittanceInformation")
	private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

//  @JsonProperty("SupplementaryData")
//  private OBSupplementaryData1 supplementaryData = null;

	public OBWriteInternational3DataInitiation instructionIdentification(String instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	/**
	 * Unique identification as assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction. Usage: the instruction
	 * identification is a point to point reference that can be used between the
	 * instructing party and the instructed party to refer to the individual
	 * instruction. It can be included in several messages related to the
	 * instruction.
	 * 
	 * @return instructionIdentification
	 **/
	@ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
	@NotNull

	@Size(min = 1, max = 35)
	public String getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(String instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	public OBWriteInternational3DataInitiation endToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
		return this;
	}

	/**
	 * Unique identification assigned by the initiating party to unambiguously
	 * identify the transaction. This identification is passed on, unchanged,
	 * throughout the entire end-to-end chain. Usage: The end-to-end identification
	 * can be used for reconciliation or to link tasks relating to the transaction.
	 * It can be included in several messages related to the transaction. OB: The
	 * Faster Payments Scheme can only access 31 characters for the
	 * EndToEndIdentification field.
	 * 
	 * @return endToEndIdentification
	 **/
	@ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
	@NotNull

	@Size(min = 1, max = 35)
	public String getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public OBWriteInternational3DataInitiation localInstrument(String localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}

	/**
	 * Get localInstrument
	 * 
	 * @return localInstrument
	 **/
	@ApiModelProperty(value = "")

	public String getLocalInstrument() {
		return localInstrument;
	}

	public void setLocalInstrument(String localInstrument) {
		this.localInstrument = localInstrument;
	}

	public OBWriteInternational3DataInitiation instructionPriority(InstructionPriorityEnum instructionPriority) {
		this.instructionPriority = instructionPriority;
		return this;
	}

	/**
	 * Indicator of the urgency or order of importance that the instructing party
	 * would like the instructed party to apply to the processing of the
	 * instruction.
	 * 
	 * @return instructionPriority
	 **/
	@ApiModelProperty(value = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.")

	public InstructionPriorityEnum getInstructionPriority() {
		return instructionPriority;
	}

	public void setInstructionPriority(InstructionPriorityEnum instructionPriority) {
		this.instructionPriority = instructionPriority;
	}

	public OBWriteInternational3DataInitiation purpose(String purpose) {
		this.purpose = purpose;
		return this;
	}

	/**
	 * Specifies the external purpose code in the format of character string with a
	 * maximum length of 4 characters. The list of valid codes is an external code
	 * list published separately. External code sets can be downloaded from
	 * www.iso20022.org.
	 * 
	 * @return purpose
	 **/
	@ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")

	@Size(min = 1, max = 4)
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public OBWriteInternational3DataInitiation extendedPurpose(String extendedPurpose) {
		this.extendedPurpose = extendedPurpose;
		return this;
	}

	/**
	 * Specifies the purpose of an international payment, when there is no
	 * corresponding 4 character code available in the ISO20022 list of Purpose
	 * Codes.
	 * 
	 * @return extendedPurpose
	 **/
	@ApiModelProperty(value = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.")

	@Size(min = 1, max = 140)
	public String getExtendedPurpose() {
		return extendedPurpose;
	}

	public void setExtendedPurpose(String extendedPurpose) {
		this.extendedPurpose = extendedPurpose;
	}

	public OBWriteInternational3DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	/**
	 * Get chargeBearer
	 * 
	 * @return chargeBearer
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public OBWriteInternational3DataInitiation currencyOfTransfer(String currencyOfTransfer) {
		this.currencyOfTransfer = currencyOfTransfer;
		return this;
	}

	/**
	 * Specifies the currency of the to be transferred amount, which is different
	 * from the currency of the debtor's account.
	 * 
	 * @return currencyOfTransfer
	 **/
	@ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
	@NotNull

	@Pattern(regexp = "^[A-Z]{3,3}$")
	public String getCurrencyOfTransfer() {
		return currencyOfTransfer;
	}

	public void setCurrencyOfTransfer(String currencyOfTransfer) {
		this.currencyOfTransfer = currencyOfTransfer;
	}

	public OBWriteInternational3DataInitiation destinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
		return this;
	}

	/**
	 * Country in which Credit Account is domiciled. Code to identify a country, a
	 * dependency, or another area of particular geopolitical interest, on the basis
	 * of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
	 * 
	 * @return destinationCountryCode
	 **/
	@ApiModelProperty(value = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).")

	@Pattern(regexp = "[A-Z]{2,2}")
	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}

	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}

	public OBWriteInternational3DataInitiation instructedAmount(
			OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	/**
	 * Get instructedAmount
	 * 
	 * @return instructedAmount
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public OBWriteInternational3DataInitiation exchangeRateInformation(
			OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
		return this;
	}

	/**
	 * Get exchangeRateInformation
	 * 
	 * @return exchangeRateInformation
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteInternational3DataInitiationExchangeRateInformation getExchangeRateInformation() {
		return exchangeRateInformation;
	}

	public void setExchangeRateInformation(
			OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
	}

	public OBWriteInternational3DataInitiation debtorAccount(
			OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	 * Get debtorAccount
	 * 
	 * @return debtorAccount
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public OBWriteInternational3DataInitiation creditor(OBWriteInternational3DataInitiationCreditor creditor) {
		this.creditor = creditor;
		return this;
	}

	/**
	 * Get creditor
	 * 
	 * @return creditor
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteInternational3DataInitiationCreditor getCreditor() {
		return creditor;
	}

	public void setCreditor(OBWriteInternational3DataInitiationCreditor creditor) {
		this.creditor = creditor;
	}

	public OBWriteInternational3DataInitiation creditorAgent(
			OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	/**
	 * Get creditorAgent
	 * 
	 * @return creditorAgent
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteInternational3DataInitiationCreditorAgent getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	public OBWriteInternational3DataInitiation creditorAccount(
			OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	/**
	 * Get creditorAccount
	 * 
	 * @return creditorAccount
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public OBWriteInternational3DataInitiation remittanceInformation(
			OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	/**
	 * Get remittanceInformation
	 * 
	 * @return remittanceInformation
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}

//	public OBWriteInternational3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
//		this.supplementaryData = supplementaryData;
//		return this;
//	}

	/**
	 * Get supplementaryData
	 * 
	 * @return supplementaryData
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
//	public OBSupplementaryData1 getSupplementaryData() {
//		return supplementaryData;
//	}
//
//	public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
//		this.supplementaryData = supplementaryData;
//	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteInternational3DataInitiation obWriteInternational3DataInitiation = (OBWriteInternational3DataInitiation) o;
		return Objects.equals(this.instructionIdentification,
				obWriteInternational3DataInitiation.instructionIdentification)
				&& Objects.equals(this.endToEndIdentification,
						obWriteInternational3DataInitiation.endToEndIdentification)
				&& Objects.equals(this.localInstrument, obWriteInternational3DataInitiation.localInstrument)
				&& Objects.equals(this.instructionPriority, obWriteInternational3DataInitiation.instructionPriority)
				&& Objects.equals(this.purpose, obWriteInternational3DataInitiation.purpose)
				&& Objects.equals(this.extendedPurpose, obWriteInternational3DataInitiation.extendedPurpose)
				&& Objects.equals(this.chargeBearer, obWriteInternational3DataInitiation.chargeBearer)
				&& Objects.equals(this.currencyOfTransfer, obWriteInternational3DataInitiation.currencyOfTransfer)
				&& Objects.equals(this.destinationCountryCode,
						obWriteInternational3DataInitiation.destinationCountryCode)
				&& Objects.equals(this.instructedAmount, obWriteInternational3DataInitiation.instructedAmount)
				&& Objects.equals(this.exchangeRateInformation,
						obWriteInternational3DataInitiation.exchangeRateInformation)
				&& Objects.equals(this.debtorAccount, obWriteInternational3DataInitiation.debtorAccount)
				&& Objects.equals(this.creditor, obWriteInternational3DataInitiation.creditor)
				&& Objects.equals(this.creditorAgent, obWriteInternational3DataInitiation.creditorAgent)
				&& Objects.equals(this.creditorAccount, obWriteInternational3DataInitiation.creditorAccount) && Objects
						.equals(this.remittanceInformation, obWriteInternational3DataInitiation.remittanceInformation);
		// && Objects.equals(this.supplementaryData,
		// obWriteInternational3DataInitiation.supplementaryData);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority,
				purpose, extendedPurpose, chargeBearer, currencyOfTransfer, destinationCountryCode, instructedAmount,
				exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount,
				remittanceInformation);// ,supplementaryData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteInternational3DataInitiation {\n");

		sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
		sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
		sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
		sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
		sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
		sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
		sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
		sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
		sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
		sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
		sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
		// sb.append(" supplementaryData:
		// ").append(toIndentedString(supplementaryData)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
