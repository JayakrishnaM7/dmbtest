package com.org.ibm.services;

import com.org.ibm.model.UpdateP;
import com.org.ibm.model.UpdateResponseWrapper;

public interface UpdateI {

    public UpdateResponseWrapper execute(UpdateP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
