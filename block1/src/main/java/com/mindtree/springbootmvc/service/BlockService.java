package com.mindtree.springbootmvc.service;

import java.util.List;

import com.mindtree.springbootmvc.dto.BlockDto;

public interface BlockService {

	/**
	 * @param blockDto
	 * @return insertion details of block
	 */
	public String addBlock(BlockDto blockDto);

	/**
	 * @return all block details
	 */
	public List<BlockDto> getBlock();

}
