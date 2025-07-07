package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.ProductDetails;
import com.Repository.ProductRepository;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductRepository pr;
	
	public ProductDetails insertProducts(ProductDetails p) {
		return  pr.save(p); 
		
	}
	
	public List<ProductDetails> AllProductDetails() {
	return  pr.findAll();
		
	}
	
	public ProductDetails getProductDetailsById(int id) {
		 
		return pr.getByProductid(id);  
	}

}
