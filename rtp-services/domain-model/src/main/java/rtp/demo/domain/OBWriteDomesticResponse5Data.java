package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import rtp.demo.domain.OBDebtorIdentification1;
import rtp.demo.domain.OBWriteDomestic2DataInitiation;
import rtp.demo.domain.OBWriteDomesticConsentResponse5DataCharges;
import rtp.demo.domain.OBWriteDomesticResponse5DataMultiAuthorisation;
import rtp.demo.domain.OBWriteDomesticResponse5DataRefund;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticResponse5Data
 */
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticResponse5Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8109974920376727001L;

	@JsonProperty("DomesticPaymentId")
	private String domesticPaymentId = null;

	@JsonProperty("ConsentId")
	private String consentId = null;

	@JsonProperty("CreationDateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private OffsetDateTime creationDateTime = null;

	/**
	 * Specifies the status of the payment information group.
	 */
	public enum StatusEnum {
		ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),

		ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),

		ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),

		ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),

		PENDING("Pending"),

		REJECTED("Rejected");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("Status")
	private StatusEnum status = null;

	@JsonProperty("StatusUpdateDateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private OffsetDateTime statusUpdateDateTime = null;

	@JsonProperty("ExpectedExecutionDateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private OffsetDateTime expectedExecutionDateTime = null;

	@JsonProperty("ExpectedSettlementDateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private OffsetDateTime expectedSettlementDateTime = null;

	@JsonProperty("Refund")
	private OBWriteDomesticResponse5DataRefund refund = new OBWriteDomesticResponse5DataRefund();

	@JsonProperty("Charges")
	@Valid
	private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

	@JsonProperty("Initiation")
	private OBWriteDomestic2DataInitiation initiation = new OBWriteDomestic2DataInitiation();

	@JsonProperty("MultiAuthorisation")
	private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation = new OBWriteDomesticResponse5DataMultiAuthorisation();

	@JsonProperty("Debtor")
	private OBDebtorIdentification1 debtor = new OBDebtorIdentification1();

	public OBWriteDomesticResponse5Data domesticPaymentId(String domesticPaymentId) {
		this.domesticPaymentId = domesticPaymentId;
		return this;
	}

	/**
	 * OB: Unique identification as assigned by the ASPSP to uniquely identify the
	 * domestic payment resource.
	 * 
	 * @return domesticPaymentId
	 **/
//	@ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.")
//	@NotNull
//
//	@Size(min = 1, max = 40)
	public String getDomesticPaymentId() {
		return domesticPaymentId;
	}

	public void setDomesticPaymentId(String domesticPaymentId) {
		this.domesticPaymentId = domesticPaymentId;
	}

	public OBWriteDomesticResponse5Data consentId(String consentId) {
		this.consentId = consentId;
		return this;
	}

	/**
	 * OB: Unique identification as assigned by the ASPSP to uniquely identify the
	 * consent resource.
	 * 
	 * @return consentId
	 **/
	@ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
	@NotNull

	@Size(min = 1, max = 128)
	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public OBWriteDomesticResponse5Data creationDateTime(OffsetDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	/**
	 * Date and time at which the message was created.All dates in the JSON payloads
	 * are represented in ISO 8601 date-time format. All date-time fields in
	 * responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return creationDateTime
	 **/
	@ApiModelProperty(required = true, value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
	@NotNull

	@Valid
	public OffsetDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(OffsetDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public OBWriteDomesticResponse5Data status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Specifies the status of the payment information group.
	 * 
	 * @return status
	 **/
	@ApiModelProperty(required = true, value = "Specifies the status of the payment information group.")
	@NotNull

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public OBWriteDomesticResponse5Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
		this.statusUpdateDateTime = statusUpdateDateTime;
		return this;
	}

	/**
	 * Date and time at which the resource status was updated.All dates in the JSON
	 * payloads are represented in ISO 8601 date-time format. All date-time fields
	 * in responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return statusUpdateDateTime
	 **/
	@ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
	@NotNull

	@Valid
	public OffsetDateTime getStatusUpdateDateTime() {
		return statusUpdateDateTime;
	}

	public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
		this.statusUpdateDateTime = statusUpdateDateTime;
	}

	public OBWriteDomesticResponse5Data expectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
		this.expectedExecutionDateTime = expectedExecutionDateTime;
		return this;
	}

	/**
	 * Expected execution date and time for the payment resource.All dates in the
	 * JSON payloads are represented in ISO 8601 date-time format. All date-time
	 * fields in responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return expectedExecutionDateTime
	 **/
	@ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

	@Valid
	public OffsetDateTime getExpectedExecutionDateTime() {
		return expectedExecutionDateTime;
	}

	public void setExpectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
		this.expectedExecutionDateTime = expectedExecutionDateTime;
	}

	public OBWriteDomesticResponse5Data expectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
		this.expectedSettlementDateTime = expectedSettlementDateTime;
		return this;
	}

	/**
	 * Expected settlement date and time for the payment resource.All dates in the
	 * JSON payloads are represented in ISO 8601 date-time format. All date-time
	 * fields in responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return expectedSettlementDateTime
	 **/
	@ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

	@Valid
	public OffsetDateTime getExpectedSettlementDateTime() {
		return expectedSettlementDateTime;
	}

	public void setExpectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
		this.expectedSettlementDateTime = expectedSettlementDateTime;
	}

	public OBWriteDomesticResponse5Data refund(OBWriteDomesticResponse5DataRefund refund) {
		this.refund = refund;
		return this;
	}

	/**
	 * Get refund
	 * 
	 * @return refund
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteDomesticResponse5DataRefund getRefund() {
		return refund;
	}

	public void setRefund(OBWriteDomesticResponse5DataRefund refund) {
		this.refund = refund;
	}

	public OBWriteDomesticResponse5Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
		this.charges = charges;
		return this;
	}

	public OBWriteDomesticResponse5Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
		if (this.charges == null) {
			this.charges = new ArrayList<OBWriteDomesticConsentResponse5DataCharges>();
		}
		this.charges.add(chargesItem);
		return this;
	}

	/**
	 * Get charges
	 * 
	 * @return charges
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public List<OBWriteDomesticConsentResponse5DataCharges> getCharges() {
		return charges;
	}

	public void setCharges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
		this.charges = charges;
	}

	public OBWriteDomesticResponse5Data initiation(OBWriteDomestic2DataInitiation initiation) {
		this.initiation = initiation;
		return this;
	}

	/**
	 * Get initiation
	 * 
	 * @return initiation
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBWriteDomestic2DataInitiation getInitiation() {
		return initiation;
	}

	public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
		this.initiation = initiation;
	}

	public OBWriteDomesticResponse5Data multiAuthorisation(
			OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
		this.multiAuthorisation = multiAuthorisation;
		return this;
	}

	/**
	 * Get multiAuthorisation
	 * 
	 * @return multiAuthorisation
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBWriteDomesticResponse5DataMultiAuthorisation getMultiAuthorisation() {
		return multiAuthorisation;
	}

	public void setMultiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
		this.multiAuthorisation = multiAuthorisation;
	}

	public OBWriteDomesticResponse5Data debtor(OBDebtorIdentification1 debtor) {
		this.debtor = debtor;
		return this;
	}

	/**
	 * Get debtor
	 * 
	 * @return debtor
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OBDebtorIdentification1 getDebtor() {
		return debtor;
	}

	public void setDebtor(OBDebtorIdentification1 debtor) {
		this.debtor = debtor;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomesticResponse5Data obWriteDomesticResponse5Data = (OBWriteDomesticResponse5Data) o;
		return Objects.equals(this.domesticPaymentId, obWriteDomesticResponse5Data.domesticPaymentId)
				&& Objects.equals(this.consentId, obWriteDomesticResponse5Data.consentId)
				&& Objects.equals(this.creationDateTime, obWriteDomesticResponse5Data.creationDateTime)
				&& Objects.equals(this.status, obWriteDomesticResponse5Data.status)
				&& Objects.equals(this.statusUpdateDateTime, obWriteDomesticResponse5Data.statusUpdateDateTime)
				&& Objects.equals(this.expectedExecutionDateTime,
						obWriteDomesticResponse5Data.expectedExecutionDateTime)
				&& Objects.equals(this.expectedSettlementDateTime,
						obWriteDomesticResponse5Data.expectedSettlementDateTime)
				&& Objects.equals(this.refund, obWriteDomesticResponse5Data.refund)
				&& Objects.equals(this.charges, obWriteDomesticResponse5Data.charges)
				&& Objects.equals(this.initiation, obWriteDomesticResponse5Data.initiation)
				&& Objects.equals(this.multiAuthorisation, obWriteDomesticResponse5Data.multiAuthorisation)
				&& Objects.equals(this.debtor, obWriteDomesticResponse5Data.debtor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(domesticPaymentId, consentId, creationDateTime, status, statusUpdateDateTime,
				expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, initiation, multiAuthorisation,
				debtor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticResponse5Data {\n");

		sb.append("    domesticPaymentId: ").append(toIndentedString(domesticPaymentId)).append("\n");
		sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
		sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
		sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
		sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
		sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
		sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
		sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
		sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
		sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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
