package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.account.Links;
import rtp.demo.domain.account.Meta;
import rtp.demo.domain.account.OBReadAccount5Data;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadAccount5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBReadAccount5 {

	@JsonProperty("Data")
	private OBReadAccount5Data data = new OBReadAccount5Data();;

	@JsonProperty("Links")
	private Links links = null;

	@JsonProperty("Meta")
	private Meta meta = null;

	public OBReadAccount5 data(OBReadAccount5Data data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public OBReadAccount5Data getData() {
		return data;
	}

	public void setData(OBReadAccount5Data data) {
		this.data = data;
	}

	public OBReadAccount5 links(Links links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public OBReadAccount5 meta(Meta meta) {
		this.meta = meta;
		return this;
	}

	/**
	 * Get meta
	 * 
	 * @return meta
	 **/
	@ApiModelProperty(value = "")

	@Valid
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
		OBReadAccount5 obReadAccount5 = (OBReadAccount5) o;
		return Objects.equals(this.data, obReadAccount5.data) && Objects.equals(this.links, obReadAccount5.links)
				&& Objects.equals(this.meta, obReadAccount5.meta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, links, meta);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBReadAccount5 {\n");

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
