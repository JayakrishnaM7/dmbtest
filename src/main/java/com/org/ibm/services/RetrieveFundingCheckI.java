package com.org.ibm.services;

import com.org.ibm.model.RetrieveFundingCheckP;
import com.org.ibm.model.RetrieveFundingCheckResponseWrapper;

public interface RetrieveFundingCheckI {

    public RetrieveFundingCheckResponseWrapper execute(RetrieveFundingCheckP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
