package com.Service;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CustomerDAO;
import com.ECommerceApplicationByUsingSpringBootApplication;
import com.Entity.CustomerDetails;
import com.Exception.CustomerException;
import com.Exception.LoginpageException;

@Service
public class CustomerService {


	
	@Autowired
	CustomerDAO dao; 

  	
	public CustomerDetails CustomerRegistration(CustomerDetails c) {
		
		CustomerDetails dto=new CustomerDetails();
		
	List<CustomerDetails> list=dao.fetchalldetails(); 
	int count=0;
	for (CustomerDetails customerDetails : list) {
		if(customerDetails.getCustomeremailid().equals(c.getCustomeremailid())) {
			count++;
		}
		
	}
	if(count==0) {
		dto.setCustomeremailid(c.getCustomeremailid());
		
	}
	else {
		throw new CustomerException("The Emailid Already Exists");
	}
	
	int mobile=0;
	
	for (CustomerDetails customerDetails2 : list) {
		if(customerDetails2.getMobilenumber()==c.getMobilenumber()) {
			mobile++;
		}
		
	}
		if(mobile==0) {
			dto.setMobilenumber(c.getMobilenumber());
		}
		else {
			throw new CustomerException("The Mobile Number Already Exists");
		}
		
		dto.setAddress(c.getAddress());
		dto.setCustomername(c.getCustomername());
		dto.setGender(c.getGender());
		dto.setPassword(c.getPassword());
		
		return dao.insertdetails(dto);
	}
	//
	
	public CustomerDetails validateCustomerDetails(String email,String pass)  {
		
		CustomerDetails d=dao.CustomerDetailsByUsingEmailidAndPassword(email, pass);
		
		if(d!=null) {
			return d;
		}
		
		else {
	       throw new LoginpageException("Invalid Details");  
	
		}
	}

	
}
