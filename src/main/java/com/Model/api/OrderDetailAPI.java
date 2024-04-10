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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.entity.OrderDetail;
import com.Model.entity.Product;
import com.Model.service.OrderDetailService;
import com.Model.service.ProductService;


@CrossOrigin("*")
@RestController
public class OrderDetailAPI {
	@Autowired
	OrderDetailService orderdetail;
	
	@GetMapping()
	public List<OrderDetail> getAll() {
		return orderdetail.findAll();
	}
	
	
	@GetMapping("/api/orderdetail/{id}")
	public OrderDetail getOne(@PathVariable("id") Integer id) {
		return orderdetail.findById(id);
	}
	@GetMapping("/api/orderdetail/find/{id}")
	public List<OrderDetail> getorder(@PathVariable("id") Integer id) {
		return  orderdetail.findByOrderIdContaining(id);
	}
	@PostMapping("api/order")
	public OrderDetail create(@RequestBody OrderDetail order) {
		return orderdetail.create(order);
	}
	
	@PutMapping("/api/orderdetail/{id}")
	public OrderDetail update(@RequestBody  OrderDetail order) {
		return orderdetail.update(order);
	}
	
	@DeleteMapping("/api/orderdetail/{id}")
	public void delete(@PathVariable("id") Integer id) {
		orderdetail.delete(id);
	}
}
