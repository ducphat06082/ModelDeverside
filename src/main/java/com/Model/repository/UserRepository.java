package com.Model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Model.entity.Order;
import com.Model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    @Query("Select u from User u Where u.activateCode =?1")
    User findByActivateCode(String activadeCode);
    
    @Query("Select o from Order o Where o.user.username =?1")
    List<Order> findOrderByUser(String username);
    
    User findByUsername(String username);
}
