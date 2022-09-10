package com.example.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.standards.StandardsApplication;



@SpringBootApplication(scanBasePackages={"com.example"})
public class HotelApplication {
	public static void main(String[] args) {
		StandardsApplication ss = new StandardsApplication();
		SpringApplication.run(HotelApplication.class, args);
	}

}
