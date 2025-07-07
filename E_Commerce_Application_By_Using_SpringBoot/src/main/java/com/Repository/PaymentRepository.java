package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.PaymentDetails;

public interface PaymentRepository extends JpaRepository<PaymentDetails, Integer> { 
	
	
	 
	

}
