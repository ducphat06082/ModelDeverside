package com.Model.controller.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.entity.Order;
import com.Model.service.OrderService;
import com.fasterxml.jackson.databind.JsonNode;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping
	public Order creat(@RequestBody JsonNode orderData) {
		return orderService.create1(orderData);
	}
	
	
	
	
}
