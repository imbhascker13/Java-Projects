package com.mindtree.block.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.block.dto.DishDto;
import com.mindtree.block.dto.ShopDto;
import com.mindtree.block.entity.Block;
import com.mindtree.block.entity.Dish;
import com.mindtree.block.entity.Shop;
import com.mindtree.block.repository.BlockRepository;
import com.mindtree.block.repository.ShopRepository;
import com.mindtree.block.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;
	@Autowired
	private BlockRepository blockRepository;
	
	private ModelMapper mapper=new ModelMapper();

	@Override
	public String addShop(List<ShopDto> shopDto, String blockName) {

		List<Block> block = blockRepository.findAll();
		
       List<Shop> s=new ArrayList<Shop>();
       for(ShopDto s1:shopDto) {
    	   Shop shop=mapper.map(s1, Shop.class);
    	   s.add(shop);
       }
	

		for (Block b : block) {
			if (b.getBlockName().equalsIgnoreCase(blockName)) {

				for (Shop s2 : s) {

					b.getShop().add(s2);

				}
			}
			blockRepository.save(b);

		}

		return "inserted";
	}

	@Override
	public List<ShopDto> getShopDetails(String shopType) {
		
		List<Shop> shop=shopRepository.findAll();
		
		List<ShopDto> s=new ArrayList<>();
		
		for(Shop s1:shop) {
			
			if(s1.getShopType().equalsIgnoreCase(shopType)) {
				
				ShopDto s2=mapper.map(s1, ShopDto.class);
				s.add(s2);
				
			}	
		}
			
		return s;
	}

	@Override
	public List<ShopDto> getAllDetails(String blockName) {
		 
		List<ShopDto> shop=new ArrayList<>();
		List<DishDto> dish=new ArrayList<>();
        
		List<Block> blocks=blockRepository.findAll();
		
		Block b=blocks.stream().filter(i->i.getBlockName().equalsIgnoreCase(blockName)).findAny().get();
		
		for(Shop s:b.getShop()) {
			
			List<DishDto> dishesDto=new ArrayList<>();
			for(Dish d:s.getDish()) {
				DishDto d1=new DishDto();
				d1.setDishId(d.getDishId());
				d1.setDishName(d.getDishName());
				d1.setDishType(d.getDishType());
				d1.setDishPrice(d.getDishPrice());
				dishesDto.add(d1);	
			}
			
			ShopDto s1=new ShopDto();
			s1.setShopId(s.getShopId());
			s1.setShopName(s.getShopName());
			s1.setShopType(s.getShopType());
			s1.setShopRating(s.getShopRating());
			s1.setDishDto(dishesDto);
			shop.add(s1);
			
		}
		
	
					
		return shop;

			
	}

}
