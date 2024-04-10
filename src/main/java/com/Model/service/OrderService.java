package com.Model.service;

import java.util.List;

import com.Model.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {
	List<Order> findAll();
	Order findById(Integer id);
	Order create(Order order);
	Order update(Order order);
	void delete(Integer id);
	Order create1(JsonNode orderData);

}
