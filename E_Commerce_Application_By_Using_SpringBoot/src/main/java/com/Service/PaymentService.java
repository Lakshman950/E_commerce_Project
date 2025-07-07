package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.DAO.PaymentDAO;
import com.Entity.PaymentDetails;

@Service
public class PaymentService {
	
	@Autowired
	PaymentDAO dao;
	
	public PaymentDetails insertPaymentDetails(PaymentDetails p) { 
		
		 return dao.insertPaymentDetails(p);
			
		}

}
