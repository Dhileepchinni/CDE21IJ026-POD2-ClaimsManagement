package com.mfpe.memberService;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableEurekaClient
@EnableSwagger2
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.mfpe.memberService")
public class MemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);
	}
	
	@Bean
	public Docket configureSwagger2(){
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.any())
					.apis(RequestHandlerSelectors.basePackage("com.mfpe.memberService"))
			
					.build()
					.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfo(
				"Member Module",
				"Claims Management Microservice",
				"1.0",
				"Dhileep - Programmer Analyst Trainee || Full Stack ...in.linkedin.com",
				new Contact("Dhileep", "something.com","dhileepchinni2122@cognizant.com"),
				"FSE", "https://hello.Dipashri.com",
				Collections.emptyList()
		);
	}
	

}
