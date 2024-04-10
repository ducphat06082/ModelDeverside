package com.Model.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.Model.entity.Comment;

import com.Model.service.CommentService;


@Controller
public class CommentManagerController {
	
	@Autowired
	CommentService commentservice;

	
	RestTemplate restTemplate = new RestTemplate();
	

	@RequestMapping("/tco-admin/comment/listcomment")
	public String ListComment(Model model) {
	    List<Comment> comment = commentservice.findAll();
		model.addAttribute("comments", comment);
		return "tco-admin/comment/new-cmt.html";
	}
	@RequestMapping("/tco-admin/comment/listcomment1")
	public String ListComment1(Model model) {
	    List<Comment> comment = commentservice.findAll();
		model.addAttribute("comments", comment);
		return "tco-admin/comment/list-cmt.html";
	}
	
	@RequestMapping("/comment/edit1/{id}")
		public String editComment(Model model, @PathVariable("id") Integer id) {
		Comment comment = commentservice.findById(id);
		comment.setStatus(1);
		commentservice.update(comment);
		List<Comment> comment1 = commentservice.findAll();
		model.addAttribute("comments", comment1);
		return "tco-admin/comment/list-cmt.html";
	}
	
	@RequestMapping("/comment/edit2/{id}")
	public String editComment2(Model model, @PathVariable("id") Integer id) {
	Comment comment = commentservice.findById(id);
	comment.setStatus(0);
	commentservice.update(comment);
	List<Comment> comment1 = commentservice.findAll();
	model.addAttribute("comments", comment1);
	return "tco-admin/comment/list-cmt.html";
}
	

	

}