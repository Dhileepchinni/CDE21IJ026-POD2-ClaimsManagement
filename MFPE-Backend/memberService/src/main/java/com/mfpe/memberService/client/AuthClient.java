package com.mfpe.memberService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.mfpe.memberService.dto.ValidatingDTO;



@FeignClient(name = "authorization-service", url = "${Authorization.URL}")
public interface AuthClient {
	
	 @GetMapping(value = "/validate")
     public ValidatingDTO getsValidity(@RequestHeader(name = "Authorization", required = true) String token);

}



//Feign client - We can call other microservices. 