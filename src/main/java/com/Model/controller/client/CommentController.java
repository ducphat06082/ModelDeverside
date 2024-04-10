package com.Model.controller.client;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


import com.Model.entity.Comment;
//import com.Model.entity.CommentDto;
import com.Model.entity.Product;
import com.Model.entity.User;
import com.Model.service.CommentService;
import com.Model.service.ProductService;
import com.Model.service.UserService;

@Controller
public class CommentController {

	@Autowired
	CommentService commentService;
	
    
	@Autowired
	UserService userService;
	
	@Autowired
	ProductService productService;

	RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping("/editComment/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		List<Comment> comment = commentService.findByProductIdContaining(id);
		model.addAttribute("comments", comment);
		model.addAttribute("item", item);
		return "tco-client/shop/comment-add.html";
	}
		
	@GetMapping("/addComment")
	public String showAddComment(Model model) {
	    // Tạo một đối tượng Todo mới và thêm vào model
	    model.addAttribute("comments", new Comment());
	    // Trả về tên của view chứa form
	    return "tco-client/shop/comment-add.html";
	}
	
	@PostMapping("/createComment/submit/{id}")
	public String addComment( @ModelAttribute("comments") Comment comment , @PathVariable("id") Product id) {
	    
		comment.setId(null);
		comment.setProducts(id);
		commentService.create(comment);
		System.out.println("====> done");
		return (null);
	}
	


}
	

