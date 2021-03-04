package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteInternationalStandingOrder4DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalStandingOrder4Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalStandingOrder4Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalStandingOrder4DataInitiation initiation = null;

  public OBWriteInternationalStandingOrder4Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
      @NotNull

  @Size(min=1,max=128)   public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteInternationalStandingOrder4Data initiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBWriteInternationalStandingOrder4DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
    this.initiation = initiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalStandingOrder4Data obWriteInternationalStandingOrder4Data = (OBWriteInternationalStandingOrder4Data) o;
    return Objects.equals(this.consentId, obWriteInternationalStandingOrder4Data.consentId) &&
        Objects.equals(this.initiation, obWriteInternationalStandingOrder4Data.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrder4Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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
