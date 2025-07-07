package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.CustomerDetails;
import com.Repository.CustomerRepository;

@Repository
public class CustomerDAO {
	
	@Autowired
	CustomerRepository cr;
	
	
	public List<CustomerDetails> fetchalldetails() {
		return cr.findAll(); 
		
	}

	
	public CustomerDetails insertdetails(CustomerDetails d) {
		return cr.save(d);
	}
	
	public CustomerDetails CustomerDetailsByUsingEmailidAndPassword(String email,String pass) { 
		
		return cr.getByCustomeremailidAndPassword(email, pass);
	}
}
