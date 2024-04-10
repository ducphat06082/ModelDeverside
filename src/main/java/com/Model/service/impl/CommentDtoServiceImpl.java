//package com.Model.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Model.entity.Comment;
//import com.Model.entity.CommentDto;
//import com.Model.entity.OrderDetail;
//import com.Model.entity.Product;
//import com.Model.entity.User;
//import com.Model.repository.OrderDetailRepository;
//import com.Model.repository.ProductRepository;
//import com.Model.repository.UserRepository;
//import com.Model.repository.CommentDtoRepository;
//import com.Model.repository.CommentRepository;
//import com.Model.service.CommentDtoService;
//import com.Model.service.CommentService;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Service
//public class CommentDtoServiceImpl implements CommentDtoService{
//	@Autowired
//	CommentDtoRepository commentRepo;
//	@Autowired
//	ProductRepository productRepo;
//	@Autowired
//	UserRepository userRepo;
//	
//	
//	@Override
//	public List<CommentDto> findAll() {
//		return commentRepo.findAll();
//	}
//
//	@Override
//	public CommentDto findById(Integer Id) {
//		return commentRepo.findById(Id).get();
//	}
//
//	@Override
//	public CommentDto create1(CommentDto comment) {
//		System.out.println("" + comment.getUsername());
//		User user = userRepo.findByUsername(comment.getUsername());
//		Product product = productRepo.findById(comment.getProductId()).get();
//		CommentDto cmt = new CommentDto(product, user, comment.getComment());
//	 	return commentRepo.save(cmt);
//	
//	}
//
//	@Override
//	public List<CommentDto> findByProductIdContaining(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Comment create(CommentDto comment) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//	
//}
