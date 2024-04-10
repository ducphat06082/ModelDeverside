package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.entity.Subcategory;
import com.Model.repository.SubcategoryRepository;
import com.Model.service.SubcategoryService;

@Service
public class SubcategoryServiceImpl implements SubcategoryService{
	@Autowired
	SubcategoryRepository subcategoryRepo;

	@Override
	public List<Subcategory> findAll() {
		return subcategoryRepo.findAll();
	}

	@Override
	public List<Subcategory> findByCategoryId(String categoryId) {
		return subcategoryRepo.findByCategoryId(categoryId);
	}

	@Override
	public Subcategory findById(String subcategoryId) {
		return subcategoryRepo.findById(subcategoryId).get();
	}

	@Override
	public void delete(String id) {
		subcategoryRepo.deleteById(id);
	}

	@Override
	public Subcategory create(Subcategory subcategory) {
		return subcategoryRepo.save(subcategory);
	}

	@Override
	public Subcategory update(Subcategory subcategory) {
		return subcategoryRepo.save(subcategory);
	}
	
	
}
