package com.mindtree.springbootmvc.service;

import java.util.List;

import com.mindtree.springbootmvc.dto.DishDto;

public interface DishService {

	/**
	 * @param dishDto
	 * @param shopName
	 * @return inserted details of dishes
	 */
	 public String addDish(DishDto dishDto, String shopName);

	/**
	 * @param shopName
	 * @return dish details
	 */
	public List<DishDto> getDishDetails(String shopName);

}
