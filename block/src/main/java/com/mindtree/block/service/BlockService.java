package com.mindtree.block.service;

import com.mindtree.block.dto.BlockDto;

public interface BlockService {

	/**
	 * @param blockDto
	 * @return inserted status for block details
	 */
	public String addBlock(BlockDto blockDto);

}
