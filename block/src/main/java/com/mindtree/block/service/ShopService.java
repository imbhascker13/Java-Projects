package com.mindtree.block.service;

import java.util.List;

import com.mindtree.block.dto.ShopDto;

public interface ShopService {

   /**
 * @param shopDto
 * @param blockName
 * @return status for inserting of shop details
 */
public String addShop(List<ShopDto> shopDto, String blockName);

/**
 * @param shopType
 * @return shop details
 */
public List<ShopDto> getShopDetails(String shopType);

/**
 * @param blockId
 * @return shopdetails along with dish details
 */
public List<ShopDto> getAllDetails(String blockName);

}
