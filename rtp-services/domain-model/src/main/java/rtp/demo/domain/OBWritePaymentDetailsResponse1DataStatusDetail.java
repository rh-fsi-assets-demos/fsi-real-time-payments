package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment status details as per underlying Payment Rail.
 */
@ApiModel(description = "Payment status details as per underlying Payment Rail.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWritePaymentDetailsResponse1DataStatusDetail   {
  @JsonProperty("LocalInstrument")
  private String localInstrument = null;

  @JsonProperty("Status")
  private String status = null;

  /**
   * Reason Code provided for the status of a transfer.
   */
  public enum StatusReasonEnum {
    CANCELLED("Cancelled"),
    
    PENDINGFAILINGSETTLEMENT("PendingFailingSettlement"),
    
    PENDINGSETTLEMENT("PendingSettlement"),
    
    PROPRIETARY("Proprietary"),
    
    PROPRIETARYREJECTION("ProprietaryRejection"),
    
    SUSPENDED("Suspended"),
    
    UNMATCHED("Unmatched");

    private String value;

    StatusReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusReasonEnum fromValue(String text) {
      for (StatusReasonEnum b : StatusReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("StatusReason")
  private StatusReasonEnum statusReason = null;

  @JsonProperty("StatusReasonDescription")
  private String statusReasonDescription = null;

  public OBWritePaymentDetailsResponse1DataStatusDetail localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * Get localInstrument
   * @return localInstrument
  **/
  @ApiModelProperty(value = "")
  
    public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a transfer, as assigned by the transaction administrator.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of a transfer, as assigned by the transaction administrator.")
      @NotNull

  @Size(min=1,max=128)   public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Reason Code provided for the status of a transfer.
   * @return statusReason
  **/
  @ApiModelProperty(value = "Reason Code provided for the status of a transfer.")
  
    public StatusReasonEnum getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
    return this;
  }

  /**
   * Reason provided for the status of a transfer.
   * @return statusReasonDescription
  **/
  @ApiModelProperty(value = "Reason provided for the status of a transfer.")
  
  @Size(min=1,max=256)   public String getStatusReasonDescription() {
    return statusReasonDescription;
  }

  public void setStatusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWritePaymentDetailsResponse1DataStatusDetail obWritePaymentDetailsResponse1DataStatusDetail = (OBWritePaymentDetailsResponse1DataStatusDetail) o;
    return Objects.equals(this.localInstrument, obWritePaymentDetailsResponse1DataStatusDetail.localInstrument) &&
        Objects.equals(this.status, obWritePaymentDetailsResponse1DataStatusDetail.status) &&
        Objects.equals(this.statusReason, obWritePaymentDetailsResponse1DataStatusDetail.statusReason) &&
        Objects.equals(this.statusReasonDescription, obWritePaymentDetailsResponse1DataStatusDetail.statusReasonDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localInstrument, status, statusReason, statusReasonDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1DataStatusDetail {\n");
    
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
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
