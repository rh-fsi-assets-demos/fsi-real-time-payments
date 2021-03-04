package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.account.Links;
import rtp.demo.domain.account.Meta;
import rtp.demo.domain.account.OBReadDataTransaction6;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadTransaction6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBReadTransaction6 {
	@JsonProperty("Data")
	private OBReadDataTransaction6 data = new OBReadDataTransaction6();

	@JsonProperty("Links")
	private Links links = null;

	@JsonProperty("Meta")
	private Meta meta = null;

	public OBReadTransaction6 data(OBReadDataTransaction6 data) {
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
	public OBReadDataTransaction6 getData() {
		return data;
	}

	public void setData(OBReadDataTransaction6 data) {
		this.data = data;
	}

	public OBReadTransaction6 links(Links links) {
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

	public OBReadTransaction6 meta(Meta meta) {
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
		OBReadTransaction6 obReadTransaction6 = (OBReadTransaction6) o;
		return Objects.equals(this.data, obReadTransaction6.data)
				&& Objects.equals(this.links, obReadTransaction6.links)
				&& Objects.equals(this.meta, obReadTransaction6.meta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, links, meta);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBReadTransaction6 {\n");

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
