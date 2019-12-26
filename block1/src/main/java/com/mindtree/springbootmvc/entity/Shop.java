package com.mindtree.springbootmvc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	private String shopName;
	private String shopType;
	private double shopRating;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopId")
	private List<Dish> dish;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int shopId, String shopName, String shopType, double shopRating, List<Dish> dish) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopType = shopType;
		this.shopRating = shopRating;
		this.dish = dish;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public double getShopRating() {
		return shopRating;
	}

	public void setShopRating(double shopRating) {
		this.shopRating = shopRating;
	}

	public List<Dish> getDish() {
		return dish;
	}

	public void setDish(List<Dish> dish) {
		this.dish = dish;
	}


}
