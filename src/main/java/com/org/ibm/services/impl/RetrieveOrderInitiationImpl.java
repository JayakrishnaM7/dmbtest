package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrieveOrderInitiationP;
import com.org.ibm.model.RetrieveOrderInitiationResponseWrapper;
import com.org.ibm.services.RetrieveOrderInitiationI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrieveOrderInitiationImpl implements RetrieveOrderInitiationI {
 
    private static final Log logger = LogFactory.getLog(RetrieveOrderInitiationImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrieveOrderInitiationResponseWrapper execute(RetrieveOrderInitiationP requestParams){
        //TODO
        return new RetrieveOrderInitiationResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
