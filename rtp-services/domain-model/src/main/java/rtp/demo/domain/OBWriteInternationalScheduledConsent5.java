package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBRisk1;
import rtp.demo.domain.OBWriteInternationalScheduledConsent5Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalScheduledConsent5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalScheduledConsent5   {
  @JsonProperty("Data")
  private OBWriteInternationalScheduledConsent5Data data = null;

  @JsonProperty("Risk")
  private OBRisk1 risk = null;

  public OBWriteInternationalScheduledConsent5 data(OBWriteInternationalScheduledConsent5Data data) {
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
    public OBWriteInternationalScheduledConsent5Data getData() {
    return data;
  }

  public void setData(OBWriteInternationalScheduledConsent5Data data) {
    this.data = data;
  }

  public OBWriteInternationalScheduledConsent5 risk(OBRisk1 risk) {
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
    OBWriteInternationalScheduledConsent5 obWriteInternationalScheduledConsent5 = (OBWriteInternationalScheduledConsent5) o;
    return Objects.equals(this.data, obWriteInternationalScheduledConsent5.data) &&
        Objects.equals(this.risk, obWriteInternationalScheduledConsent5.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalScheduledConsent5 {\n");
    
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
