package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentInitiationTransactionResponse;

public class RetrieveP {

    private String paymentinitiationId;

    public RetrieveP() {

    }

    public RetrieveP(String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }

    public String getPaymentinitiationId () {
        return paymentinitiationId;
    }

    public void setPaymentinitiationId (String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }

}
