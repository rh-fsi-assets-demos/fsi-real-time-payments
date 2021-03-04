package rtp.demo.domain;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
 */
public enum OBChargeBearerType1Code {
  BORNEBYCREDITOR("BorneByCreditor"),
    BORNEBYDEBTOR("BorneByDebtor"),
    FOLLOWINGSERVICELEVEL("FollowingServiceLevel"),
    SHARED("Shared");

  private String value;

  OBChargeBearerType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBChargeBearerType1Code fromValue(String text) {
    for (OBChargeBearerType1Code b : OBChargeBearerType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
