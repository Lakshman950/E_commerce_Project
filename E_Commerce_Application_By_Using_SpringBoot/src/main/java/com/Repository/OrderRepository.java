package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.OderDetails;

public interface OrderRepository extends JpaRepository<OderDetails, Integer> {
	

}
