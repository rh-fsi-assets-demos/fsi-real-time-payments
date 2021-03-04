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
 * Set of elements used to identify a person or an organisation.
 */
//@ApiModel(description = "Set of elements used to identify a person or an organisation.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBDebtorIdentification1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6018722557371019102L;
	@JsonProperty("Name")
	private String name = null;

	public OBDebtorIdentification1 name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The account name is the name or names of the account owner(s) represented at
	 * an account level, as displayed by the ASPSP's online channels. Note, the
	 * account name is not the product name or the nickname of the account.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.")

	@Size(max = 140)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBDebtorIdentification1 obDebtorIdentification1 = (OBDebtorIdentification1) o;
		return Objects.equals(this.name, obDebtorIdentification1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBDebtorIdentification1 {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
