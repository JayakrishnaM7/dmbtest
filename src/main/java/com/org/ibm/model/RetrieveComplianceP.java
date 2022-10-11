package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrieveComplianceResponse;

public class RetrieveComplianceP {

    private String paymentinitiationId;
    private String complianceId;

    public RetrieveComplianceP() {

    }

    public RetrieveComplianceP(String paymentinitiationId,String complianceId) {
        this.paymentinitiationId = paymentinitiationId;
        this.complianceId = complianceId;
    }

    public String getPaymentinitiationId () {
        return paymentinitiationId;
    }

    public void setPaymentinitiationId (String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }
    public String getComplianceId () {
        return complianceId;
    }

    public void setComplianceId (String complianceId) {
        this.complianceId = complianceId;
    }

}
