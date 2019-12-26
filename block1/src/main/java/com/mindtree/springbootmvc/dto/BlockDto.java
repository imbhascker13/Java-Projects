package com.mindtree.springbootmvc.dto;

import java.util.List;

public class BlockDto {
	
	private int blockId;
	private String blockName;
	private List<ShopDto> shopDto;
	public BlockDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlockDto(int blockId, String blockName, List<ShopDto> shopDto) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
		this.shopDto = shopDto;
	}
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public List<ShopDto> getShopDto() {
		return shopDto;
	}
	public void setShopDto(List<ShopDto> shopDto) {
		this.shopDto = shopDto;
	}
	
	

}
