package com.Model.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.Model.entity.Category;
import com.Model.entity.Comment;
import com.Model.service.CategoryService;
import com.Model.service.CommentService;

@RestController
@CrossOrigin("*")

public class CommentAPI {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/api/comments")
	public ResponseEntity<List<Comment>> getComment(){
		return ResponseEntity.ok(commentService.findAll());
	}
	
	@GetMapping("/api/comment")
	public List<Comment> getAll(){
		return commentService.findAll();
	}
	// lấy dữ liệu
	@GetMapping("/api/comment/{id}")
	public Comment getOne(@PathVariable("id") Integer id) {
		return commentService.findById(id);
	}
	//tạo mới dữ liệu
	 @PostMapping("/api/comment")
	 public Comment create(@RequestBody Comment comment) {
	 return commentService.create(comment); }
	
	//cập nhập dữ liệu
	@PutMapping("/api/comment/{id}")
	public Comment update(@RequestBody Comment comment) {
		return commentService.update(comment);
	}
	//Xóa dữ liệu
	@DeleteMapping("/api/comment/{id}")
	public void delete(@PathVariable("id") Integer id) {
		commentService.delete(id);
	}
}
