package com.Model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.entity.Comment;



public interface CommentRepository extends JpaRepository<com.Model.entity.Comment, Integer>{

	Optional<Comment> findById(Integer id);
	@Query("Select o from Comment o Where o.products.id =?1")
	  List<Comment> findByProductIdContaining(Integer id);
	

}
