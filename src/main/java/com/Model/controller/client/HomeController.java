package com.Model.controller.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Model.entity.Order;
import com.Model.entity.Product;
import com.Model.service.OrderService;
import com.Model.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	ProductService productService;
	@Autowired
	OrderService orderService;

	@RequestMapping("/home")
	public String getAll(Model model) {
		return page(model, 1);
	}

	@RequestMapping("/home/{pageNumber}")
	public String page(Model model, @PathVariable("pageNumber") int currentPage) {
		Page<Product> page = productService.findAll(currentPage);
		int totalPages = page.getTotalPages();
//		long totalItems = page.getTotalElements();
		List<Product> list = page.getContent();

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("items", list);

		return "tco-client/layout-home/home.html";
	}
	@RequestMapping("/order/detail/{id}")
	public String detail (@PathVariable("id") Integer id, Model model) {
		model.addAttribute("order",orderService.findById(id));
		return "tco-client/shop/detail.html";
	}
	@RequestMapping("/editStatus/{id}")
	public String editOrder3(Model model, @PathVariable("id") Integer id) {
		Order order= orderService.findById(id);
		order.setStatus(3);
		orderService.update(order);
		Order list = orderService.findById(id);
		model.addAttribute("order",list);
		return "tco-client/shop/detail.html";
	}
}
