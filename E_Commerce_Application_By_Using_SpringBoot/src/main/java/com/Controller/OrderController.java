package com.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Entity.CustomerDetails;
import com.Entity.OderDetails;
import com.Entity.ProductDetails;
import com.Service.OrderService;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {

    
	
	@Autowired
	OrderService service;

   
	
	@RequestMapping("/order")
	public String OrderPage(@RequestParam("id") int id, Model m,HttpSession s) {
		
	ProductDetails p	=service.getproductDetails(id);
		
		m.addAttribute("pay", p);
		
	String email=(String) s.getAttribute("email");
	
	m.addAttribute("email",email); 
	
		
		return "Order";
	}
	
	

	@RequestMapping("/insertorder")
	public String InsertOrderDetails(@RequestParam("cid") int id, @RequestParam("price") String price, OderDetails o, Model m,HttpSession s) {
		
		
		String email = (String) s.getAttribute("email");
		
		
		o.setCustomeremailid(email);
		o.setOrdereddate(LocalDate.now());
		o.setOrderedtime(LocalTime.now());
		o.setProductid(id); 
		o.setProductprice(price);
	
		
		OderDetails details=service.insertProductDetails(o);
		
		m.addAttribute("price",details);  
		
	
		
	
		return "Payment";
	} 
	

}
