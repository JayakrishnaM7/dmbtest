package com.org.ibm.services;

import com.org.ibm.model.RetrieveP;
import com.org.ibm.model.RetrieveResponseWrapper;

public interface RetrieveI {

    public RetrieveResponseWrapper execute(RetrieveP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
