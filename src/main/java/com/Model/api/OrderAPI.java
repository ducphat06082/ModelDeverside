package com.Model.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.entity.Order;
import com.Model.service.OrderService;

@RestController
@CrossOrigin("*")
public class OrderAPI {
	@Autowired
	OrderService orderservice;
	
//	@GetMapping("/api/order")
//	public ResponseEntity<List<Order>> getOrder(){
//		return ResponseEntity.ok(orderservice.findAll());
//	}
	
	@GetMapping("/api/orders")
	public List<Order> getAll(){
		return orderservice.findAll();
	}
	
	@GetMapping("/api/orders/{id}")
	public Order getOne(@PathVariable("id") Integer id) {
		return orderservice.findById(id);
	}
	
	@PostMapping("/api/orders")
	public Order create(@RequestBody Order order) {
		return orderservice.create(order);
	}
	
	@PutMapping("/api/orders/{id}")
	public Order update(@RequestBody Order order) {
		return orderservice.update(order);
	}
	
	@DeleteMapping("/api/orders/{id}")
	public void delete(@PathVariable("id") Integer id) {
		orderservice.delete(id);
	}
}
