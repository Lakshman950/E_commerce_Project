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
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class OderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderid;
	private int productid;
	private String customeremailid;
	private LocalDate ordereddate; 
	private LocalTime  orderedtime;
	private String productprice;   
	
	

}
