package com.Model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Model.entity.Order;
import com.Model.entity.OrderDetail;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	
}
