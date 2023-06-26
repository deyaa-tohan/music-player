package com.ds.mp.addsongservice.repository;

import com.ds.mp.addsongservice.entity.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingRepository extends CrudRepository<Song, Long> {


}
