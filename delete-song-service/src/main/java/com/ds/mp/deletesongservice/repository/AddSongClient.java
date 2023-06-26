package com.ds.mp.deletesongservice.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient (name = "add-song")
public interface AddSongClient {

	@GetMapping("/{id}")
	String deleteSong(@PathVariable("id") Long id);
	
}
