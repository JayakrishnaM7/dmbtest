package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrieveFundingCheckResponse;

public class RetrieveFundingCheckP {

    private String paymentinitiationId;
    private String fundingcheckId;

    public RetrieveFundingCheckP() {

    }

    public RetrieveFundingCheckP(String paymentinitiationId,String fundingcheckId) {
        this.paymentinitiationId = paymentinitiationId;
        this.fundingcheckId = fundingcheckId;
    }

    public String getPaymentinitiationId () {
        return paymentinitiationId;
    }

    public void setPaymentinitiationId (String paymentinitiationId) {
        this.paymentinitiationId = paymentinitiationId;
    }
    public String getFundingcheckId () {
        return fundingcheckId;
    }

    public void setFundingcheckId (String fundingcheckId) {
        this.fundingcheckId = fundingcheckId;
    }

}
