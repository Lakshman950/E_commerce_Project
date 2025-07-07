package com.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.OderDetails;
import com.Repository.OrderRepository;

@Repository
public class OrderDAO {
	
	@Autowired 
	OrderRepository repository;
	
	
	public OderDetails insertorderDetails(OderDetails or) {
		
	return 	repository.save(or);
	}

}
