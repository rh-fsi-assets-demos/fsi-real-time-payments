package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.account.OBAccount6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadAccount5Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBReadAccount5Data {
	@JsonProperty("Account")
	@Valid
	private List<OBAccount6> account = new ArrayList<OBAccount6>();

	public OBReadAccount5Data account(List<OBAccount6> account) {
		this.account = account;
		return this;
	}

	public OBReadAccount5Data addAccountItem(OBAccount6 accountItem) {
		if (this.account == null) {
			this.account = new ArrayList<OBAccount6>();
		}
		this.account.add(accountItem);
		return this;
	}

	/**
	 * Get account
	 * 
	 * @return account
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public List<OBAccount6> getAccount() {
		return account;
	}

	public void setAccount(List<OBAccount6> account) {
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
		OBReadAccount5Data obReadAccount5Data = (OBReadAccount5Data) o;
		return Objects.equals(this.account, obReadAccount5Data.account);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBReadAccount5Data {\n");

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
