package com.ds.mp.playsongservice.model;


public class Song {
	private Long id;
	private String title;

	private Long userId;

	private String createDate;

	public Song() {

	}

	public Song(String title , Long userId, String createDate) {
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Song ID: " +
				this.id +
				"   \n" + "Song Title: " +
				this.title +
				"   \n" + "User Id: " +
				this.userId +
				"   \n" + "Date Create Song: " +
				this.createDate +
				"\n";
	}
}
