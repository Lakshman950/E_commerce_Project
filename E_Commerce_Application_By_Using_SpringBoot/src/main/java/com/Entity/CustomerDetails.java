package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString 
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int customerid; 
	
	private String customername;
	
	private String customeremailid;  
	
	private  long mobilenumber;
	
	private String password;
	
	private String gender;
	
	private String address;

}
