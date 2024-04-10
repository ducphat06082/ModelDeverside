package com.Model.service;

import java.util.List;

import com.Model.entity.Role;

public interface RoleService {
	Role getRole(String id);
	List<Role> getRoles();
}
