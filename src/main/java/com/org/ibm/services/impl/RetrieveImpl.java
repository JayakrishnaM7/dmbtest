package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrieveP;
import com.org.ibm.model.RetrieveResponseWrapper;
import com.org.ibm.services.RetrieveI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrieveImpl implements RetrieveI {
 
    private static final Log logger = LogFactory.getLog(RetrieveImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrieveResponseWrapper execute(RetrieveP requestParams){
        //TODO
        return new RetrieveResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
