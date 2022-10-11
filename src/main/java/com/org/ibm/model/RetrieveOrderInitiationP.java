package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrieveOrderInitiationResponse;

public class RetrieveOrderInitiationP {

    private String paymentinitiationId;
    private String orderinitiationId;

    public RetrieveOrderInitiationP() {

    }

    public RetrieveOrderInitiationP(String paymentinitiationId,String orderinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
        this.orderinitiationId = orderinitiationId;
    }

    public String getPaymentinitiationId () {
        return paymentinitiationId;
    }

    public void setPaymentinitiationId (String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }
    public String getOrderinitiationId () {
        return orderinitiationId;
    }

    public void setOrderinitiationId (String orderinitiationId) {
        this.orderinitiationId = orderinitiationId;
    }

}
