package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails,Integer> {
	
	
ProductDetails	getByProductid(int id);   

}
