package com.mindtree.springbootmvc.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springbootmvc.dto.DishDto;
import com.mindtree.springbootmvc.entity.Dish;
import com.mindtree.springbootmvc.entity.Shop;
import com.mindtree.springbootmvc.repository.BlockRepository;
import com.mindtree.springbootmvc.repository.ShopRepository;
import com.mindtree.springbootmvc.service.DishService;

@Service
public class DishServiceImpl implements DishService{
	
	@Autowired
	private ShopRepository shopRepository;
	@Autowired
	private BlockRepository blockRepository;
	
	private ModelMapper mapper=new ModelMapper();


	@Override
	public String addDish(DishDto dishDto, String shopName) {

		List<Shop> shop=shopRepository.findAll();
		double price=0;
		
		List<Shop> s1=new ArrayList<Shop>();
		
		Shop shop1=shop.stream().filter(i->i.getShopName().equalsIgnoreCase(shopName)).findAny().get();
		Dish dish=mapper.map(dishDto, Dish.class);
		
		if (shop1.getShopRating() >=2.5 && shop1.getShopRating() <=3.5) {

			price = (dish.getDishPrice()-(dish.getDishPrice() * 2 / 100));

		} else if (shop1.getShopRating() > 3.5 && shop1.getShopRating() <=4.5) {

			price = (dish.getDishPrice()-(dish.getDishPrice() * 5 / 100));

		} else if (shop1.getShopRating() > 4.5) {

			price = (dish.getDishPrice()-(dish.getDishPrice() * 10 / 100));

		}
		dish.setDishPrice(price);
		shop1.getDish().add(dish);

		shopRepository.save(shop1);
		
		return "inserted";
	}


	@Override
	public List<DishDto> getDishDetails(String shopName) {

		List<DishDto> dish=new ArrayList<>();

	List<Shop> shop=shopRepository.findAll();
	for(Shop s:shop) {
		if(s.getShopName().equalsIgnoreCase(shopName)) {
			
			for(Dish d:s.getDish()) {
				
				DishDto d1=mapper.map(d, DishDto.class);
				dish.add(d1);
			}
			
		}
	}
	
	
	Collections.sort(dish);
		return dish;
	}

}
