package com.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Entity.PaymentDetails;
import com.Service.PaymentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PaymentController {

   
	
	@Autowired
	PaymentService ps;


    
	 
	@ResponseBody
	@RequestMapping("/useramount")  
	public String insertPaymentDetails(PaymentDetails pd) {
		
	

         pd.setPaymentdate(LocalDate.now());

         pd.setPaymenttime(LocalTime.now());

		
		ps.insertPaymentDetails(pd);
		
		return "PaymentSuccessfully";
		
	}

}
