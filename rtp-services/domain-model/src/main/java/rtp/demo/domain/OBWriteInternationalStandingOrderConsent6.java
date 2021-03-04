package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBRisk1;
import rtp.demo.domain.OBWriteInternationalStandingOrderConsent6Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalStandingOrderConsent6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalStandingOrderConsent6   {
  @JsonProperty("Data")
  private OBWriteInternationalStandingOrderConsent6Data data = null;

  @JsonProperty("Risk")
  private OBRisk1 risk = null;

  public OBWriteInternationalStandingOrderConsent6 data(OBWriteInternationalStandingOrderConsent6Data data) {
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
    public OBWriteInternationalStandingOrderConsent6Data getData() {
    return data;
  }

  public void setData(OBWriteInternationalStandingOrderConsent6Data data) {
    this.data = data;
  }

  public OBWriteInternationalStandingOrderConsent6 risk(OBRisk1 risk) {
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
    OBWriteInternationalStandingOrderConsent6 obWriteInternationalStandingOrderConsent6 = (OBWriteInternationalStandingOrderConsent6) o;
    return Objects.equals(this.data, obWriteInternationalStandingOrderConsent6.data) &&
        Objects.equals(this.risk, obWriteInternationalStandingOrderConsent6.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrderConsent6 {\n");
    
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
