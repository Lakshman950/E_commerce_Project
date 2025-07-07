package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ProductDAO;
import com.Entity.ProductDetails;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO dao;
	
	public ProductDetails insertionProducts(ProductDetails d) {
		return dao.insertProducts(d); 
		
	}
	
	public List<ProductDetails> GetAllproductDetails() {
		return dao.AllProductDetails(); 
		
	}
	
	public ProductDetails GetproductDetailsById(int id) {  
		
	return 	dao.getProductDetailsById(id); 
	}

}
