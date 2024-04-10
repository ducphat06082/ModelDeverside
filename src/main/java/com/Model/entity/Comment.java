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
@Table(name = "Comment")
public class Comment implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="Product_Id")
	private   Product products ;
	@ManyToOne
	@JoinColumn(name="Username")
	private  User usernames;
	private String comment;
	private Integer Status;
	
	
	public Comment() {
		super();
	}
	public Comment(Integer id, Product products, User usernames, String comment, Integer status) {
		super();
		this.id = id;
		this.products = products;
		this.usernames = usernames;
		this.comment = comment;
		Status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProducts() {
		return products;
	}
	public void setProducts(Product products) {
		this.products = products;
	}
	public User getUsernames() {
		return usernames;
	}
	public void setUsernames(User usernames) {
		this.usernames = usernames;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}




	
	
	
	

}
	
	
	
	
