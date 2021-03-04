package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.account.OBReadConsent1Data;
import rtp.demo.domain.account.OBRisk2;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadConsent1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBReadConsent1   {
  @JsonProperty("Data")
  private OBReadConsent1Data data = null;

  @JsonProperty("Risk")
  private OBRisk2 risk = null;

  public OBReadConsent1 data(OBReadConsent1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBReadConsent1Data getData() {
    return data;
  }

  public void setData(OBReadConsent1Data data) {
    this.data = data;
  }

  public OBReadConsent1 risk(OBRisk2 risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBRisk2 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk2 risk) {
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
    OBReadConsent1 obReadConsent1 = (OBReadConsent1) o;
    return Objects.equals(this.data, obReadConsent1.data) &&
        Objects.equals(this.risk, obReadConsent1.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1 {\n");
    
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
