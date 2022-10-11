package com.org.ibm.services;

import com.org.ibm.model.InitiateP;
import com.org.ibm.model.InitiateResponseWrapper;

public interface InitiateI {

    public InitiateResponseWrapper execute(InitiateP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
