/**
 * 
 */
package com.tcs.service.webservices.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.service.webservice.addnumbers.addnumbersresponse.response.Addnumbersresponse;

/**
 * Class to add numbers by calling connector class.
 * 
 * @author Prabu S B
 * @version 1.0
 * @since 06-Dec-2013 
 *
 */
public class AddNumbers {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"webservice-service-consumer.xml"}); 		
		WebServiceconnector connector = context.getBean("calculatorServiceConnector", WebServiceconnector.class);
		Addnumbersresponse response = connector.addNumber(3, 4);
		System.out.println("Result: " + response.getResult());		
	}

}
