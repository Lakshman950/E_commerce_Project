package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CartDetails {

	
	@Id

	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private int cartid;  
	
	private String productid; 
 
	private String customeremailid;  

}
