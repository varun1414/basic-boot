package com.example.user.controller;
import com.example.standards.entity.Hotel;
import com.example.standards.entity.User;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	

	
	@PostMapping("/user/add")
	public ResponseEntity<String> addUser(@RequestBody User user) {
			return userService.addUser(user);
	}

	@DeleteMapping("/user/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
			return userService.deleteRecord(id);
	}
	
	 @PutMapping("/user/update/{id}")
	 public ResponseEntity<String> updateRecord(@PathVariable("id") Long id, 
			 @RequestBody User user) {
	    return userService.updateUser(id, user);
	 }
}
