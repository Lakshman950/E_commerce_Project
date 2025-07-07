package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.OrderDAO;
import com.DAO.ProductDAO;
import com.Entity.OderDetails;
import com.Entity.ProductDetails;

@Service
public class OrderService {
	
	@Autowired
	ProductDAO dao;
	
	@Autowired
	OrderDAO od;
	
	public ProductDetails  getproductDetails(int id) {
		
		return dao.getProductDetailsById(id);
		 
	}
	
	
	public OderDetails insertProductDetails(OderDetails o) {
		 
		
		return od.insertorderDetails(o);
	}

}
