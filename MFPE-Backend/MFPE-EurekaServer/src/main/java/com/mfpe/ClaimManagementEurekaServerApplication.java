package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClaimManagementEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimManagementEurekaServerApplication.class, args);
	}

}
