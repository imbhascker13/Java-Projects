package com.mindtree.block.service;

import java.util.List;

import com.mindtree.block.dto.DishDto;

public interface DishService {

	/**
	 * @param dishDto
	 * @param shopName
	 * @return inserted status for dish details
	 */
	public String addDish(List<DishDto> dishDto, String shopName);

	/**
	 * @param shopName
	 * @return dish details 
	 */
	public List<DishDto> getDishDetails(String shopName);

}
