package com.mindtree.springbootmvc.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springbootmvc.dto.DishDto;
import com.mindtree.springbootmvc.dto.ShopDto;
import com.mindtree.springbootmvc.entity.Block;
import com.mindtree.springbootmvc.entity.Dish;
import com.mindtree.springbootmvc.entity.Shop;
import com.mindtree.springbootmvc.repository.BlockRepository;
import com.mindtree.springbootmvc.repository.ShopRepository;
import com.mindtree.springbootmvc.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;
	@Autowired
	private BlockRepository blockRepository;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public String addShop(ShopDto shopDto, String blockName) {

		Shop shop = mapper.map(shopDto, Shop.class);

		List<Block> block = blockRepository.findAll();

		for (Block b : block) {
			if (b.getBlockName().equalsIgnoreCase(blockName)) {

				b.getShop().add(shop);

			}
			blockRepository.save(b);
		}

		return "inserted";
	}

	@Override
	public List<ShopDto> getShop() {

		List<ShopDto> shopDto = new ArrayList<ShopDto>();

		shopRepository.findAll().forEach(i -> {

			ShopDto shop = mapper.map(i, ShopDto.class);

			shopDto.add(shop);

		});

		return shopDto;
	}

	@Override
	public List<ShopDto> getShopDetails(String shopType) {

		List<Shop> shop = shopRepository.findAll();

		List<ShopDto> s = new ArrayList<>();

		for (Shop s1 : shop) {
			
			ShopDto shopDto=new ShopDto();

			if (s1.getShopType().equalsIgnoreCase(shopType)) {

				shopDto.setShopId(s1.getShopId());
				shopDto.setShopName(s1.getShopName());
				shopDto.setShopType(s1.getShopType());
				shopDto.setShopRating(s1.getShopRating());
				
				s.add(shopDto);
				
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
