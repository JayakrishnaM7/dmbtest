package com.org.ibm.services;

import com.org.ibm.model.RetrieveComplianceP;
import com.org.ibm.model.RetrieveComplianceResponseWrapper;

public interface RetrieveComplianceI {

    public RetrieveComplianceResponseWrapper execute(RetrieveComplianceP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
