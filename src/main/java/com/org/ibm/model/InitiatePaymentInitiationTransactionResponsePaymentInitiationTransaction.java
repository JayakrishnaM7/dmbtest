package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction
 */


public class InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction   {
  @JsonProperty("RecurringPaymentRecord")
  private String recurringPaymentRecord;

  @JsonProperty("RecurringPaymentCustomerReference")
  private Object recurringPaymentCustomerReference = null;

  @JsonProperty("RecurringPaymentReference")
  private Object recurringPaymentReference = null;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PaymentFeesOrCharges")
  private String paymentFeesOrCharges;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference = null;

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction recurringPaymentRecord(String recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
    return this;
  }

  /**
   * Get recurringPaymentRecord
   * @return recurringPaymentRecord
  */
  @ApiModelProperty(value = "")


  public String getRecurringPaymentRecord() {
    return recurringPaymentRecord;
  }

  public void setRecurringPaymentRecord(String recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
  }

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction recurringPaymentCustomerReference(Object recurringPaymentCustomerReference) {
    this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
    return this;
  }

  /**
   * Get recurringPaymentCustomerReference
   * @return recurringPaymentCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRecurringPaymentCustomerReference() {
    return recurringPaymentCustomerReference;
  }

  public void setRecurringPaymentCustomerReference(Object recurringPaymentCustomerReference) {
    this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
  }

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction recurringPaymentReference(Object recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
    return this;
  }

  /**
   * Get recurringPaymentReference
   * @return recurringPaymentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRecurringPaymentReference() {
    return recurringPaymentReference;
  }

  public void setRecurringPaymentReference(Object recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
  }

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction paymentFeesOrCharges(String paymentFeesOrCharges) {
    this.paymentFeesOrCharges = paymentFeesOrCharges;
    return this;
  }

  /**
   * Get paymentFeesOrCharges
   * @return paymentFeesOrCharges
  */
  @ApiModelProperty(value = "")


  public String getPaymentFeesOrCharges() {
    return paymentFeesOrCharges;
  }

  public void setPaymentFeesOrCharges(String paymentFeesOrCharges) {
    this.paymentFeesOrCharges = paymentFeesOrCharges;
  }

  public InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction = (InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction) o;
    return Objects.equals(this.recurringPaymentRecord, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.recurringPaymentRecord) &&
        Objects.equals(this.recurringPaymentCustomerReference, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.recurringPaymentCustomerReference) &&
        Objects.equals(this.recurringPaymentReference, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.recurringPaymentReference) &&
        Objects.equals(this.dateType, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.dateType) &&
        Objects.equals(this.paymentFeesOrCharges, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.paymentFeesOrCharges) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, initiatePaymentInitiationTransactionResponsePaymentInitiationTransaction.documentDirectoryEntryInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringPaymentRecord, recurringPaymentCustomerReference, recurringPaymentReference, dateType, paymentFeesOrCharges, documentDirectoryEntryInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentInitiationTransactionResponsePaymentInitiationTransaction {\n");
    
    sb.append("    recurringPaymentRecord: ").append(toIndentedString(recurringPaymentRecord)).append("\n");
    sb.append("    recurringPaymentCustomerReference: ").append(toIndentedString(recurringPaymentCustomerReference)).append("\n");
    sb.append("    recurringPaymentReference: ").append(toIndentedString(recurringPaymentReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentFeesOrCharges: ").append(toIndentedString(paymentFeesOrCharges)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
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

