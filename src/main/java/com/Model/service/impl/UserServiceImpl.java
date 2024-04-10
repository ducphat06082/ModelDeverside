package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Order;
import com.Model.entity.User;
import com.Model.repository.UserRepository;
import com.Model.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	@Override
	public User findByUsername(String username) {
		return userRepository.findById(username).get();
	}
	
	@Override
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByActivateCode(String activateCode) {
        return userRepository.findByActivateCode(activateCode);
    }
    @Override
    public List<Order> findOrderByUser(String username) {
        return userRepository.findOrderByUser(username);
    }
}
