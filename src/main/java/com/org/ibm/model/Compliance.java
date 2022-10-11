package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Compliance
 */


public class Compliance   {
  @JsonProperty("PaymentTransactionComplianceCheckType")
  private String paymentTransactionComplianceCheckType;

  @JsonProperty("PaymentTransactionComplianceCheckResult")
  private String paymentTransactionComplianceCheckResult;

  @JsonProperty("PaymentTransactionComplianceTaskResult")
  private String paymentTransactionComplianceTaskResult;

  public Compliance paymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
    this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
    return this;
  }

  /**
   * Get paymentTransactionComplianceCheckType
   * @return paymentTransactionComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionComplianceCheckType() {
    return paymentTransactionComplianceCheckType;
  }

  public void setPaymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
    this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
  }

  public Compliance paymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
    this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
    return this;
  }

  /**
   * Get paymentTransactionComplianceCheckResult
   * @return paymentTransactionComplianceCheckResult
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionComplianceCheckResult() {
    return paymentTransactionComplianceCheckResult;
  }

  public void setPaymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
    this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
  }

  public Compliance paymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
    this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
    return this;
  }

  /**
   * Get paymentTransactionComplianceTaskResult
   * @return paymentTransactionComplianceTaskResult
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionComplianceTaskResult() {
    return paymentTransactionComplianceTaskResult;
  }

  public void setPaymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
    this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;
    return Objects.equals(this.paymentTransactionComplianceCheckType, compliance.paymentTransactionComplianceCheckType) &&
        Objects.equals(this.paymentTransactionComplianceCheckResult, compliance.paymentTransactionComplianceCheckResult) &&
        Objects.equals(this.paymentTransactionComplianceTaskResult, compliance.paymentTransactionComplianceTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionComplianceCheckType, paymentTransactionComplianceCheckResult, paymentTransactionComplianceTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    
    sb.append("    paymentTransactionComplianceCheckType: ").append(toIndentedString(paymentTransactionComplianceCheckType)).append("\n");
    sb.append("    paymentTransactionComplianceCheckResult: ").append(toIndentedString(paymentTransactionComplianceCheckResult)).append("\n");
    sb.append("    paymentTransactionComplianceTaskResult: ").append(toIndentedString(paymentTransactionComplianceTaskResult)).append("\n");
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

