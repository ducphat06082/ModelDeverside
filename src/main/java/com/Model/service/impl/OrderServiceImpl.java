package com.Model.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Order;
import com.Model.entity.OrderDetail;
import com.Model.repository.OrderDetailRepository;
import com.Model.repository.OrderRepository;
import com.Model.service.OrderService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	OrderDetailRepository orderDRepo;
	
	@Override
	public List<Order> findAll() {
		return orderRepo.findAll();
	}

	@Override
	public Order findById(Integer Id) {
		return orderRepo.findById(Id).get();
	}

	@Override
	public Order create(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public Order update(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public void delete(Integer id) {
		orderRepo.deleteById(id);
	}
	@Override
	public Order create1(JsonNode orderData) {
		ObjectMapper mapper=new ObjectMapper();
		Order order = mapper.convertValue(orderData, Order.class);
		orderRepo.save(order);
		
		TypeReference<List<OrderDetail>> type=new TypeReference<List<OrderDetail>>() {
		};
		List<OrderDetail> details= mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d->d.setOrder(order)).collect(Collectors.toList());
		orderDRepo.saveAll(details);
		
		return order;
		
	}

	
}
