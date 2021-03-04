package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import rtp.demo.domain.OBDebtorIdentification1;
import rtp.demo.domain.OBWriteDomestic2DataInitiation;
import rtp.demo.domain.OBWriteDomesticConsent4DataAuthorisation;
import rtp.demo.domain.OBWriteDomesticConsent4DataSCASupportData;
import rtp.demo.domain.OBWriteDomesticConsentResponse5DataCharges;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticConsentResponse5Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticConsentResponse5Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  /**
   * Specifies the status of consent resource in code form.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    CONSUMED("Consumed"),
    
    REJECTED("Rejected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("StatusUpdateDateTime")
  private OffsetDateTime statusUpdateDateTime = null;

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

  @JsonProperty("CutOffDateTime")
  private OffsetDateTime cutOffDateTime = null;

  @JsonProperty("ExpectedExecutionDateTime")
  private OffsetDateTime expectedExecutionDateTime = null;

  @JsonProperty("ExpectedSettlementDateTime")
  private OffsetDateTime expectedSettlementDateTime = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

  @JsonProperty("Initiation")
  private OBWriteDomestic2DataInitiation initiation = null;

  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

  @JsonProperty("Debtor")
  private OBDebtorIdentification1 debtor = null;

  public OBWriteDomesticConsentResponse5Data consentId(String consentId) {
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

  public OBWriteDomesticConsentResponse5Data creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDomesticConsentResponse5Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteDomesticConsentResponse5Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
      @NotNull

    @Valid
    public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWriteDomesticConsentResponse5Data readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
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

  public OBWriteDomesticConsentResponse5Data cutOffDateTime(OffsetDateTime cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
    return this;
  }

  /**
   * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return cutOffDateTime
  **/
  @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getCutOffDateTime() {
    return cutOffDateTime;
  }

  public void setCutOffDateTime(OffsetDateTime cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
  }

  public OBWriteDomesticConsentResponse5Data expectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
    return this;
  }

  /**
   * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedExecutionDateTime
  **/
  @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getExpectedExecutionDateTime() {
    return expectedExecutionDateTime;
  }

  public void setExpectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
  }

  public OBWriteDomesticConsentResponse5Data expectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
    return this;
  }

  /**
   * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedSettlementDateTime
  **/
  @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getExpectedSettlementDateTime() {
    return expectedSettlementDateTime;
  }

  public void setExpectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
  }

  public OBWriteDomesticConsentResponse5Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDomesticConsentResponse5Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<OBWriteDomesticConsentResponse5DataCharges>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * Get charges
   * @return charges
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBWriteDomesticConsentResponse5DataCharges> getCharges() {
    return charges;
  }

  public void setCharges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
    this.charges = charges;
  }

  public OBWriteDomesticConsentResponse5Data initiation(OBWriteDomestic2DataInitiation initiation) {
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
    public OBWriteDomestic2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticConsentResponse5Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
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

  public OBWriteDomesticConsentResponse5Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
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

  public OBWriteDomesticConsentResponse5Data debtor(OBDebtorIdentification1 debtor) {
    this.debtor = debtor;
    return this;
  }

  /**
   * Get debtor
   * @return debtor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBDebtorIdentification1 getDebtor() {
    return debtor;
  }

  public void setDebtor(OBDebtorIdentification1 debtor) {
    this.debtor = debtor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsentResponse5Data obWriteDomesticConsentResponse5Data = (OBWriteDomesticConsentResponse5Data) o;
    return Objects.equals(this.consentId, obWriteDomesticConsentResponse5Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDomesticConsentResponse5Data.creationDateTime) &&
        Objects.equals(this.status, obWriteDomesticConsentResponse5Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDomesticConsentResponse5Data.statusUpdateDateTime) &&
        Objects.equals(this.readRefundAccount, obWriteDomesticConsentResponse5Data.readRefundAccount) &&
        Objects.equals(this.cutOffDateTime, obWriteDomesticConsentResponse5Data.cutOffDateTime) &&
        Objects.equals(this.expectedExecutionDateTime, obWriteDomesticConsentResponse5Data.expectedExecutionDateTime) &&
        Objects.equals(this.expectedSettlementDateTime, obWriteDomesticConsentResponse5Data.expectedSettlementDateTime) &&
        Objects.equals(this.charges, obWriteDomesticConsentResponse5Data.charges) &&
        Objects.equals(this.initiation, obWriteDomesticConsentResponse5Data.initiation) &&
        Objects.equals(this.authorisation, obWriteDomesticConsentResponse5Data.authorisation) &&
        Objects.equals(this.scASupportData, obWriteDomesticConsentResponse5Data.scASupportData) &&
        Objects.equals(this.debtor, obWriteDomesticConsentResponse5Data.debtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, readRefundAccount, cutOffDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, initiation, authorisation, scASupportData, debtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsentResponse5Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
    sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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
