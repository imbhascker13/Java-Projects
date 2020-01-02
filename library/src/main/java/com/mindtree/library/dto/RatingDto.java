package com.mindtree.library.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class RatingDto {
	private int ratingId;
	private String ratingName;
	private double ratingValue;
	@JsonIgnoreProperties("ratings")
	LibraryDto library;
	@JsonIgnoreProperties("ratings")
	UserDto user;
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public String getRatingName() {
		return ratingName;
	}
	public void setRatingName(String ratingName) {
		this.ratingName = ratingName;
	}
	public double getRatingValue() {
		return ratingValue;
	}
	public void setRatingValue(double ratingValue) {
		this.ratingValue = ratingValue;
	}
	public LibraryDto getLibrary() {
		return library;
	}
	public void setLibrary(LibraryDto library) {
		this.library = library;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public RatingDto(int ratingId, String ratingName, double ratingValue, LibraryDto library, UserDto user) {
		super();
		this.ratingId = ratingId;
		this.ratingName = ratingName;
		this.ratingValue = ratingValue;
		this.library = library;
		this.user = user;
	}
	public RatingDto() {
		super();
	}
	
}
