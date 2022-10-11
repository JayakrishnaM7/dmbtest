package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderInitiation
 */


public class OrderInitiation   {
  @JsonProperty("PaymentOrderProcedureInstanceReference")
  private Object paymentOrderProcedureInstanceReference = null;

  @JsonProperty("PaymentOrderProcedureInstanceStatus")
  private String paymentOrderProcedureInstanceStatus;

  @JsonProperty("OrderInitiationTaskResult")
  private String orderInitiationTaskResult;

  public OrderInitiation paymentOrderProcedureInstanceReference(Object paymentOrderProcedureInstanceReference) {
    this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
    return this;
  }

  /**
   * Get paymentOrderProcedureInstanceReference
   * @return paymentOrderProcedureInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentOrderProcedureInstanceReference() {
    return paymentOrderProcedureInstanceReference;
  }

  public void setPaymentOrderProcedureInstanceReference(Object paymentOrderProcedureInstanceReference) {
    this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
  }

  public OrderInitiation paymentOrderProcedureInstanceStatus(String paymentOrderProcedureInstanceStatus) {
    this.paymentOrderProcedureInstanceStatus = paymentOrderProcedureInstanceStatus;
    return this;
  }

  /**
   * Get paymentOrderProcedureInstanceStatus
   * @return paymentOrderProcedureInstanceStatus
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderProcedureInstanceStatus() {
    return paymentOrderProcedureInstanceStatus;
  }

  public void setPaymentOrderProcedureInstanceStatus(String paymentOrderProcedureInstanceStatus) {
    this.paymentOrderProcedureInstanceStatus = paymentOrderProcedureInstanceStatus;
  }

  public OrderInitiation orderInitiationTaskResult(String orderInitiationTaskResult) {
    this.orderInitiationTaskResult = orderInitiationTaskResult;
    return this;
  }

  /**
   * Get orderInitiationTaskResult
   * @return orderInitiationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getOrderInitiationTaskResult() {
    return orderInitiationTaskResult;
  }

  public void setOrderInitiationTaskResult(String orderInitiationTaskResult) {
    this.orderInitiationTaskResult = orderInitiationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInitiation orderInitiation = (OrderInitiation) o;
    return Objects.equals(this.paymentOrderProcedureInstanceReference, orderInitiation.paymentOrderProcedureInstanceReference) &&
        Objects.equals(this.paymentOrderProcedureInstanceStatus, orderInitiation.paymentOrderProcedureInstanceStatus) &&
        Objects.equals(this.orderInitiationTaskResult, orderInitiation.orderInitiationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedureInstanceReference, paymentOrderProcedureInstanceStatus, orderInitiationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInitiation {\n");
    
    sb.append("    paymentOrderProcedureInstanceReference: ").append(toIndentedString(paymentOrderProcedureInstanceReference)).append("\n");
    sb.append("    paymentOrderProcedureInstanceStatus: ").append(toIndentedString(paymentOrderProcedureInstanceStatus)).append("\n");
    sb.append("    orderInitiationTaskResult: ").append(toIndentedString(orderInitiationTaskResult)).append("\n");
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

