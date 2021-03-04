package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import rtp.demo.domain.OBWritePaymentDetailsResponse1DataPaymentStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWritePaymentDetailsResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWritePaymentDetailsResponse1Data   {
  @JsonProperty("PaymentStatus")
  @Valid
  private List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus = null;

  public OBWritePaymentDetailsResponse1Data paymentStatus(List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  public OBWritePaymentDetailsResponse1Data addPaymentStatusItem(OBWritePaymentDetailsResponse1DataPaymentStatus paymentStatusItem) {
    if (this.paymentStatus == null) {
      this.paymentStatus = new ArrayList<OBWritePaymentDetailsResponse1DataPaymentStatus>();
    }
    this.paymentStatus.add(paymentStatusItem);
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBWritePaymentDetailsResponse1DataPaymentStatus> getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWritePaymentDetailsResponse1Data obWritePaymentDetailsResponse1Data = (OBWritePaymentDetailsResponse1Data) o;
    return Objects.equals(this.paymentStatus, obWritePaymentDetailsResponse1Data.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1Data {\n");
    
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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
