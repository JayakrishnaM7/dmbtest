package com.org.ibm.model;

import com.org.ibm.model.UpdatePaymentInitiationTransactionRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.UpdatePaymentInitiationTransactionResponse;

public class UpdateP {

    private String paymentinitiationId;
    private UpdatePaymentInitiationTransactionRequest updatePaymentInitiationTransactionRequest;

    public UpdateP() {

    }

    public UpdateP(String paymentinitiationId,UpdatePaymentInitiationTransactionRequest updatePaymentInitiationTransactionRequest) {
        this.paymentinitiationId = paymentinitiationId;
        this.updatePaymentInitiationTransactionRequest = updatePaymentInitiationTransactionRequest;
    }

    public String getPaymentinitiationId () {
        return paymentinitiationId;
    }

    public void setPaymentinitiationId (String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }
    public UpdatePaymentInitiationTransactionRequest getUpdatePaymentInitiationTransactionRequest () {
        return updatePaymentInitiationTransactionRequest;
    }

    public void setUpdatePaymentInitiationTransactionRequest (UpdatePaymentInitiationTransactionRequest updatePaymentInitiationTransactionRequest) {
        this.updatePaymentInitiationTransactionRequest = updatePaymentInitiationTransactionRequest;
    }

}
