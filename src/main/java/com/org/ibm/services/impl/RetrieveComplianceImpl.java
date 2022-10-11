package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrieveComplianceP;
import com.org.ibm.model.RetrieveComplianceResponseWrapper;
import com.org.ibm.services.RetrieveComplianceI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrieveComplianceImpl implements RetrieveComplianceI {
 
    private static final Log logger = LogFactory.getLog(RetrieveComplianceImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrieveComplianceResponseWrapper execute(RetrieveComplianceP requestParams){
        //TODO
        return new RetrieveComplianceResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
