package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteDomesticConsent4DataAuthorisation;
import rtp.demo.domain.OBWriteDomesticConsent4DataSCASupportData;
import rtp.demo.domain.OBWriteFile2DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteFileConsent3Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteFileConsent3Data   {
  @JsonProperty("Initiation")
  private OBWriteFile2DataInitiation initiation = null;

  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

  public OBWriteFileConsent3Data initiation(OBWriteFile2DataInitiation initiation) {
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
    public OBWriteFile2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteFile2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteFileConsent3Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteFileConsent3Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }

  /**
   * Get scASupportData
   * @return scASupportData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticConsent4DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteFileConsent3Data obWriteFileConsent3Data = (OBWriteFileConsent3Data) o;
    return Objects.equals(this.initiation, obWriteFileConsent3Data.initiation) &&
        Objects.equals(this.authorisation, obWriteFileConsent3Data.authorisation) &&
        Objects.equals(this.scASupportData, obWriteFileConsent3Data.scASupportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiation, authorisation, scASupportData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFileConsent3Data {\n");
    
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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
