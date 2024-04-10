package com.Model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders_Detail")
public class OrderDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "Order_Id")
	private Order order;
	@ManyToOne
	@JoinColumn(name = "Product_Id")
	private Product product;
	private Integer quantity;
	private Double price;
	private String name_product;
	public OrderDetail() {
		super();
	}
	public OrderDetail(Integer id, Order order, Product product, Integer quantity, Double price,Integer status, String name_product) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.name_product= name_product;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name_product;
	}
	public void setName(String name_product) {
		this.name_product = name_product;
	}
	

}
