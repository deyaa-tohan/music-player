package com.ds.mp.deletesongservice.controller;

import com.ds.mp.deletesongservice.repository.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class SongController {
	@Autowired
	private SongService songService;

	@GetMapping ("/{id}")
	public String deleteAddedSong(@PathVariable ("id") Long id) {
		return songService.deleteAddedSongById(id);
	}

}
