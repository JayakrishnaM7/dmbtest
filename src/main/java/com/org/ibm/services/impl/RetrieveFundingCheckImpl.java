package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrieveFundingCheckP;
import com.org.ibm.model.RetrieveFundingCheckResponseWrapper;
import com.org.ibm.services.RetrieveFundingCheckI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrieveFundingCheckImpl implements RetrieveFundingCheckI {
 
    private static final Log logger = LogFactory.getLog(RetrieveFundingCheckImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrieveFundingCheckResponseWrapper execute(RetrieveFundingCheckP requestParams){
        //TODO
        return new RetrieveFundingCheckResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
