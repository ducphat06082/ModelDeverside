package com.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String>{

}
