package com.Model.api;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.entity.Order;
import com.Model.entity.Role;
import com.Model.entity.User;
import com.Model.service.RoleService;
import com.Model.service.UserService;
import com.Model.util.PasswordUtil;

@RestController
@CrossOrigin("*")
public class UserAPI {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    PasswordUtil passwordUtil;
    @GetMapping("/api/user")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.getAll());
    }
    @GetMapping("/api/find/{username}")
    public List<Order> getOrder(@PathVariable("username") String username){
        return userService.findOrderByUser(username);
    }

    @GetMapping("/api/user/{username}")
    public ResponseEntity<User> getUser(@PathVariable("username") String username) {
        return ResponseEntity.ok(userService.findByUsername(username));
    }
    
    @PostMapping("/api/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        String activateCode = user.getUsername() + String.valueOf(passwordUtil.generatePassword(8));
        user.setActivateCode(activateCode);
        String forgotPassworCode = user.getUsername() + String.valueOf(passwordUtil.generatePassword(9));
        user.setForgotPasswordCode(forgotPassworCode);
        Role userRole = roleService.getRole(user.getRole().getId());
        user.setRole(userRole);
        
        try {
            User userInDatabase = userService.findByUsername(user.getUsername());
            if(userInDatabase != null) {
                return ResponseEntity.badRequest().build();                      
            }
        } catch (NoSuchElementException nSEE) {
            User createdUser = userService.create(user);
            return ResponseEntity.ok(createdUser);
        }
        
        return ResponseEntity.ok(user);
    }
    @PostMapping("/api/user/change-password") 
    public ResponseEntity<User> changePasword(@RequestBody User user) {
        try {
            User userInDB = userService.findByUsername(user.getUsername());          
            if(user.getPassword().equals(userInDB.getPassword())) {
                return ResponseEntity.badRequest().body(userInDB);
            }
            userInDB.setPassword(user.getPassword());
            userService.update(userInDB);
            return ResponseEntity.ok(userInDB);
        } catch (NoSuchElementException nSEE) {
            System.out.println(nSEE.getMessage());
            return ResponseEntity.notFound().build();
        }
    }
}
