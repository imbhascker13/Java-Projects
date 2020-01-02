package com.mindtree.library.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class LibraryDto {
	private int libraryId;
	private String libraryName;
	private String libraryAddress;
	@JsonIgnoreProperties("libraries")
	List<UserDto>users;
	@JsonIgnoreProperties("library")
	List<RatingDto>ratings;
	public LibraryDto() {
		super();
	}
	public LibraryDto(int libraryId, String libraryName, String libraryAddress, List<UserDto> users) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.users = users;
	}
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public List<UserDto> getUsers() {
		return users;
	}
	public void setUsers(List<UserDto> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "LibraryDto [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryAddress="
				+ libraryAddress + ", users=" + users + "]";
	}
	public LibraryDto(int libraryId, String libraryName, String libraryAddress, List<UserDto> users,
			List<RatingDto> ratings) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.users = users;
		this.ratings = ratings;
	}
	public List<RatingDto> getRatings() {
		return ratings;
	}
	public void setRatings(List<RatingDto> ratings) {
		this.ratings = ratings;
	}
	
}
