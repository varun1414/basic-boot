package com.example.standards.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	Long id;
	
	String name;
	
	String city;
	
	String gender;
	
	@OneToMany(mappedBy="user", cascade = {CascadeType.ALL})
	transient Set<Review> review;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public Set<Review> getReview() {
		return review;
	}

	public void setReview(Set<Review> review) {
		this.review = review;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	


	
	
	
}
