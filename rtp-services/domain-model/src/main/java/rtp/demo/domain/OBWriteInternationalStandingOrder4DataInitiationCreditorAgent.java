package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBPostalAddress6;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalStandingOrder4DataInitiationCreditorAgent   {
  @JsonProperty("SchemeName")
  private String schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress = null;

  public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Get schemeName
   * @return schemeName
  **/
  @ApiModelProperty(value = "")
  
    public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of the servicing institution.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of the servicing institution.")
  
  @Size(min=1,max=35)   public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=140)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalStandingOrder4DataInitiationCreditorAgent obWriteInternationalStandingOrder4DataInitiationCreditorAgent = (OBWriteInternationalStandingOrder4DataInitiationCreditorAgent) o;
    return Objects.equals(this.schemeName, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.schemeName) &&
        Objects.equals(this.identification, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.identification) &&
        Objects.equals(this.name, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.name) &&
        Objects.equals(this.postalAddress, obWriteInternationalStandingOrder4DataInitiationCreditorAgent.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrder4DataInitiationCreditorAgent {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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
