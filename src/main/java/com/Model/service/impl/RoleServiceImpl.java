package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Role;
import com.Model.repository.RoleRepository;
import com.Model.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleRepository roleRepository;
	@Override
	public Role getRole(String id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> getRoles() {
		return roleRepository.findAll();
	}
}
