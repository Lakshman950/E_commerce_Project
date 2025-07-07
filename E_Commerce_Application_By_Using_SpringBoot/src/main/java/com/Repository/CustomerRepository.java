package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {
	
	
    CustomerDetails getByCustomeremailidAndPassword(String email,String password);

}
