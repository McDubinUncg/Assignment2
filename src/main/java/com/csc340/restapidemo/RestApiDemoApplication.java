package com.csc340.restapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
            
            RestApiController api = new RestApiController();
            
            api.getRandomDog();
		SpringApplication.run(RestApiDemoApplication.class, args);
	}

}
