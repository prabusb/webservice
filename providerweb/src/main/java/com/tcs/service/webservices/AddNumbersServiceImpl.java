
package com.tcs.service.webservices;

import javax.jws.WebService;

import com.tcs.service.webservice.addnumbers.addnumbersrequest.request.Addnumbersrequest;
import com.tcs.service.webservice.addnumbers.addnumbersresponse.response.Addnumbersresponse;



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
