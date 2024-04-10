package com.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.entity.Variation;

@Repository
public interface VariationRepository extends JpaRepository<Variation, String>{

}
