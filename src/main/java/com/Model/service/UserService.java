package com.Model.service;

import java.util.List;

import com.Model.entity.Order;
import com.Model.entity.User;

public interface UserService {
	User findByUsername(String username);
	List<User> getAll();
	User create(User user);
	User update(User user);
	User findByActivateCode(String activateCode);
	List<Order> findOrderByUser(String username);
}
