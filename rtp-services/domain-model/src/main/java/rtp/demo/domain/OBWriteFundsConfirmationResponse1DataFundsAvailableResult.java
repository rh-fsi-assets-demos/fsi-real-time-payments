package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Result of a funds availability check.
 */
@ApiModel(description = "Result of a funds availability check.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteFundsConfirmationResponse1DataFundsAvailableResult   {
  @JsonProperty("FundsAvailableDateTime")
  private OffsetDateTime fundsAvailableDateTime = null;

  @JsonProperty("FundsAvailable")
  private Boolean fundsAvailable = null;

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableDateTime(OffsetDateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
    return this;
  }

  /**
   * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return fundsAvailableDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
      @NotNull

    @Valid
    public OffsetDateTime getFundsAvailableDateTime() {
    return fundsAvailableDateTime;
  }

  public void setFundsAvailableDateTime(OffsetDateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
  }

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Flag to indicate the availability of funds given the Amount in the consent request.
   * @return fundsAvailable
  **/
  @ApiModelProperty(required = true, value = "Flag to indicate the availability of funds given the Amount in the consent request.")
      @NotNull

    public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteFundsConfirmationResponse1DataFundsAvailableResult obWriteFundsConfirmationResponse1DataFundsAvailableResult = (OBWriteFundsConfirmationResponse1DataFundsAvailableResult) o;
    return Objects.equals(this.fundsAvailableDateTime, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailableDateTime) &&
        Objects.equals(this.fundsAvailable, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableDateTime, fundsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFundsConfirmationResponse1DataFundsAvailableResult {\n");
    
    sb.append("    fundsAvailableDateTime: ").append(toIndentedString(fundsAvailableDateTime)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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
