package com.example.standards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standards.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

	List<Review> findAllByHotel_Name(String name);

	List<Review> findAllByHotel_Id(Long id);

	List<Review> findAllByUser_Id(Long id);

}
