package com.mindtree.springbootmvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dish {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dishId;
	private String dishName;
	private double dishPrice;
	private String dishType;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, double dishPrice, String dishType) {
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
	
	

}
