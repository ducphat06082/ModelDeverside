package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Category;
import com.Model.repository.CategoryRepository;
import com.Model.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository categoryRepo;
	
	@Override
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}

	@Override
	public Category findById(String categoryId) {
		return categoryRepo.findById(categoryId).get();
	}

	@Override
	public Category create(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public Category update(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public void delete(String id) {
		categoryRepo.deleteById(id);
	}
	
}
