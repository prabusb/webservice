/**
 * 
 */
package com.tcs.service.webservices.consumer;

import java.net.URL;

import com.tcs.service.webservice.addnumbers.addnumbersrequest.request.Addnumbersrequest;
import com.tcs.service.webservice.addnumbers.addnumbersresponse.response.Addnumbersresponse;
import com.tcs.service.webservice.wsdl.addnumber.AddNumbersPortType;
import com.tcs.service.webservice.wsdl.addnumber.AddNumbersService;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

/**
 * @author 9501800
 *
 */
public class ConsumerClass {
	

	//@WebServiceRef(wsdlLocation="http://localhost:8082/webserviceprovider-web/Addnumber?wsdl")
	//static AddNumbersService addNumbersService = new AddNumbersService("http://localhost:8082/webserviceprovider-web/Addnumber?wsdl", "addNumbers");
	
	
	public static void main(String[] args) {
	    try {
	    	ConsumerClass client = new ConsumerClass();
	      client.doTest(args);
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
	
	
	
	public void doTest(String[] args) {
	    try {
	    	URL a = new URL("http://localhost:8082/webserviceprovider-web/Addnumber?wsdl");
	    	javax.xml.namespace.QName qname = new QName("http://www.tcs.com/service/webservice/wsdl/Addnumber.wsdl", "AddNumbersService");
	    	AddNumbersService addNumbersService = new AddNumbersService(a, qname);
	    	AddNumbersPortType port = addNumbersService.getPort(AddNumbersPortType.class);

	    	Addnumbersrequest reqAddnumbersrequest = new Addnumbersrequest();
	    	reqAddnumbersrequest.setFirstNumber(3);
	    	reqAddnumbersrequest.setSecondNumber(2);
	    	Addnumbersresponse response = port.addNumbers(reqAddnumbersrequest);
	      
	    	System.out.println("Addedvalue:" + response.getResult());
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	  }

}
