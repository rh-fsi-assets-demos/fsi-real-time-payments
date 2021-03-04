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
 * Set of elements used to identify a person or an organisation.
 */
@ApiModel(description = "Set of elements used to identify a person or an organisation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalResponse5DataRefundCreditor   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress = null;

  public OBWriteInternationalResponse5DataRefundCreditor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
  **/
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")
  
  @Size(min=1,max=140)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteInternationalResponse5DataRefundCreditor postalAddress(OBPostalAddress6 postalAddress) {
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
    OBWriteInternationalResponse5DataRefundCreditor obWriteInternationalResponse5DataRefundCreditor = (OBWriteInternationalResponse5DataRefundCreditor) o;
    return Objects.equals(this.name, obWriteInternationalResponse5DataRefundCreditor.name) &&
        Objects.equals(this.postalAddress, obWriteInternationalResponse5DataRefundCreditor.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalResponse5DataRefundCreditor {\n");
    
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
