package com.ds.mp.addsongservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "song")
public class Song {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String title;

	private Long userId;

//	@JsonIgnore
	private Date createDate;

	public Song() {

	}

	public Song(String title, Long userId, Date createDate) {
		this.title = title;
		this.userId = userId;
		this.createDate = createDate;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "\tSong ID: " + this.id +
				"   \n" + "Song Title: " + this.title +
				"   \n" + "User Id: " + this.userId +
				"   \n" + "Date Create Song: " + this.createDate ;
	}
}
