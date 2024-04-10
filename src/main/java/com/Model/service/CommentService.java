package com.Model.service;

import java.util.List;

import com.Model.entity.Comment;


public interface CommentService {
	List<Comment> findAll();
	Comment findById(Integer id);
	List<Comment> findByProductIdContaining(Integer id);
	Comment create(Comment comment);
	Comment update(Comment comment);
	void delete(Integer id);
	List<CommentService> findByOrderIdContaining(Integer id);
	
	
}