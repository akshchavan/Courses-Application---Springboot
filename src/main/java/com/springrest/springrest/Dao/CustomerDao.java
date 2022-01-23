package com.springrest.springrest.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springrest.springrest.dto.OrderResponse;
import com.springrest.springrest.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{
	
	

}
