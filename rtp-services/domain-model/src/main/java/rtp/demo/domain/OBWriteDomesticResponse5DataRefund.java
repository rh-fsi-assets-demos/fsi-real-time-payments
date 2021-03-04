package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteDomesticResponse5DataRefundAccount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unambiguous identification of the refund account to which a refund will be
 * made as a result of the transaction.
 */
//@ApiModel(description = "Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticResponse5DataRefund implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1644505703246761753L;
	@JsonProperty("Account")
	private OBWriteDomesticResponse5DataRefundAccount account = new OBWriteDomesticResponse5DataRefundAccount();

	public OBWriteDomesticResponse5DataRefund account(OBWriteDomesticResponse5DataRefundAccount account) {
		this.account = account;
		return this;
	}

	/**
	 * Get account
	 * 
	 * @return account
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Valid
	public OBWriteDomesticResponse5DataRefundAccount getAccount() {
		return account;
	}

	public void setAccount(OBWriteDomesticResponse5DataRefundAccount account) {
		this.account = account;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomesticResponse5DataRefund obWriteDomesticResponse5DataRefund = (OBWriteDomesticResponse5DataRefund) o;
		return Objects.equals(this.account, obWriteDomesticResponse5DataRefund.account);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticResponse5DataRefund {\n");

		sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
