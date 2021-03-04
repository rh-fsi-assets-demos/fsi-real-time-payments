package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides details on the currency exchange rate and contract.
 */
@ApiModel(description = "Provides details on the currency exchange rate and contract.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternational3DataInitiationExchangeRateInformation   {
  @JsonProperty("UnitCurrency")
  private String unitCurrency = null;

  @JsonProperty("ExchangeRate")
  private BigDecimal exchangeRate = null;

  /**
   * Specifies the type used to complete the currency exchange.
   */
  public enum RateTypeEnum {
    ACTUAL("Actual"),
    
    AGREED("Agreed"),
    
    INDICATIVE("Indicative");

    private String value;

    RateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RateTypeEnum fromValue(String text) {
      for (RateTypeEnum b : RateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("RateType")
  private RateTypeEnum rateType = null;

  @JsonProperty("ContractIdentification")
  private String contractIdentification = null;

  public OBWriteInternational3DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
      @NotNull

  @Pattern(regexp="^[A-Z]{3,3}$")   public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBWriteInternational3DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
  
    @Valid
    public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBWriteInternational3DataInitiationExchangeRateInformation rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Specifies the type used to complete the currency exchange.
   * @return rateType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
      @NotNull

    public RateTypeEnum getRateType() {
    return rateType;
  }

  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  public OBWriteInternational3DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
   * @return contractIdentification
  **/
  @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")
  
  @Size(min=1,max=256)   public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternational3DataInitiationExchangeRateInformation obWriteInternational3DataInitiationExchangeRateInformation = (OBWriteInternational3DataInitiationExchangeRateInformation) o;
    return Objects.equals(this.unitCurrency, obWriteInternational3DataInitiationExchangeRateInformation.unitCurrency) &&
        Objects.equals(this.exchangeRate, obWriteInternational3DataInitiationExchangeRateInformation.exchangeRate) &&
        Objects.equals(this.rateType, obWriteInternational3DataInitiationExchangeRateInformation.rateType) &&
        Objects.equals(this.contractIdentification, obWriteInternational3DataInitiationExchangeRateInformation.contractIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCurrency, exchangeRate, rateType, contractIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternational3DataInitiationExchangeRateInformation {\n");
    
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
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
