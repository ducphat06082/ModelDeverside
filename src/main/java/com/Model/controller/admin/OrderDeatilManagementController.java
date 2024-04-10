package com.Model.controller.admin;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Model.entity.Category;
import com.Model.entity.Order;
import com.Model.entity.OrderDetail;
import com.Model.entity.Product;
import com.Model.service.OrderDetailService;
import com.Model.service.OrderService;

@Controller
public class OrderDeatilManagementController {

	@Autowired
	OrderDetailService orderservice;

	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/find/{id}")
	public String editOrder(Model model, @PathVariable("id")Integer id) {
		List <OrderDetail> order=  orderservice.findByOrderIdContaining(id);
		model.addAttribute("orders", order);
		return "tco-admin/order/order-detail.html";
	}
//
//	@RequestMapping("/tco-admin/category/{id}")
//	public String editCategory(Model model, @PathVariable("id") String id) {
//		Category category = categoryService.findById(id);
//		category.setIcon(category.getIcon());
//		model.addAttribute("categoryForm", category);
//		return "tco-admin/category/main-category.html";
//	}
//
//	@RequestMapping("/tco-admin/category/submit")
//	public String submitCategory(RedirectAttributes redirecAttributes, Model model,
//			@Validated @ModelAttribute("categoryForm") Category category, Errors errors,
//			@RequestParam("imageIcon") Optional<MultipartFile> imageIcon) {
//		
//		if(errors.hasErrors()) {
//			category.setId(null);
//			model.addAttribute("errorMessage", "Thêm danh mục thất bại!");
//			return "tco-admin/category/main-category";
//		}
//		
//		
//		String categoryId = category.getId();
//		String categoryIdRemoveSpace = categoryId.replaceAll(" ", "");
//		String categoryIdRemoveSpecialCharacter = categoryIdRemoveSpace.replaceAll("[^a-zA-Z0-9]", "");
//		category.setId(categoryIdRemoveSpecialCharacter);
//		setImageIcon(category, 1, imageIcon);
//		try {
//		    Category existCategory = categoryService.findById(categoryIdRemoveSpecialCharacter);
//		    if(existCategory != null) {
//		        redirecAttributes.addFlashAttribute("message", "Thêm danh mục thất bại! Mã danh mục đã tồn tại!  ");
//                redirecAttributes.addFlashAttribute("categoryForm", category);                         
//	        }  
//		} catch(NoSuchElementException e) {
//		    String url = "http://localhost:8080/api/categories/";
//            HttpEntity<Category> httpEntity = new HttpEntity<>(category);
//            ResponseEntity<Category> categoryEntity = restTemplate.postForEntity(url, httpEntity, Category.class);
//            category = categoryEntity.getBody();
//            redirecAttributes.addFlashAttribute("message", "Thêm danh mục thành công!");
//            redirecAttributes.addFlashAttribute("categoryForm", category);
//		}
//		return "redirect:/tco-admin/category";
//
//	}
//
	
//
//	@RequestMapping("/tco-admin/category/delete/{id}")
//	public String deleteCategory(RedirectAttributes redirectAttributes, @PathVariable("id") String id) {
//		String url = "http://localhost:8080/api/categories/" + id;
//		restTemplate.delete(url);
//		redirectAttributes.addFlashAttribute("message", "Delete succesfully!");
//		return "redirect:/tco-admin/category";
//	}
//
//	private void setImageIcon(Category category, Integer IconNumber, Optional<MultipartFile> multipartFile) {
//		String fileName = "default-category.png";
//		if (!multipartFile.get().isEmpty()) {
//			fileName = multipartFile.get().getOriginalFilename();
//		}
//		switch (IconNumber) {
//		case 1: {
//			if (category.getIcon() == null || category.getIcon().equals("default-category.png")) {
//				category.setIcon(fileName);
//			} else {
//				category.setIcon(category.getIcon());
//			}
//			break;
//		}
//		default:
//			throw new IllegalArgumentException(IconNumber + "invalid");
//		}
//	}
}
