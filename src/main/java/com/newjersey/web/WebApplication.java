package com.newjersey.web;

import com.newjersey.web.mapper.CustomerMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WebApplication {
	@Autowired CustomerMapper mapper;
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
