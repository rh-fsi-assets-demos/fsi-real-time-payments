package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides the details to identify an account.
 */
//@ApiModel(description = "Provides the details to identify an account.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticResponse5DataRefundAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7308107643381737680L;

	@JsonProperty("SchemeName")
	private String schemeName = null;

	@JsonProperty("Identification")
	private String identification = null;

	@JsonProperty("Name")
	private String name = null;

	@JsonProperty("SecondaryIdentification")
	private String secondaryIdentification = null;

	public OBWriteDomesticResponse5DataRefundAccount schemeName(String schemeName) {
		this.schemeName = schemeName;
		return this;
	}

	/**
	 * Get schemeName
	 * 
	 * @return schemeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public OBWriteDomesticResponse5DataRefundAccount identification(String identification) {
		this.identification = identification;
		return this;
	}

	/**
	 * Get identification
	 * 
	 * @return identification
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Size(min = 1, max = 256)
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public OBWriteDomesticResponse5DataRefundAccount name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the account, as assigned by the account servicing institution. Usage:
	 * The account name is the name or names of the account owner(s) represented at
	 * an account level. The account name is not the product name or the nickname of
	 * the account. OB: ASPSPs may carry out name validation for Confirmation of
	 * Payee, but it is not mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(required = true, value = "Name of the account, as assigned by the account servicing institution. Usage: The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.")
	@NotNull

	@Size(min = 1, max = 70)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OBWriteDomesticResponse5DataRefundAccount secondaryIdentification(String secondaryIdentification) {
		this.secondaryIdentification = secondaryIdentification;
		return this;
	}

	/**
	 * Get secondaryIdentification
	 * 
	 * @return secondaryIdentification
	 **/
	@ApiModelProperty(value = "")

	@Size(min = 1, max = 34)
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
		OBWriteDomesticResponse5DataRefundAccount obWriteDomesticResponse5DataRefundAccount = (OBWriteDomesticResponse5DataRefundAccount) o;
		return Objects.equals(this.schemeName, obWriteDomesticResponse5DataRefundAccount.schemeName)
				&& Objects.equals(this.identification, obWriteDomesticResponse5DataRefundAccount.identification)
				&& Objects.equals(this.name, obWriteDomesticResponse5DataRefundAccount.name)
				&& Objects.equals(this.secondaryIdentification,
						obWriteDomesticResponse5DataRefundAccount.secondaryIdentification);
	}

	@Override
	public int hashCode() {
		return Objects.hash(schemeName, identification, name, secondaryIdentification);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticResponse5DataRefundAccount {\n");

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
