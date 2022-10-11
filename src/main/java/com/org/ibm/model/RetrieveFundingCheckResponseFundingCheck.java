package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveFundingCheckResponseFundingCheck
 */


public class RetrieveFundingCheckResponseFundingCheck   {
  @JsonProperty("PaymentTransactionFundingCheckResult")
  private String paymentTransactionFundingCheckResult;

  public RetrieveFundingCheckResponseFundingCheck paymentTransactionFundingCheckResult(String paymentTransactionFundingCheckResult) {
    this.paymentTransactionFundingCheckResult = paymentTransactionFundingCheckResult;
    return this;
  }

  /**
   * Get paymentTransactionFundingCheckResult
   * @return paymentTransactionFundingCheckResult
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFundingCheckResult() {
    return paymentTransactionFundingCheckResult;
  }

  public void setPaymentTransactionFundingCheckResult(String paymentTransactionFundingCheckResult) {
    this.paymentTransactionFundingCheckResult = paymentTransactionFundingCheckResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveFundingCheckResponseFundingCheck retrieveFundingCheckResponseFundingCheck = (RetrieveFundingCheckResponseFundingCheck) o;
    return Objects.equals(this.paymentTransactionFundingCheckResult, retrieveFundingCheckResponseFundingCheck.paymentTransactionFundingCheckResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionFundingCheckResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveFundingCheckResponseFundingCheck {\n");
    
    sb.append("    paymentTransactionFundingCheckResult: ").append(toIndentedString(paymentTransactionFundingCheckResult)).append("\n");
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

