package com.example.standards.dao;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.standards.entity.Hotel;
import com.example.standards.entity.Review;
import com.example.standards.entity.User;
import com.example.standards.repository.HotelRepository;
import com.example.standards.repository.ReviewRepository;
import com.example.standards.repository.UserRepository;

/*
 * Methods to access the repository functions
 */

@Component
public class CustomORM {

	@Autowired
	HotelRepository hotelRepo;	
		
	@Autowired
	ReviewRepository reviewRepo;
	
	@Autowired
	UserRepository userRepo;


	
	public void addHotel(Hotel hotel) {
		hotelRepo.save(hotel);
	}
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public void addReview(Review review) {
		reviewRepo.save(review);
	}
	
	public List<Hotel> getHotelBycity(String city) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByCity(city);
	}

	public List<Hotel> getHotelByRooms(int rooms) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByRoomsRequired(rooms);
	}

	public List<Hotel> getHotelByStars(String stars) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByStars(stars);
	}

	public List<Hotel> getHotelByWifi(String facility) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByWifiTrue();
	}
	
	public List<Hotel> getHotelByAc(String facility) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByAcTrue();
	}
	
	public List<Hotel> getHotelByRest(String facility) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByRestaurantTrue();
	}
	
	public List<Hotel> getHotelByMeal(String facility) {
		// TODO Auto-generated method stub
		return hotelRepo.findAllByMealTrue();
	}

	public List<Review> getReviewByHotelName(String hotelName) {
		// TODO Auto-generated method stub
		return reviewRepo.findAllByHotel_Name(hotelName);
	}

	public void deleteReviewById(Long id) {
		// TODO Auto-generated method stub
		reviewRepo.deleteById(id);
		
	}
	
	public void deleteHotelById(Long id) {
		// TODO Auto-generated method stub
		hotelRepo.deleteById(id);
		
	}
	
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

	public Hotel getHotelById(Long id) {
		// TODO Auto-generated method stub
		Hotel hotel =  hotelRepo.findById(id).orElse( null );
		return hotel;
	}

	public List<Review> getReviewByHotelId(Long id) {
		// TODO Auto-generated method stub
		return reviewRepo.findAllByHotel_Id(id);
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElse(null);
	}

	public List<Review> getReviewByUserId(Long id) {
		// TODO Auto-generated method stub
		return reviewRepo.findAllByUser_Id(id);
	}
	
	
	
}
