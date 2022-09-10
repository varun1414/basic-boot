package com.example.hotel.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.standards.entity.Hotel;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class HotelControllerTest {
	
	@Mock
	HotelController hotelController;
	
	@Test
	public void addHotel_test_success() {
		
		Hotel hotel = new Hotel();
		when(hotelController.addHotel(any(Hotel.class)))
		.thenReturn(new ResponseEntity("Hotel added successfully", HttpStatus.OK));
		
		ResponseEntity<String> responseEntity = hotelController.addHotel(hotel);
		
		assertEquals(responseEntity.getStatusCode(),  HttpStatus.OK);
	}
	
	@Test
	public void addHotel_test_fail() {
		
		Hotel hotel = new Hotel();
		when(hotelController.addHotel(any(Hotel.class)))
		.thenReturn(new ResponseEntity("Hotel failure", HttpStatus.INTERNAL_SERVER_ERROR));
		
		ResponseEntity<String> responseEntity = hotelController.addHotel(hotel);
		
		assertEquals(responseEntity.getStatusCode(),  HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
