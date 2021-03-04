package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBActiveOrHistoricCurrencyAndAmount;
import rtp.demo.domain.OBChargeBearerType1Code;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a charge for the payment
 * initiation.
 */

//@ApiModel(description = "Set of elements used to provide details of a charge for the payment initiation.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticConsentResponse5DataCharges implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5726456644633518467L;

	@JsonProperty("ChargeBearer")
	private OBChargeBearerType1Code chargeBearer = null;

	@JsonProperty("Type")
	private String type = null;

	@JsonProperty("Amount")
	private OBActiveOrHistoricCurrencyAndAmount amount = null;

	public OBWriteDomesticConsentResponse5DataCharges chargeBearer(OBChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	/**
	 * Get chargeBearer
	 * 
	 * @return chargeBearer
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public OBWriteDomesticConsentResponse5DataCharges type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OBWriteDomesticConsentResponse5DataCharges amount(OBActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomesticConsentResponse5DataCharges obWriteDomesticConsentResponse5DataCharges = (OBWriteDomesticConsentResponse5DataCharges) o;
		return Objects.equals(this.chargeBearer, obWriteDomesticConsentResponse5DataCharges.chargeBearer)
				&& Objects.equals(this.type, obWriteDomesticConsentResponse5DataCharges.type)
				&& Objects.equals(this.amount, obWriteDomesticConsentResponse5DataCharges.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chargeBearer, type, amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticConsentResponse5DataCharges {\n");

		sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
