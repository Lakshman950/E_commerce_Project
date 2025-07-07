package com.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDetails {
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	private int paymentid;
	private int productid; 
	private String customeremailid;  
	private String totalprice; 
	private String paymenttype;
	private LocalDate paymentdate;
	private LocalTime paymenttime; 

}
