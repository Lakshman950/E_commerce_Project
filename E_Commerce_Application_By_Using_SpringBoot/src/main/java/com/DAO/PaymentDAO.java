package com.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.Entity.PaymentDetails;
import com.Repository.PaymentRepository;

@Repository
public class PaymentDAO {
	
	@Autowired
	PaymentRepository pr;
	
	public PaymentDetails insertPaymentDetails(PaymentDetails p) {
		
	 return pr.save(p);  
		
	}
	
	

}
