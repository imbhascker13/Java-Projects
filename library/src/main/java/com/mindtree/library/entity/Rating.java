package com.mindtree.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Rating {
	@Id
	private int ratingId;
	private String ratingName;
	private double ratingValue;
	@ManyToOne
	User user;
	@ManyToOne
	Library library;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int ratingId, String ratingName, double ratingValue, User user, Library library) {
		super();
		this.ratingId = ratingId;
		this.ratingName = ratingName;
		this.ratingValue = ratingValue;
		this.user = user;
		this.library = library;
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", ratingName=" + ratingName + ", ratingValue=" + ratingValue
				+ ", user=" + user + ", library=" + library + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ratingValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Rating other = (Rating) obj;
		if (Double.doubleToLongBits(ratingValue) != Double.doubleToLongBits(other.ratingValue))
			return false;
		return true;
	}
	
}
