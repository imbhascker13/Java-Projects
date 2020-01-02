package com.mindtree.library.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UserDto {
	private int userId;
	private String userName;
	private String userAddress;
	@JsonIgnoreProperties("users")
	List<LibraryDto>libraries;
	@JsonIgnoreProperties("user")
	List<RatingDto>ratings;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int userId, String userName, String userAddress, List<LibraryDto> libraries) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.libraries = libraries;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public List<LibraryDto> getLibraries() {
		return libraries;
	}
	public void setLibraries(List<LibraryDto> libraries) {
		this.libraries = libraries;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", libraries="
				+ libraries + "]";
	}
	public List<RatingDto> getRatings() {
		return ratings;
	}
	public void setRatings(List<RatingDto> ratings) {
		this.ratings = ratings;
	}
	public UserDto(int userId, String userName, String userAddress, List<LibraryDto> libraries,
			List<RatingDto> ratings) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.libraries = libraries;
		this.ratings = ratings;
	}
	
}
