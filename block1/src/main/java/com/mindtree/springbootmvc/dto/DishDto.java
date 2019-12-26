package com.mindtree.springbootmvc.dto;

public class DishDto implements Comparable<DishDto>{
	
	private int dishId;
	private String dishName;
	private double dishPrice;
	private String dishType;
	public DishDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DishDto(int dishId, String dishName, double dishPrice, String dishType) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.dishType = dishType;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getDishType() {
		return dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	
	@Override
	public int compareTo(DishDto dish) {
    
		if(this.dishPrice-dish.getDishPrice()>0)
			return 1;
		else if(this.dishPrice-dish.getDishPrice()<0) 
			return -1;
		
		else return 0;
	}

}
