package com.Model.service;

import java.util.List;

import com.Model.entity.OrderDetail;

public interface OrderDetailService {
	List<OrderDetail> findAll();
	OrderDetail findById(Integer id);
	OrderDetail create(OrderDetail order);
	OrderDetail update(OrderDetail order);
	void delete(Integer id);
	List<OrderDetail> findByOrderIdContaining(Integer id);
	
}
