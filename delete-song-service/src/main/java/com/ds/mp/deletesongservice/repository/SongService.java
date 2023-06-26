package com.ds.mp.deletesongservice.repository;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {
	@Autowired
	private AddSongClient songClient;

	@HystrixCommand (groupKey = "deleteSong", fallbackMethod = "fallBackCallAddedSong")
	public String deleteAddedSongById(Long id) {
		return songClient.deleteSong(id);
	}

	public String fallBackCallAddedSong(Long id) {
		return "Fallback response for deleteAddedSongById";
	}
}
