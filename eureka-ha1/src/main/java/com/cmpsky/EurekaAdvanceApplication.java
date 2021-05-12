package com.cmpsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaAdvanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAdvanceApplication.class, args);
		System.out.println("fuck you too");
	}

}
