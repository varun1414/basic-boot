package com.example.standards.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standards.entity.Hotel;
import com.example.standards.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
