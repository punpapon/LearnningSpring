package com.code.springdemo.mvc.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	// new controller method
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model){
		
		// read parameter
		String theNaame = request.getParameter("studentName");
		
		// convert data
		theNaame = theNaame.toUpperCase();
		
		// create message
		String result = "Yo!" + theNaame;
		
		// add message to the model
		model.addAttribute( "message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName , Model model){
		
		// convert data
		theName = theName.toUpperCase();
		
		// create message
		String result = "Hey My Friend!" + theName;
		
		// add message to the model
		model.addAttribute( "message", result);
		
		return "helloworld";
	}
	
}
