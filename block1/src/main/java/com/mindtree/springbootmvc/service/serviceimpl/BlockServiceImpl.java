package com.mindtree.springbootmvc.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springbootmvc.dto.BlockDto;
import com.mindtree.springbootmvc.entity.Block;
import com.mindtree.springbootmvc.repository.BlockRepository;
import com.mindtree.springbootmvc.service.BlockService;

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


	@Override
	public List<BlockDto> getBlock() {
    
		List<Block> block=blockRepository.findAll();
		
		List<BlockDto> block1=new ArrayList<BlockDto>();
		
		block.forEach(i->{
			BlockDto b=mapper.map(i, BlockDto.class);
			block1.add(b);
			
		});

		

		return block1;
	}

}
