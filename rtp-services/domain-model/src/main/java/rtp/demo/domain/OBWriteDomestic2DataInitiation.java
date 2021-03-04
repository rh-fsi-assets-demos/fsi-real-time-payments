package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBPostalAddress6;
//import rtp.demo.domain.OBSupplementaryData1;
import rtp.demo.domain.OBWriteDomestic2DataInitiationCreditorAccount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationDebtorAccount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationInstructedAmount;
import rtp.demo.domain.OBWriteDomestic2DataInitiationRemittanceInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is
 * used to request movement of funds from the debtor account to a creditor for a
 * single domestic payment.
 */
//@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single domestic payment.")
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomestic2DataInitiation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9078625770511760909L;

	@JsonProperty("InstructionIdentification")
	private String instructionIdentification = null;

	@JsonProperty("EndToEndIdentification")
	private String endToEndIdentification = null;

	@JsonProperty("LocalInstrument")
	private String localInstrument = null;

	@JsonProperty("InstructedAmount")
	private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = new OBWriteDomestic2DataInitiationInstructedAmount();

	@JsonProperty("DebtorAccount")
	private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = new OBWriteDomestic2DataInitiationDebtorAccount();

	@JsonProperty("CreditorAccount")
	private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = new OBWriteDomestic2DataInitiationCreditorAccount();

	@JsonProperty("CreditorPostalAddress")
	private OBPostalAddress6 creditorPostalAddress = new OBPostalAddress6();

	@JsonProperty("RemittanceInformation")
	private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = new OBWriteDomestic2DataInitiationRemittanceInformation();

//	@JsonProperty("SupplementaryData")
//	private OBSupplementaryData1 supplementaryData = new OBSupplementaryData1();

	public OBWriteDomestic2DataInitiation instructionIdentification(String instructionIdentification) {
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
//	@ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
//	@NotNull
//
//	@Size(min = 1, max = 35)
	public String getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(String instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	public OBWriteDomestic2DataInitiation endToEndIdentification(String endToEndIdentification) {
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
//	@ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
//	@NotNull
//
//	@Size(min = 1, max = 35)
	public String getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public OBWriteDomestic2DataInitiation localInstrument(String localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}

	/**
	 * Get localInstrument
	 * 
	 * @return localInstrument
	 **/
//	@ApiModelProperty(value = "")

	public String getLocalInstrument() {
		return localInstrument;
	}

	public void setLocalInstrument(String localInstrument) {
		this.localInstrument = localInstrument;
	}

	public OBWriteDomestic2DataInitiation instructedAmount(
			OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	/**
	 * Get instructedAmount
	 * 
	 * @return instructedAmount
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Valid
	public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public OBWriteDomestic2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	 * Get debtorAccount
	 * 
	 * @return debtorAccount
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
	public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public OBWriteDomestic2DataInitiation creditorAccount(
			OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	/**
	 * Get creditorAccount
	 * 
	 * @return creditorAccount
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Valid
	public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public OBWriteDomestic2DataInitiation creditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
		this.creditorPostalAddress = creditorPostalAddress;
		return this;
	}

	/**
	 * Get creditorPostalAddress
	 * 
	 * @return creditorPostalAddress
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
	public OBPostalAddress6 getCreditorPostalAddress() {
		return creditorPostalAddress;
	}

	public void setCreditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
		this.creditorPostalAddress = creditorPostalAddress;
	}

	public OBWriteDomestic2DataInitiation remittanceInformation(
			OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	/**
	 * Get remittanceInformation
	 * 
	 * @return remittanceInformation
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
	public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}

//	public OBWriteDomestic2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
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
		OBWriteDomestic2DataInitiation obWriteDomestic2DataInitiation = (OBWriteDomestic2DataInitiation) o;
		return Objects.equals(this.instructionIdentification, obWriteDomestic2DataInitiation.instructionIdentification)
				&& Objects.equals(this.endToEndIdentification, obWriteDomestic2DataInitiation.endToEndIdentification)
				&& Objects.equals(this.localInstrument, obWriteDomestic2DataInitiation.localInstrument)
				&& Objects.equals(this.instructedAmount, obWriteDomestic2DataInitiation.instructedAmount)
				&& Objects.equals(this.debtorAccount, obWriteDomestic2DataInitiation.debtorAccount)
				&& Objects.equals(this.creditorAccount, obWriteDomestic2DataInitiation.creditorAccount)
				&& Objects.equals(this.creditorPostalAddress, obWriteDomestic2DataInitiation.creditorPostalAddress)
				&& Objects.equals(this.remittanceInformation, obWriteDomestic2DataInitiation.remittanceInformation);
		// && Objects.equals(this.supplementaryData,
		// obWriteDomestic2DataInitiation.supplementaryData);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructedAmount,
				debtorAccount, creditorAccount, creditorPostalAddress, remittanceInformation);// , supplementaryData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomestic2DataInitiation {\n");

		sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
		sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
		sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
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
