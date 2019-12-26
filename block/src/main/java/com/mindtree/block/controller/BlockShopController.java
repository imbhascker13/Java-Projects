package com.mindtree.block.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.block.dto.BlockDto;
import com.mindtree.block.dto.DishDto;
import com.mindtree.block.dto.ShopDto;
import com.mindtree.block.service.BlockService;
import com.mindtree.block.service.DishService;
import com.mindtree.block.service.ShopService;

@RestController
@RequestMapping("/block")
public class BlockShopController {

	@Autowired
	private BlockService blockService;
	@Autowired
	private ShopService shopService;
	@Autowired
	private DishService dishService;

	@PostMapping("/addblock")
	public String addBlock(@RequestBody BlockDto blockDto) {

		return blockService.addBlock(blockDto);
	}

	@PostMapping("/addshop/{blockName}")
	public ResponseEntity<Map<String, Object>> addShop(@RequestBody List<ShopDto> shopDto,
			@PathVariable String blockName) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "shopdetails");
		response.put("ERROR", false);
		response.put("Body", shopService.addShop(shopDto, blockName));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	@PostMapping("/adddish/{shopName}")
	public ResponseEntity<Map<String, Object>> addDish(@RequestBody List<DishDto> dishDto,
			@PathVariable String shopName) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "shopdetails");
		response.put("ERROR", false);
		response.put("Body", dishService.addDish(dishDto, shopName));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}
	
	@GetMapping("/getshop/{shopType}")
	public List<ShopDto> getShopDetails(@PathVariable String shopType) {
		
		return shopService.getShopDetails(shopType);
		
	}
	
	@GetMapping("/getdish/{shopName}")
	public List<DishDto> getDishDetails(@PathVariable String shopName){
		return dishService.getDishDetails(shopName);
	}

	@GetMapping("/getalldetails/{blockName}")
	public List<ShopDto> getAllDetails(@PathVariable String blockName)
	{
		return shopService.getAllDetails(blockName);
	}
	
}
