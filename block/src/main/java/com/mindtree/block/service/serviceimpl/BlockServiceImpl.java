package com.mindtree.block.service.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.block.dto.BlockDto;
import com.mindtree.block.entity.Block;
import com.mindtree.block.repository.BlockRepository;
import com.mindtree.block.service.BlockService;

@Service
public class BlockServiceImpl implements BlockService{
	
	
	@Autowired
	private BlockRepository blockRepository;
	
	private ModelMapper mapper=new ModelMapper();

	@Override
	public String addBlock(BlockDto blockDto) {
		
		Block block=mapper.map(blockDto, Block.class);
		
		blockRepository.save(block);
		
		return "inserted";
	}

}
