/*
 * Classname: ListDocumentServiceImpl
 * Version information: 1.0
 * Date: Sep 2010
 * Author: TCS(184866)
 */
package com.tcs.service.webservices;

import javax.jws.WebService;

import com.tcs.service.webservice.addnumbers.addnumbersrequest.request.Addnumbersrequest;
import com.tcs.service.webservice.addnumbers.addnumbersresponse.response.Addnumbersresponse;


/**
 * The Class ListFlightsServiceImpl.
 */
@WebService(endpointInterface = "com.tcs.service.webservice.wsdl.addnumber.AddNumbersPortType", targetNamespace = "http://www.tcs.com/service/webservice/wsdl/Addnumber.wsdl", serviceName = "AddNumbersService", portName = "AddNumbersPortType")
public class AddNumbersServiceImpl {



	/**
	 * 
	 * @param addnumbersrequest
	 * @return
	 */
    public Addnumbersresponse addNumbers(Addnumbersrequest addnumbersrequest) {
    	Addnumbersresponse addnumbersresponse = new Addnumbersresponse();
    	addnumbersresponse.setStatus("success    ");
    	addnumbersresponse.setResult(addnumbersrequest.getFirstNumber() + addnumbersrequest.getSecondNumber());
        return addnumbersresponse;
    }

 
    
}
