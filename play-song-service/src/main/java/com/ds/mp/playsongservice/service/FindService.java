package com.ds.mp.playsongservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindService {

	@Autowired
	private FindUserClient userClient;

	@HystrixCommand (groupKey = "findUser", fallbackMethod = "fallBackCallPlaySong")
	public String findUserPlaySongById(Long id) {
		return userClient.findUserById(id);
	}

	public String fallBackCallPlaySong(Long id) {
		return "Fallback response for findUserPlaySongById";
	}
}
