package com.ds.mp.addsongservice.controller;

import com.ds.mp.addsongservice.entity.Song;
import com.ds.mp.addsongservice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/")
public class SongController {

	@Autowired
	private SongService songService;

	@PostMapping ("/add")
	public ResponseEntity<?> add(@RequestBody Song song){
		return ResponseEntity.ok(songService.save(song));
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> get(@PathVariable ("id") Long id){
		return ResponseEntity.ok(songService.getSong(id).toString());
	}

	@GetMapping("/{id}")
	public String deleteSongById(@PathVariable("id") Long id){
		return songService.deleteSong(id);
	}

	@DeleteMapping ("/{id}")
	public void delete(@PathVariable ("id") Long id){
		songService.deleteById(id);
	}

}
