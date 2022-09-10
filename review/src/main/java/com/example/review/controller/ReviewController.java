package com.example.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.service.ReviewService;
import com.example.standards.entity.Review;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	
	@PostMapping("/review/add")
	public ResponseEntity<String> addReview(@RequestBody Review review) {
		return reviewService.addReview(review);
	}
	
	
	@GetMapping("/review/search")
	public JsonNode getReview(
			@RequestParam(required = false) String hotelName, 
			@RequestParam(required = false) String city, 
			@RequestParam(required = false) String gender, 
			@RequestParam(required = false) String rating
			) throws Exception{
				return reviewService.getReview(hotelName, city, gender, rating);
		}
}