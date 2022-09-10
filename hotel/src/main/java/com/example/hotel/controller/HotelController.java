package com.example.hotel.controller;


import java.util.Date;
import java.util.List;

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

import com.example.hotel.service.HotelService;
import com.example.standards.entity.Hotel;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	
	/*
	 * Controller to add a new hotel
	 */
	@PostMapping("/hotel/add")
	public ResponseEntity<String> addHotel(@RequestBody Hotel hotel) {
		return hotelService.addHotel(hotel);
	}
	
	
	/*
	 * Controller to get a hotel based on specified params
	 */
	@GetMapping("/hotel/search")
	public JsonNode getHotel(
			@RequestParam(required = false) String city, 
			@RequestParam(required = false) Date date, 
			@RequestParam(required = false) Integer rooms,
			@RequestParam(required = false) String stars, 
			@RequestParam(required = false) List<String> facilities
			){
			return hotelService.getHotel(city, date, rooms, stars, facilities);
			}
	
	/*
	 * Controller to delete hotel record based on the id
	 */
	 @DeleteMapping("/hotel/delete/{id}")
	 public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
	    return hotelService.deleteRecord(id);
	 }
	 
	/*
	 * Controller to update hotel record based on the id
	 */
	 @PutMapping("/hotel/update/{id}")
	 public ResponseEntity<String> updateRecord(@PathVariable("id") Long id, 
			 @RequestBody Hotel hotel) {
	    return hotelService.updateHotel(id, hotel);
	 }
}
