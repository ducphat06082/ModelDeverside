package com.Model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Model.entity.Product;
import com.Model.repository.ProductRepository;
import com.Model.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository pdao;

	@Override
	public List<Product> findAll() {
		return pdao.findAll();
	}
	
	@Override
	public Page<Product> findAll(int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber -1,8);
		return pdao.findAll(pageable);
	}

	@Override
	public Page<Product> findByCategoryId(String cid, int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber -1,8);
		return pdao.findAllByCategoryIdLike(cid, pageable);
	}
	
    @Override
    public Page<Product> findBySubcategoryId(String scid, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber -1,8);
        return pdao.findBySubcategoryId(scid, pageable);
    }
	
	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Page<Product> findProductPage(int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber - 1, 8);
		return pdao.findAll(pageable);
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);
	}

	@Override
	public Product update(Product product) {
		return pdao.save(product);
	}

	@Override
	public Product create(Product product) {
		return pdao.save(product);
	}

}
