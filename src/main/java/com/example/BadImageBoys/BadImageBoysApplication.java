package com.example.BadImageBoys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.BadImageBoys.Models")

public class BadImageBoysApplication
{
	public static void main(String[] args) {
		SpringApplication.run(BadImageBoysApplication.class, args);
	}
}
