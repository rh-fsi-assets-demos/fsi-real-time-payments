package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteDomesticConsent4DataAuthorisation;
import rtp.demo.domain.OBWriteDomesticConsent4DataSCASupportData;
import rtp.demo.domain.OBWriteInternational3DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalConsent5Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalConsent5Data   {
  /**
   * Specifies to share the refund account details with PISP
   */
  public enum ReadRefundAccountEnum {
    NO("No"),
    
    YES("Yes");

    private String value;

    ReadRefundAccountEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReadRefundAccountEnum fromValue(String text) {
      for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("ReadRefundAccount")
  private ReadRefundAccountEnum readRefundAccount = null;

  @JsonProperty("Initiation")
  private OBWriteInternational3DataInitiation initiation = null;

  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

  public OBWriteInternationalConsent5Data readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
    return this;
  }

  /**
   * Specifies to share the refund account details with PISP
   * @return readRefundAccount
  **/
  @ApiModelProperty(value = "Specifies to share the refund account details with PISP")
  
    public ReadRefundAccountEnum getReadRefundAccount() {
    return readRefundAccount;
  }

  public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
  }

  public OBWriteInternationalConsent5Data initiation(OBWriteInternational3DataInitiation initiation) {
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
    public OBWriteInternational3DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternational3DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteInternationalConsent5Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
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

  public OBWriteInternationalConsent5Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
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
    OBWriteInternationalConsent5Data obWriteInternationalConsent5Data = (OBWriteInternationalConsent5Data) o;
    return Objects.equals(this.readRefundAccount, obWriteInternationalConsent5Data.readRefundAccount) &&
        Objects.equals(this.initiation, obWriteInternationalConsent5Data.initiation) &&
        Objects.equals(this.authorisation, obWriteInternationalConsent5Data.authorisation) &&
        Objects.equals(this.scASupportData, obWriteInternationalConsent5Data.scASupportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readRefundAccount, initiation, authorisation, scASupportData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalConsent5Data {\n");
    
    sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
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
