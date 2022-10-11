package com.org.ibm.api;

import com.org.ibm.model.HTTPError;
import com.org.ibm.model.InitiatePaymentInitiationTransactionRequest;
import com.org.ibm.model.InitiatePaymentInitiationTransactionResponse;
import com.org.ibm.model.RetrieveComplianceResponse;
import com.org.ibm.model.RetrieveFundingCheckResponse;
import com.org.ibm.model.RetrieveOrderInitiationResponse;
import com.org.ibm.model.RetrievePaymentInitiationTransactionResponse;
import com.org.ibm.model.UpdatePaymentInitiationTransactionRequest;
import com.org.ibm.model.UpdatePaymentInitiationTransactionResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.org.ibm.services.InitiateI;
import com.org.ibm.model.InitiateP;
import com.org.ibm.model.InitiateResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.org.ibm.services.UpdateI;
import com.org.ibm.model.UpdateP;
import com.org.ibm.model.UpdateResponseWrapper;
import com.org.ibm.services.RetrieveI;
import com.org.ibm.model.RetrieveP;
import com.org.ibm.model.RetrieveResponseWrapper;
import com.org.ibm.services.RetrieveComplianceI;
import com.org.ibm.model.RetrieveComplianceP;
import com.org.ibm.model.RetrieveComplianceResponseWrapper;
import com.org.ibm.services.RetrieveFundingCheckI;
import com.org.ibm.model.RetrieveFundingCheckP;
import com.org.ibm.model.RetrieveFundingCheckResponseWrapper;
import com.org.ibm.services.RetrieveOrderInitiationI;
import com.org.ibm.model.RetrieveOrderInitiationP;
import com.org.ibm.model.RetrieveOrderInitiationResponseWrapper;

@RestController
public class PaymentInitiationApiController implements PaymentInitiationApi {

	@Autowired
	RetrieveOrderInitiationI retrieveOrderInitiationI;


	@Autowired
	RetrieveFundingCheckI retrieveFundingCheckI;


	@Autowired
	RetrieveComplianceI retrieveComplianceI;


	@Autowired
	RetrieveI retrieveI;


	@Autowired
	UpdateI updateI;


	@Autowired
	InitiateI initiateI;


    public ResponseEntity<InitiatePaymentInitiationTransactionResponse> initiate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InitiatePaymentInitiationTransactionRequest initiatePaymentInitiationTransactionRequest){
        
        InitiateResponseWrapper res  = initiateI.execute(new InitiateP(initiatePaymentInitiationTransactionRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrievePaymentInitiationTransactionResponse> retrieve(@ApiParam(value = "",required=true) @PathVariable("paymentinitiationId") String paymentinitiationId){
        
        RetrieveResponseWrapper res  = retrieveI.execute(new RetrieveP(paymentinitiationId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrieveComplianceResponse> retrieveCompliance(@ApiParam(value = "",required=true) @PathVariable("paymentinitiationId") String paymentinitiationId,@ApiParam(value = "",required=true) @PathVariable("complianceId") String complianceId){
        
        RetrieveComplianceResponseWrapper res  = retrieveComplianceI.execute(new RetrieveComplianceP(paymentinitiationId, complianceId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrieveFundingCheckResponse> retrieveFundingCheck(@ApiParam(value = "",required=true) @PathVariable("paymentinitiationId") String paymentinitiationId,@ApiParam(value = "",required=true) @PathVariable("fundingcheckId") String fundingcheckId){
        
        RetrieveFundingCheckResponseWrapper res  = retrieveFundingCheckI.execute(new RetrieveFundingCheckP(paymentinitiationId, fundingcheckId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrieveOrderInitiationResponse> retrieveOrderInitiation(@ApiParam(value = "",required=true) @PathVariable("paymentinitiationId") String paymentinitiationId,@ApiParam(value = "",required=true) @PathVariable("orderinitiationId") String orderinitiationId){
        
        RetrieveOrderInitiationResponseWrapper res  = retrieveOrderInitiationI.execute(new RetrieveOrderInitiationP(paymentinitiationId, orderinitiationId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<UpdatePaymentInitiationTransactionResponse> update(@ApiParam(value = "",required=true) @PathVariable("paymentinitiationId") String paymentinitiationId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdatePaymentInitiationTransactionRequest updatePaymentInitiationTransactionRequest){
        
        UpdateResponseWrapper res  = updateI.execute(new UpdateP(paymentinitiationId, updatePaymentInitiationTransactionRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
