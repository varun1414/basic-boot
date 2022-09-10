package com.example.standards.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standards.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
	public List<Hotel> findAllByCity(String city);

	public List<Hotel> findAllByRoomsRequired(int rooms);

	public List<Hotel> findAllByStars(String stars);

	public List<Hotel> findAllByWifiTrue();

	public List<Hotel> findAllByAcTrue();

	public List<Hotel> findAllByRestaurantTrue();

	public List<Hotel> findAllByMealTrue();
	
	


}