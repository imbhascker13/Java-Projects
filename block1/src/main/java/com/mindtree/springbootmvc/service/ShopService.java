package com.mindtree.springbootmvc.service;

import java.util.List;

import com.mindtree.springbootmvc.dto.ShopDto;

public interface ShopService {

	/**
	 * @param shopDto
	 * @return status for inserted details of shop
	 */
	public String addShop(ShopDto shopDto,String blockName);

	/**
	 * @return shop details
	 */
	public List<ShopDto> getShop();

	/**
	 * @param shopType
	 * @return  shop details
	 */
	public List<ShopDto> getShopDetails(String shopType);

	/**
	 * @param blockName
	 * @return all the details of shop and dishes
	 */
	public List<ShopDto> getAllDetails(String blockName);

}
