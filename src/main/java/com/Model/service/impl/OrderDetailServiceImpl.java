package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.OrderDetail;
import com.Model.repository.OrderDetailRepository;
import com.Model.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	OrderDetailRepository orderRepo;
	
	@Override
	public List<OrderDetail> findAll() {
		return orderRepo.findAll();
	}

	@Override
	public OrderDetail findById(Integer Id) {
		return orderRepo.findById(Id).get();
	}

	@Override
	public OrderDetail create(OrderDetail order) {
		return orderRepo.save(order);
	}

	@Override
	public OrderDetail update(OrderDetail order) {
		return orderRepo.save(order);
	}

	@Override
	public void delete(Integer id) {
		orderRepo.deleteById(id);
	}

	@Override
	public List<OrderDetail> findByOrderIdContaining(Integer id) {
		return orderRepo.findByOrderIdContaining(id);
	}
	
	
}
