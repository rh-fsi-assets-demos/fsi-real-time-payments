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
import rtp.demo.domain.OBWriteDomesticResponse5DataRefund;
import rtp.demo.domain.OBWriteDomesticStandingOrder3DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticStandingOrderResponse6Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteDomesticStandingOrderResponse6Data   {
  @JsonProperty("DomesticStandingOrderId")
  private String domesticStandingOrderId = null;

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

  @JsonProperty("Refund")
  private OBWriteDomesticResponse5DataRefund refund = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

  @JsonProperty("Initiation")
  private OBWriteDomesticStandingOrder3DataInitiation initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation = null;

  @JsonProperty("Debtor")
  private OBDebtorIdentification1 debtor = null;

  public OBWriteDomesticStandingOrderResponse6Data domesticStandingOrderId(String domesticStandingOrderId) {
    this.domesticStandingOrderId = domesticStandingOrderId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
   * @return domesticStandingOrderId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.")
      @NotNull

  @Size(min=1,max=40)   public String getDomesticStandingOrderId() {
    return domesticStandingOrderId;
  }

  public void setDomesticStandingOrderId(String domesticStandingOrderId) {
    this.domesticStandingOrderId = domesticStandingOrderId;
  }

  public OBWriteDomesticStandingOrderResponse6Data consentId(String consentId) {
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

  public OBWriteDomesticStandingOrderResponse6Data creationDateTime(OffsetDateTime creationDateTime) {
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

  public OBWriteDomesticStandingOrderResponse6Data status(StatusEnum status) {
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

  public OBWriteDomesticStandingOrderResponse6Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
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

  public OBWriteDomesticStandingOrderResponse6Data refund(OBWriteDomesticResponse5DataRefund refund) {
    this.refund = refund;
    return this;
  }

  /**
   * Get refund
   * @return refund
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticResponse5DataRefund getRefund() {
    return refund;
  }

  public void setRefund(OBWriteDomesticResponse5DataRefund refund) {
    this.refund = refund;
  }

  public OBWriteDomesticStandingOrderResponse6Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDomesticStandingOrderResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
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

  public OBWriteDomesticStandingOrderResponse6Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
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
    public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticStandingOrderResponse6Data multiAuthorisation(OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation) {
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

  public OBWriteDomesticStandingOrderResponse6Data debtor(OBDebtorIdentification1 debtor) {
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
    OBWriteDomesticStandingOrderResponse6Data obWriteDomesticStandingOrderResponse6Data = (OBWriteDomesticStandingOrderResponse6Data) o;
    return Objects.equals(this.domesticStandingOrderId, obWriteDomesticStandingOrderResponse6Data.domesticStandingOrderId) &&
        Objects.equals(this.consentId, obWriteDomesticStandingOrderResponse6Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDomesticStandingOrderResponse6Data.creationDateTime) &&
        Objects.equals(this.status, obWriteDomesticStandingOrderResponse6Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDomesticStandingOrderResponse6Data.statusUpdateDateTime) &&
        Objects.equals(this.refund, obWriteDomesticStandingOrderResponse6Data.refund) &&
        Objects.equals(this.charges, obWriteDomesticStandingOrderResponse6Data.charges) &&
        Objects.equals(this.initiation, obWriteDomesticStandingOrderResponse6Data.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteDomesticStandingOrderResponse6Data.multiAuthorisation) &&
        Objects.equals(this.debtor, obWriteDomesticStandingOrderResponse6Data.debtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domesticStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, refund, charges, initiation, multiAuthorisation, debtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticStandingOrderResponse6Data {\n");
    
    sb.append("    domesticStandingOrderId: ").append(toIndentedString(domesticStandingOrderId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
