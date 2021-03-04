package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBRisk1;
import rtp.demo.domain.OBWriteDomestic2Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomestic2
 */
//@Validated
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomestic2 {
	@JsonProperty("Data")
	private OBWriteDomestic2Data data = null;

	@JsonProperty("Risk")
	private OBRisk1 risk = null;

	public OBWriteDomestic2 data(OBWriteDomestic2Data data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
//  @ApiModelProperty(required = true, value = "")
//      @NotNull
//
//    @Valid
	public OBWriteDomestic2Data getData() {
		return data;
	}

	public void setData(OBWriteDomestic2Data data) {
		this.data = data;
	}

	public OBWriteDomestic2 risk(OBRisk1 risk) {
		this.risk = risk;
		return this;
	}

	/**
	 * Get risk
	 * 
	 * @return risk
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Valid
	public OBRisk1 getRisk() {
		return risk;
	}

	public void setRisk(OBRisk1 risk) {
		this.risk = risk;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomestic2 obWriteDomestic2 = (OBWriteDomestic2) o;
		return Objects.equals(this.data, obWriteDomestic2.data) && Objects.equals(this.risk, obWriteDomestic2.risk);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, risk);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomestic2 {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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
