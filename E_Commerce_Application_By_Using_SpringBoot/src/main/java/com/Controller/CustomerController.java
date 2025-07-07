package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.CustomerDetails;
import com.Repository.CustomerRepository;
import com.Service.CustomerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {

   
	@Autowired
	CustomerService cs;

   
	
	@RequestMapping("/page") 
	public String REgistration() { 
		return "Registration"; 
		
	} 
	
	@RequestMapping("/signup")
	public String insertCustomerDetails(CustomerDetails d) {
		
		cs.CustomerRegistration(d); 
		
		
		return "redirect:/loginpage";  
	}
	
	@RequestMapping("/loginpage") 
	public String CustomerLogin() {  
		
		return "Loginpage";   
		
	}
	
	@RequestMapping("/login")
	public String Loginpage(@RequestParam("email")String  email,@RequestParam("pass") String pass, HttpSession session) {
	
 	CustomerDetails ds	=cs.validateCustomerDetails(email,pass);  
		  
 	 session.setAttribute("name", ds.getCustomername());  
 	 
 	 session.setAttribute("email", ds.getAddress());   
 	 
		return "redirect:/app";    
		
		
		
	}
	

}
