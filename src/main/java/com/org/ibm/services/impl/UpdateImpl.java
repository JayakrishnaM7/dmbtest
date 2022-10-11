package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.UpdateP;
import com.org.ibm.model.UpdateResponseWrapper;
import com.org.ibm.services.UpdateI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UpdateImpl implements UpdateI {
 
    private static final Log logger = LogFactory.getLog(UpdateImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UpdateResponseWrapper execute(UpdateP requestParams){
        //TODO
        return new UpdateResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
