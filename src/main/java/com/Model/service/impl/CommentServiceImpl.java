package com.Model.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Comment;
import com.Model.entity.OrderDetail;
import com.Model.entity.Product;
import com.Model.entity.User;
import com.Model.repository.OrderDetailRepository;
import com.Model.repository.ProductRepository;
import com.Model.repository.UserRepository;
import com.Model.repository.CommentRepository;
import com.Model.service.CommentService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	CommentRepository commentRepo;
	@Autowired
	ProductRepository productRepo;
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public List<Comment> findAll() {
		return commentRepo.findAll();
	}

	@Override
	public Comment findById(Integer Id) {
		return commentRepo.findById(Id).get();
	}

	@Override
	public Comment create(Comment comment) {
		return commentRepo.save(comment);
	}

   
 	@Override
	public Comment update(Comment comment) {
		return commentRepo.save(comment);
	}

	@Override
	public void delete(Integer id) {
		commentRepo.deleteById(id);
	}

	@Override
	public List<CommentService> findByOrderIdContaining(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Comment> findByProductIdContaining(Integer id) {
		return commentRepo.findByProductIdContaining(id);
	}



	

	
}
