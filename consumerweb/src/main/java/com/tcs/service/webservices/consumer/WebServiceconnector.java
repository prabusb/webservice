/**
 * 
 */
package com.tcs.service.webservices.consumer;

import com.tcs.service.webservice.addnumbers.addnumbersrequest.request.Addnumbersrequest;
import com.tcs.service.webservice.addnumbers.addnumbersresponse.response.Addnumbersresponse;
import com.tcs.service.webservice.wsdl.addnumber.AddNumbersPortType;

/**
 * Connector class which connect the webservice proxy and make a service call
 * 
 * @author Prabu S B
 * @version 1.0
 * @since 06-Dec-2013 
 *
 */
public class WebServiceconnector {
	
	
	private AddNumbersPortType calculatorServicePortType;
	
	
	/**
	 * Method to add given number by making service call.
	 * 
	 * @param firstNumber passed first parameter to add
	 * @param secondNumber passed second parameter to add
	 * @return the response of service call
	 */
	public Addnumbersresponse addNumber(int firstNumber, int secondNumber) {
		Addnumbersrequest reqAddnumbersrequest = new Addnumbersrequest();
		reqAddnumbersrequest.setFirstNumber(firstNumber);
		reqAddnumbersrequest.setSecondNumber(secondNumber);
		return calculatorServicePortType.addNumbers(reqAddnumbersrequest);
		
	}

	/**
	 * @return the calculatorServicePortType
	 */
	public AddNumbersPortType getCalculatorServicePortType() {
		return calculatorServicePortType;
	}

	/**
	 * @param calculatorServicePortType the calculatorServicePortType to set
	 */
	public void setCalculatorServicePortType(
			AddNumbersPortType calculatorServicePortType) {
		this.calculatorServicePortType = calculatorServicePortType;
	}

}
