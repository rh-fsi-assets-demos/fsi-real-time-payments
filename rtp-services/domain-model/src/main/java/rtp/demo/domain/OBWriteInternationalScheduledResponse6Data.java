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
import rtp.demo.domain.OBWriteDomesticConsentResponse5DataCharges;
import rtp.demo.domain.OBWriteDomesticResponse5DataMultiAuthorisation;
import rtp.demo.domain.OBWriteInternationalConsentResponse6DataExchangeRateInformation;
import rtp.demo.domain.OBWriteInternationalResponse5DataRefund;
import rtp.demo.domain.OBWriteInternationalScheduled3DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalScheduledResponse6Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalScheduledResponse6Data   {
  @JsonProperty("InternationalScheduledPaymentId")
  private String internationalScheduledPaymentId = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  /**
   * Specifies the status of the payment order resource.
   */
  public enum StatusEnum {
    CANCELLED("Cancelled"),
    
    INITIATIONCOMPLETED("InitiationCompleted"),
    
    INITIATIONFAILED("InitiationFailed"),
    
    INITIATIONPENDING("InitiationPending");

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

  @JsonProperty("ExpectedExecutionDateTime")
  private OffsetDateTime expectedExecutionDateTime = null;

  @JsonProperty("ExpectedSettlementDateTime")
  private OffsetDateTime expectedSettlementDateTime = null;

  @JsonProperty("Refund")
  private OBWriteInternationalResponse5DataRefund refund = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

  @JsonProperty("ExchangeRateInformation")
  private OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalScheduled3DataInitiation initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation = null;

  @JsonProperty("Debtor")
  private OBDebtorIdentification1 debtor = null;

  public OBWriteInternationalScheduledResponse6Data internationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.
   * @return internationalScheduledPaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.")
      @NotNull

  @Size(min=1,max=40)   public String getInternationalScheduledPaymentId() {
    return internationalScheduledPaymentId;
  }

  public void setInternationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
  }

  public OBWriteInternationalScheduledResponse6Data consentId(String consentId) {
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

  public OBWriteInternationalScheduledResponse6Data creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteInternationalScheduledResponse6Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of the payment order resource.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of the payment order resource.")
      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteInternationalScheduledResponse6Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
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

  public OBWriteInternationalScheduledResponse6Data expectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
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

  public OBWriteInternationalScheduledResponse6Data expectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
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

  public OBWriteInternationalScheduledResponse6Data refund(OBWriteInternationalResponse5DataRefund refund) {
    this.refund = refund;
    return this;
  }

  /**
   * Get refund
   * @return refund
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteInternationalResponse5DataRefund getRefund() {
    return refund;
  }

  public void setRefund(OBWriteInternationalResponse5DataRefund refund) {
    this.refund = refund;
  }

  public OBWriteInternationalScheduledResponse6Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteInternationalScheduledResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
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

  public OBWriteInternationalScheduledResponse6Data exchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
    return this;
  }

  /**
   * Get exchangeRateInformation
   * @return exchangeRateInformation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteInternationalConsentResponse6DataExchangeRateInformation getExchangeRateInformation() {
    return exchangeRateInformation;
  }

  public void setExchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
  }

  public OBWriteInternationalScheduledResponse6Data initiation(OBWriteInternationalScheduled3DataInitiation initiation) {
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
    public OBWriteInternationalScheduled3DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternationalScheduled3DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteInternationalScheduledResponse6Data multiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
    return this;
  }

  /**
   * Get multiAuthorisation
   * @return multiAuthorisation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticResponse5DataMultiAuthorisation getMultiAuthorisation() {
    return multiAuthorisation;
  }

  public void setMultiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
  }

  public OBWriteInternationalScheduledResponse6Data debtor(OBDebtorIdentification1 debtor) {
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
    OBWriteInternationalScheduledResponse6Data obWriteInternationalScheduledResponse6Data = (OBWriteInternationalScheduledResponse6Data) o;
    return Objects.equals(this.internationalScheduledPaymentId, obWriteInternationalScheduledResponse6Data.internationalScheduledPaymentId) &&
        Objects.equals(this.consentId, obWriteInternationalScheduledResponse6Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteInternationalScheduledResponse6Data.creationDateTime) &&
        Objects.equals(this.status, obWriteInternationalScheduledResponse6Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledResponse6Data.statusUpdateDateTime) &&
        Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledResponse6Data.expectedExecutionDateTime) &&
        Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledResponse6Data.expectedSettlementDateTime) &&
        Objects.equals(this.refund, obWriteInternationalScheduledResponse6Data.refund) &&
        Objects.equals(this.charges, obWriteInternationalScheduledResponse6Data.charges) &&
        Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledResponse6Data.exchangeRateInformation) &&
        Objects.equals(this.initiation, obWriteInternationalScheduledResponse6Data.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteInternationalScheduledResponse6Data.multiAuthorisation) &&
        Objects.equals(this.debtor, obWriteInternationalScheduledResponse6Data.debtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internationalScheduledPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, exchangeRateInformation, initiation, multiAuthorisation, debtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalScheduledResponse6Data {\n");
    
    sb.append("    internationalScheduledPaymentId: ").append(toIndentedString(internationalScheduledPaymentId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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
