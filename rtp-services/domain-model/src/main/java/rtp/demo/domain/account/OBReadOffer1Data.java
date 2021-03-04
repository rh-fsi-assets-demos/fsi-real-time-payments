package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.account.OBReadOffer1DataOffer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadOffer1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBReadOffer1Data   {
  @JsonProperty("Offer")
  @Valid
  private List<OBReadOffer1DataOffer> offer = null;

  public OBReadOffer1Data offer(List<OBReadOffer1DataOffer> offer) {
    this.offer = offer;
    return this;
  }

  public OBReadOffer1Data addOfferItem(OBReadOffer1DataOffer offerItem) {
    if (this.offer == null) {
      this.offer = new ArrayList<OBReadOffer1DataOffer>();
    }
    this.offer.add(offerItem);
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBReadOffer1DataOffer> getOffer() {
    return offer;
  }

  public void setOffer(List<OBReadOffer1DataOffer> offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1Data obReadOffer1Data = (OBReadOffer1Data) o;
    return Objects.equals(this.offer, obReadOffer1Data.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1Data {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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
