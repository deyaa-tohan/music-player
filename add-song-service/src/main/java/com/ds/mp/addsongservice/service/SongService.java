package com.ds.mp.addsongservice.service;

import com.ds.mp.addsongservice.entity.Song;
import com.ds.mp.addsongservice.repository.SingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class SongService {

	@Autowired
	private SingRepository repository;
	public Song save(Song song) {
		return repository.save(song);
	}

	public Optional<Song> getSong(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}


	public String deleteSong(Long id){
		if (getSong(id).isPresent()) {
			repository.deleteById(id);
			return "The Song Is Deleted Successfully";
		}else {
			return "The Song IS Not Exist";
		}
	}
}
