package com.ds.mp.playsongservice.controller;


import com.ds.mp.playsongservice.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PlayController {

	@Autowired
	private FindService service;

	@GetMapping("/{id}")
	public String find(@PathVariable Long id){
		return service.findUserPlaySongById(id);
	}


}
