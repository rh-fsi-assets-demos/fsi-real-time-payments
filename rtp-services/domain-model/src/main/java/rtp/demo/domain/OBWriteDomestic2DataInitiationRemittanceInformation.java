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
 * Information supplied to enable the matching of an entry with the items that
 * the transfer is intended to settle, such as commercial invoices in an
 * accounts&#x27; receivable system.
 */
//@ApiModel(description = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.")
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomestic2DataInitiationRemittanceInformation {
	@JsonProperty("Unstructured")
	private String unstructured = null;

	@JsonProperty("Reference")
	private String reference = null;

	public OBWriteDomestic2DataInitiationRemittanceInformation unstructured(String unstructured) {
		this.unstructured = unstructured;
		return this;
	}

	/**
	 * Information supplied to enable the matching/reconciliation of an entry with
	 * the items that the payment is intended to settle, such as commercial invoices
	 * in an accounts' receivable system, in an unstructured form.
	 * 
	 * @return unstructured
	 **/
//	@ApiModelProperty(value = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.")
//
//	@Size(min = 1, max = 140)
	public String getUnstructured() {
		return unstructured;
	}

	public void setUnstructured(String unstructured) {
		this.unstructured = unstructured;
	}

	public OBWriteDomestic2DataInitiationRemittanceInformation reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * Unique reference, as assigned by the creditor, to unambiguously refer to the
	 * payment transaction. Usage: If available, the initiating party should provide
	 * this reference in the structured remittance information, to enable
	 * reconciliation by the creditor upon receipt of the amount of money. If the
	 * business context requires the use of a creditor reference or a payment remit
	 * identification, and only one identifier can be passed through the end-to-end
	 * chain, the creditor's reference or payment remittance identification should
	 * be quoted in the end-to-end transaction identification. OB: The Faster
	 * Payments Scheme can only accept 18 characters for the ReferenceInformation
	 * field - which is where this ISO field will be mapped.
	 * 
	 * @return reference
	 **/
//	@ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification. OB: The Faster Payments Scheme can only accept 18 characters for the ReferenceInformation field - which is where this ISO field will be mapped.")
//
//	@Size(min = 1, max = 35)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomestic2DataInitiationRemittanceInformation obWriteDomestic2DataInitiationRemittanceInformation = (OBWriteDomestic2DataInitiationRemittanceInformation) o;
		return Objects.equals(this.unstructured, obWriteDomestic2DataInitiationRemittanceInformation.unstructured)
				&& Objects.equals(this.reference, obWriteDomestic2DataInitiationRemittanceInformation.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(unstructured, reference);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomestic2DataInitiationRemittanceInformation {\n");

		sb.append("    unstructured: ").append(toIndentedString(unstructured)).append("\n");
		sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
