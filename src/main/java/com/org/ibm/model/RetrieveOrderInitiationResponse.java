package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.RetrieveOrderInitiationResponseOrderInitiation;
import com.org.ibm.model.RetrieveOrderInitiationResponsePaymentInitiationTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOrderInitiationResponse
 */


public class RetrieveOrderInitiationResponse   {
  @JsonProperty("PaymentInitiationTransaction")
  private RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction = null;

  @JsonProperty("OrderInitiation")
  private RetrieveOrderInitiationResponseOrderInitiation orderInitiation = null;

  public RetrieveOrderInitiationResponse paymentInitiationTransaction(RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveOrderInitiationResponsePaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }

  public RetrieveOrderInitiationResponse orderInitiation(RetrieveOrderInitiationResponseOrderInitiation orderInitiation) {
    this.orderInitiation = orderInitiation;
    return this;
  }

  /**
   * Get orderInitiation
   * @return orderInitiation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveOrderInitiationResponseOrderInitiation getOrderInitiation() {
    return orderInitiation;
  }

  public void setOrderInitiation(RetrieveOrderInitiationResponseOrderInitiation orderInitiation) {
    this.orderInitiation = orderInitiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOrderInitiationResponse retrieveOrderInitiationResponse = (RetrieveOrderInitiationResponse) o;
    return Objects.equals(this.paymentInitiationTransaction, retrieveOrderInitiationResponse.paymentInitiationTransaction) &&
        Objects.equals(this.orderInitiation, retrieveOrderInitiationResponse.orderInitiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction, orderInitiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOrderInitiationResponse {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("    orderInitiation: ").append(toIndentedString(orderInitiation)).append("\n");
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

