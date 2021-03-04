package rtp.demo.domain;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.Links;
import rtp.demo.domain.Meta;
import rtp.demo.domain.OBWriteDomesticResponse5Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticResponse5
 */
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticResponse5 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2649489985083637215L;

	@JsonProperty("Data")
	private OBWriteDomesticResponse5Data data = new OBWriteDomesticResponse5Data();

	@JsonProperty("Links")
	private Links links = new Links();

	@JsonProperty("Meta")
	private Meta meta = new Meta();

	public OBWriteDomesticResponse5 data(OBWriteDomesticResponse5Data data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Valid
	public OBWriteDomesticResponse5Data getData() {
		return data;
	}

	public void setData(OBWriteDomesticResponse5Data data) {
		this.data = data;
	}

	public OBWriteDomesticResponse5 links(Links links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public OBWriteDomesticResponse5 meta(Meta meta) {
		this.meta = meta;
		return this;
	}

	/**
	 * Get meta
	 * 
	 * @return meta
	 **/
//	@ApiModelProperty(value = "")
//
//	@Valid
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBWriteDomesticResponse5 obWriteDomesticResponse5 = (OBWriteDomesticResponse5) o;
		return Objects.equals(this.data, obWriteDomesticResponse5.data)
				&& Objects.equals(this.links, obWriteDomesticResponse5.links)
				&& Objects.equals(this.meta, obWriteDomesticResponse5.meta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, links, meta);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBWriteDomesticResponse5 {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
