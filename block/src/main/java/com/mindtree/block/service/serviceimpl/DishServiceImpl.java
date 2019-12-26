package com.mindtree.block.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.block.dto.DishDto;
import com.mindtree.block.entity.Dish;
import com.mindtree.block.entity.Shop;
import com.mindtree.block.repository.ShopRepository;
import com.mindtree.block.service.DishService;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	private ShopRepository shopRepository;
	private ModelMapper mapper = new ModelMapper();

	@Override
	public String addDish(List<DishDto> dishDto, String shopName) {

		List<Shop> shop = shopRepository.findAll();

		double price = 0;

		List<Dish> dish = new ArrayList<Dish>();
		for (DishDto d : dishDto) {
			Dish dish1 = mapper.map(d, Dish.class);
			dish.add(dish1);
		}

		for (Shop s : shop) {
			if (s.getShopName().equalsIgnoreCase(shopName)) {

				for (Dish d2 : dish) {

					if (s.getShopRating() >=2.5 && s.getShopRating() <=3.5) {

						price = (d2.getDishPrice()-(d2.getDishPrice() * 2 / 100));

					} else if (s.getShopRating() > 3.5 && s.getShopRating() <=4.5) {

						price = (d2.getDishPrice()-(d2.getDishPrice() * 5 / 100));

					} else if (s.getShopRating() > 4.5) {

						price = (d2.getDishPrice()-(d2.getDishPrice() * 10 / 100));

					}

					d2.setDishPrice(price);
					s.getDish().add(d2);
				}

			}
			shopRepository.save(s);
		}

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
