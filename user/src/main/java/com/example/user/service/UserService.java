package com.example.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.standards.dao.CustomORM;
import com.example.standards.entity.Hotel;
import com.example.standards.entity.Review;
import com.example.standards.entity.User;
import com.example.user.controller.UserController;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class UserService {

	@Autowired
	CustomORM custom;

	Logger logger = LoggerFactory.getLogger(UserService.class);

	public ResponseEntity<String> addUser(User user) {
		// TODO Auto-generated method stub
		try {
			custom.addUser(user);
			return new ResponseEntity("User added successfully", HttpStatus.OK);

		} catch(Exception e) {
			logger.error("UserService.addUser -> Exception",e);
			return new ResponseEntity("adding user failure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> deleteRecord(Long id) {
		// TODO Auto-generated method stub
		try {
			List<Review> reviewList = custom.getReviewByUserId(id);
			if( reviewList != null && !reviewList.isEmpty() ) {
				for( Review review : reviewList ) {
					custom.deleteReviewById( review.getId() );
				}
			}
			custom.deleteUserById( id );
			return new ResponseEntity("Hotel deleted successfully", HttpStatus.OK);

		}catch(Exception e) {
			logger.error("HotelService.delete -> Exception",e);

			return new ResponseEntity("Hotel deletion failed", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		String message = "User updated successfully";
		User updateUser = custom.getUserById(id);
		try {
			if(updateUser != null) {
				 user.setId( id );
				 custom.addUser(user);	
			} else {
				message = "User not found ";
			}
			return new ResponseEntity(message, HttpStatus.OK);
		} catch(Exception e) {
			logger.error("UserService.update -> Exception",e);
			return new ResponseEntity("updating user failure", HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}



}
