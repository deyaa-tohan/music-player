package com.ds.mp.playsongservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient (name = "user-service")
public interface FindUserClient {

	@GetMapping("/{userId}")
	String findUserById(@PathVariable("userId") Long userId);
	
}
