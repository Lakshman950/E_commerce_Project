package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Entity.ProductDetails;
import com.Service.ProductService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProductController { 
	
	@Autowired
	CustomerController cc;
	@Autowired 
	ProductService ps; 
	
	@RequestMapping("/productspage") 
	public String Productspage() {  
		return "Admin"; 
		
	}
	

	@ResponseBody
	@RequestMapping("/insert")
	public String insertproductsdetails(ProductDetails p) {
		ps.insertionProducts(p);
		 
     return "Inserted Successfully";  

	}
	// --------------------------------------------//
	
	@RequestMapping("/app")
	public String getalldetails(Model m,HttpSession session) {
		
		List<ProductDetails> list=ps.GetAllproductDetails();
		
		m.addAttribute("products",list);
		
		 String data = (String) session.getAttribute("name");
		 m.addAttribute("admin",data);  
		 
		 
		return  "HomePage";   
	}

}
