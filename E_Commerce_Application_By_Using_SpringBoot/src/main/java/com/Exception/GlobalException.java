package com.Exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Entity.CustomerDetails;


@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(CustomerException.class)
	public String customerexception(CustomerException ex,Model m) {
		
		String s=ex.getMsg();
		m.addAttribute("exception",s);
		
		return "Registration";
		
	}
	
	@ExceptionHandler(LoginpageException.class)
	public String UserLoginException(LoginpageException le,Model m) {
		
		String str=le.getLoginexception();
		
		m.addAttribute("invalid",str);
		return "Loginpage";  
		
	}

}
