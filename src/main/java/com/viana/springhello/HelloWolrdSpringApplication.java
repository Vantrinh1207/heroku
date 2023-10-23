package com.viana.springhello;

import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWolrdSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWolrdSpringApplication.class, args);
	}



}
