package com.Model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.entity.OrderDetail;


public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{
	@Query("Select o from OrderDetail o Where o.order.id =?1")
	  List<OrderDetail> findByOrderIdContaining(Integer id);
	
}
