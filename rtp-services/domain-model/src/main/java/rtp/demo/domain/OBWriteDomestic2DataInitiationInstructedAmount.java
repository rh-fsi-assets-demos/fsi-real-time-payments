package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Amount of money to be moved between the debtor and creditor, before deduction
 * of charges, expressed in the currency as ordered by the initiating party.
 * Usage: This amount has to be transported unchanged through the transaction
 * chain.
 */
//@ApiModel(description = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. Usage: This amount has to be transported unchanged through the transaction chain.")
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomestic2DataInitiationInstructedAmount {
	@JsonProperty("Amount")
	private String amount = null;

	@JsonProperty("Currency")
	private String currency = null;

	public OBWriteDomestic2DataInitiationInstructedAmount amount(String amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull

	// @Pattern(regexp="^\d{1,13}$|^\d{1,13}\.\d{1,5}$")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public OBWriteDomestic2DataInitiationInstructedAmount currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Pattern(regexp = "^[A-Z]{3,3}$")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomestic2DataInitiationInstructedAmount obWriteDomestic2DataInitiationInstructedAmount = (OBWriteDomestic2DataInitiationInstructedAmount) o;
		return Objects.equals(this.amount, obWriteDomestic2DataInitiationInstructedAmount.amount)
				&& Objects.equals(this.currency, obWriteDomestic2DataInitiationInstructedAmount.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomestic2DataInitiationInstructedAmount {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
