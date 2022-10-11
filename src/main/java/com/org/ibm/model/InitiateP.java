package com.org.ibm.model;

import com.org.ibm.model.InitiatePaymentInitiationTransactionRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.InitiatePaymentInitiationTransactionResponse;

public class InitiateP {

    private InitiatePaymentInitiationTransactionRequest initiatePaymentInitiationTransactionRequest;

    public InitiateP() {

    }

    public InitiateP(InitiatePaymentInitiationTransactionRequest initiatePaymentInitiationTransactionRequest) {
        this.initiatePaymentInitiationTransactionRequest = initiatePaymentInitiationTransactionRequest;
    }

    public InitiatePaymentInitiationTransactionRequest getInitiatePaymentInitiationTransactionRequest () {
        return initiatePaymentInitiationTransactionRequest;
    }

    public void setInitiatePaymentInitiationTransactionRequest (InitiatePaymentInitiationTransactionRequest initiatePaymentInitiationTransactionRequest) {
        this.initiatePaymentInitiationTransactionRequest = initiatePaymentInitiationTransactionRequest;
    }

}
