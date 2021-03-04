package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The multiple authorisation flow response from the ASPSP.
 */
//@ApiModel(description = "The multiple authorisation flow response from the ASPSP.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticResponse5DataMultiAuthorisation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1885944395664619638L;

	/**
	 * Specifies the status of the authorisation flow in code form.
	 */
	public enum StatusEnum {
		AUTHORISED("Authorised"),

		AWAITINGFURTHERAUTHORISATION("AwaitingFurtherAuthorisation"),

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

	@JsonProperty("NumberRequired")
	private Integer numberRequired = null;

	@JsonProperty("NumberReceived")
	private Integer numberReceived = null;

	@JsonProperty("LastUpdateDateTime")
	private OffsetDateTime lastUpdateDateTime = null;

	@JsonProperty("ExpirationDateTime")
	private OffsetDateTime expirationDateTime = null;

	public OBWriteDomesticResponse5DataMultiAuthorisation status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Specifies the status of the authorisation flow in code form.
	 * 
	 * @return status
	 **/
	@ApiModelProperty(required = true, value = "Specifies the status of the authorisation flow in code form.")
	@NotNull

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public OBWriteDomesticResponse5DataMultiAuthorisation numberRequired(Integer numberRequired) {
		this.numberRequired = numberRequired;
		return this;
	}

	/**
	 * Number of authorisations required for payment order (total required at the
	 * start of the multi authorisation journey).
	 * 
	 * @return numberRequired
	 **/
	@ApiModelProperty(value = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")

	public Integer getNumberRequired() {
		return numberRequired;
	}

	public void setNumberRequired(Integer numberRequired) {
		this.numberRequired = numberRequired;
	}

	public OBWriteDomesticResponse5DataMultiAuthorisation numberReceived(Integer numberReceived) {
		this.numberReceived = numberReceived;
		return this;
	}

	/**
	 * Number of authorisations received.
	 * 
	 * @return numberReceived
	 **/
	@ApiModelProperty(value = "Number of authorisations received.")

	public Integer getNumberReceived() {
		return numberReceived;
	}

	public void setNumberReceived(Integer numberReceived) {
		this.numberReceived = numberReceived;
	}

	public OBWriteDomesticResponse5DataMultiAuthorisation lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
		return this;
	}

	/**
	 * Last date and time at the authorisation flow was updated.All dates in the
	 * JSON payloads are represented in ISO 8601 date-time format. All date-time
	 * fields in responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return lastUpdateDateTime
	 **/
	@ApiModelProperty(value = "Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

	@Valid
	public OffsetDateTime getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}

	public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}

	public OBWriteDomesticResponse5DataMultiAuthorisation expirationDateTime(OffsetDateTime expirationDateTime) {
		this.expirationDateTime = expirationDateTime;
		return this;
	}

	/**
	 * Date and time at which the requested authorisation flow must be completed.All
	 * dates in the JSON payloads are represented in ISO 8601 date-time format. All
	 * date-time fields in responses must include the timezone. An example is below:
	 * 2017-04-05T10:43:07+00:00
	 * 
	 * @return expirationDateTime
	 **/
	@ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

	@Valid
	public OffsetDateTime getExpirationDateTime() {
		return expirationDateTime;
	}

	public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
		this.expirationDateTime = expirationDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomesticResponse5DataMultiAuthorisation obWriteDomesticResponse5DataMultiAuthorisation = (OBWriteDomesticResponse5DataMultiAuthorisation) o;
		return Objects.equals(this.status, obWriteDomesticResponse5DataMultiAuthorisation.status)
				&& Objects.equals(this.numberRequired, obWriteDomesticResponse5DataMultiAuthorisation.numberRequired)
				&& Objects.equals(this.numberReceived, obWriteDomesticResponse5DataMultiAuthorisation.numberReceived)
				&& Objects.equals(this.lastUpdateDateTime,
						obWriteDomesticResponse5DataMultiAuthorisation.lastUpdateDateTime)
				&& Objects.equals(this.expirationDateTime,
						obWriteDomesticResponse5DataMultiAuthorisation.expirationDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, numberRequired, numberReceived, lastUpdateDateTime, expirationDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticResponse5DataMultiAuthorisation {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
		sb.append("    numberReceived: ").append(toIndentedString(numberReceived)).append("\n");
		sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
		sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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
