package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteDomesticResponse5DataRefundAccount;
import rtp.demo.domain.OBWriteInternationalResponse5DataRefundAgent;
import rtp.demo.domain.OBWriteInternationalResponse5DataRefundCreditor;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalResponse5DataRefund
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalResponse5DataRefund   {
  @JsonProperty("Creditor")
  private OBWriteInternationalResponse5DataRefundCreditor creditor = null;

  @JsonProperty("Agent")
  private OBWriteInternationalResponse5DataRefundAgent agent = null;

  @JsonProperty("Account")
  private OBWriteDomesticResponse5DataRefundAccount account = null;

  public OBWriteInternationalResponse5DataRefund creditor(OBWriteInternationalResponse5DataRefundCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteInternationalResponse5DataRefundCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(OBWriteInternationalResponse5DataRefundCreditor creditor) {
    this.creditor = creditor;
  }

  public OBWriteInternationalResponse5DataRefund agent(OBWriteInternationalResponse5DataRefundAgent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteInternationalResponse5DataRefundAgent getAgent() {
    return agent;
  }

  public void setAgent(OBWriteInternationalResponse5DataRefundAgent agent) {
    this.agent = agent;
  }

  public OBWriteInternationalResponse5DataRefund account(OBWriteDomesticResponse5DataRefundAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBWriteDomesticResponse5DataRefundAccount getAccount() {
    return account;
  }

  public void setAccount(OBWriteDomesticResponse5DataRefundAccount account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalResponse5DataRefund obWriteInternationalResponse5DataRefund = (OBWriteInternationalResponse5DataRefund) o;
    return Objects.equals(this.creditor, obWriteInternationalResponse5DataRefund.creditor) &&
        Objects.equals(this.agent, obWriteInternationalResponse5DataRefund.agent) &&
        Objects.equals(this.account, obWriteInternationalResponse5DataRefund.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditor, agent, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalResponse5DataRefund {\n");
    
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
