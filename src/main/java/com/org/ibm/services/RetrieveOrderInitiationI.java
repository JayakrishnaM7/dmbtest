package com.org.ibm.services;

import com.org.ibm.model.RetrieveOrderInitiationP;
import com.org.ibm.model.RetrieveOrderInitiationResponseWrapper;

public interface RetrieveOrderInitiationI {

    public RetrieveOrderInitiationResponseWrapper execute(RetrieveOrderInitiationP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
