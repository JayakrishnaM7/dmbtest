package com.org.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction
 */


public class UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction   {
  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType;

  @JsonProperty("RecurringPaymentRecord")
  private String recurringPaymentRecord;

  @JsonProperty("RecurringPaymentCustomerReference")
  private Object recurringPaymentCustomerReference = null;

  @JsonProperty("RecurringPaymentReference")
  private Object recurringPaymentReference = null;

  @JsonProperty("PayerReference")
  private Object payerReference = null;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference = null;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference = null;

  @JsonProperty("PayeeReference")
  private Object payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference = null;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference = null;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PaymentFeesOrCharges")
  private String paymentFeesOrCharges;

  @JsonProperty("PaymentMechanism")
  private String paymentMechanism;

  @JsonProperty("PaymentPurpose")
  private String paymentPurpose;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference = null;

  @JsonProperty("DocumentContent")
  private String documentContent;

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * Get paymentTransactionType
   * @return paymentTransactionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction recurringPaymentRecord(String recurringPaymentRecord) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction recurringPaymentCustomerReference(Object recurringPaymentCustomerReference) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction recurringPaymentReference(Object recurringPaymentReference) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction dateType(String dateType) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentFeesOrCharges(String paymentFeesOrCharges) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
    return this;
  }

  /**
   * Get paymentMechanism
   * @return paymentMechanism
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentPurpose(String paymentPurpose) {
    this.paymentPurpose = paymentPurpose;
    return this;
  }

  /**
   * Get paymentPurpose
   * @return paymentPurpose
  */
  @ApiModelProperty(value = "")


  public String getPaymentPurpose() {
    return paymentPurpose;
  }

  public void setPaymentPurpose(String paymentPurpose) {
    this.paymentPurpose = paymentPurpose;
  }

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

  /**
   * Get documentContent
   * @return documentContent
  */
  @ApiModelProperty(value = "")


  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction updatePaymentInitiationTransactionRequestPaymentInitiationTransaction = (UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction) o;
    return Objects.equals(this.paymentTransactionType, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.paymentTransactionType) &&
        Objects.equals(this.recurringPaymentRecord, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.recurringPaymentRecord) &&
        Objects.equals(this.recurringPaymentCustomerReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.recurringPaymentCustomerReference) &&
        Objects.equals(this.recurringPaymentReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.recurringPaymentReference) &&
        Objects.equals(this.payerReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payerReference) &&
        Objects.equals(this.payerBankReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payeeReference) &&
        Objects.equals(this.payeeBankReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.payeeProductInstanceReference) &&
        Objects.equals(this.amount, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.amount) &&
        Objects.equals(this.currency, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.currency) &&
        Objects.equals(this.dateType, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.dateType) &&
        Objects.equals(this.paymentFeesOrCharges, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.paymentFeesOrCharges) &&
        Objects.equals(this.paymentMechanism, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.paymentMechanism) &&
        Objects.equals(this.paymentPurpose, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.paymentPurpose) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.documentContent, updatePaymentInitiationTransactionRequestPaymentInitiationTransaction.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionType, recurringPaymentRecord, recurringPaymentCustomerReference, recurringPaymentReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, paymentFeesOrCharges, paymentMechanism, paymentPurpose, documentDirectoryEntryInstanceReference, documentContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentInitiationTransactionRequestPaymentInitiationTransaction {\n");
    
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    recurringPaymentRecord: ").append(toIndentedString(recurringPaymentRecord)).append("\n");
    sb.append("    recurringPaymentCustomerReference: ").append(toIndentedString(recurringPaymentCustomerReference)).append("\n");
    sb.append("    recurringPaymentReference: ").append(toIndentedString(recurringPaymentReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentFeesOrCharges: ").append(toIndentedString(paymentFeesOrCharges)).append("\n");
    sb.append("    paymentMechanism: ").append(toIndentedString(paymentMechanism)).append("\n");
    sb.append("    paymentPurpose: ").append(toIndentedString(paymentPurpose)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
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

