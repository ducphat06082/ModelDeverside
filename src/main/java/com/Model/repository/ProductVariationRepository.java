package com.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.entity.ProductVariation;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer>{

}
