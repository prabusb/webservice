/**
 * 
 */
package com.tcs.service.webservices.consumer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * @author 9501800
 *
 */
@Controller
@RequestMapping("/addNumber")
public class LearnController {   

    /**
     * 
     * @param model
     * @return
     */
    @RequestMapping(value="/addNumber")
    public String addNumbers(HttpServletRequest request, Model model) {
    	return "addNumber";
    }
    
}