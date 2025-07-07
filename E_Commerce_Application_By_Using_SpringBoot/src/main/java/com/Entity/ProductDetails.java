package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class ProductDetails {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int productid;
	
	private String productname;
	
	private String productbrand;
	
	private String productcategory;
	
	private double price;  
	
	private double discount;
	
	private int quantity;
	
	private String image;  
	
	
	
	
	

}
