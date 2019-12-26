package com.mindtree.springbootmvc.dto;

import java.util.List;

public class ShopDto {
	
	private int shopId;
	private String shopName;
	private String shopType;
	private double shopRating;
	private List<DishDto> dishDto;
	public ShopDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopDto(int shopId, String shopName, String shopType, double shopRating, List<DishDto> dishDto) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopType = shopType;
		this.shopRating = shopRating;
		this.dishDto = dishDto;
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
	
	public List<DishDto> getDishDto() {
		return dishDto;
	}
	public void setDishDto(List<DishDto> dishDto) {
		this.dishDto = dishDto;
	}
	
	
	
	

}
