package com.mindtree.library.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table

public class Library {
	@Id
	private int libraryId;
	private String libraryName;
	private String libraryAddress;
	@ManyToMany(mappedBy="libraries",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	List<User>users;
	@OneToMany(mappedBy="library",cascade=CascadeType.ALL)
	List<Rating>ratings;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int libraryId, String libraryName, String libraryAddress, List<User> users) {
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
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryAddress=" + libraryAddress
				+ ", users=" + users + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + libraryId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (libraryId != other.libraryId)
			return false;
		return true;
	}
	public Library(int libraryId, String libraryName, String libraryAddress, List<User> users, List<Rating> ratings) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.users = users;
		this.ratings = ratings;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
}
