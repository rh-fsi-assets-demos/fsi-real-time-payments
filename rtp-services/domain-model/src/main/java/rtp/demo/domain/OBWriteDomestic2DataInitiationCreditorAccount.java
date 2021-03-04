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
 * Unambiguous identification of the account of the creditor to which a credit
 * entry will be posted as a result of the payment transaction.
 */
//@ApiModel(description = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.")
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomestic2DataInitiationCreditorAccount {
	@JsonProperty("SchemeName")
	private String schemeName = null;

	@JsonProperty("Identification")
	private String identification = null;

	@JsonProperty("Name")
	private String name = null;

	@JsonProperty("SecondaryIdentification")
	private String secondaryIdentification = null;

	public OBWriteDomestic2DataInitiationCreditorAccount schemeName(String schemeName) {
		this.schemeName = schemeName;
		return this;
	}

	/**
	 * Get schemeName
	 * 
	 * @return schemeName
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public OBWriteDomestic2DataInitiationCreditorAccount identification(String identification) {
		this.identification = identification;
		return this;
	}

	/**
	 * Get identification
	 * 
	 * @return identification
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Size(min = 1, max = 256)
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public OBWriteDomestic2DataInitiationCreditorAccount name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The account name is the name or names of the account owner(s) represented at
	 * an account level. Note, the account name is not the product name or the
	 * nickname of the account. OB: ASPSPs may carry out name validation for
	 * Confirmation of Payee, but it is not mandatory.
	 * 
	 * @return name
	 **/
//	@ApiModelProperty(required = true, value = "The account name is the name or names of the account owner(s) represented at an account level. Note, the account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.")
//	@NotNull
//
//	@Size(min = 1, max = 70)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OBWriteDomestic2DataInitiationCreditorAccount secondaryIdentification(String secondaryIdentification) {
		this.secondaryIdentification = secondaryIdentification;
		return this;
	}

	/**
	 * Get secondaryIdentification
	 * 
	 * @return secondaryIdentification
	 **/
//	@ApiModelProperty(value = "")
//
//	@Size(min = 1, max = 34)
	public String getSecondaryIdentification() {
		return secondaryIdentification;
	}

	public void setSecondaryIdentification(String secondaryIdentification) {
		this.secondaryIdentification = secondaryIdentification;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomestic2DataInitiationCreditorAccount obWriteDomestic2DataInitiationCreditorAccount = (OBWriteDomestic2DataInitiationCreditorAccount) o;
		return Objects.equals(this.schemeName, obWriteDomestic2DataInitiationCreditorAccount.schemeName)
				&& Objects.equals(this.identification, obWriteDomestic2DataInitiationCreditorAccount.identification)
				&& Objects.equals(this.name, obWriteDomestic2DataInitiationCreditorAccount.name)
				&& Objects.equals(this.secondaryIdentification,
						obWriteDomestic2DataInitiationCreditorAccount.secondaryIdentification);
	}

	@Override
	public int hashCode() {
		return Objects.hash(schemeName, identification, name, secondaryIdentification);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomestic2DataInitiationCreditorAccount {\n");

		sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
		sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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
