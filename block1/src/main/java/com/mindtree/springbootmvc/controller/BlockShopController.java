package com.mindtree.springbootmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.springbootmvc.dto.BlockDto;
import com.mindtree.springbootmvc.dto.DishDto;
import com.mindtree.springbootmvc.dto.ShopDto;
import com.mindtree.springbootmvc.service.BlockService;
import com.mindtree.springbootmvc.service.DishService;
import com.mindtree.springbootmvc.service.ShopService;

@Controller
public class BlockShopController {

	@Autowired
	private BlockService blockService;
	@Autowired
	private ShopService shopService;
	@Autowired
	private DishService dishService;

	@RequestMapping("/")
	public String home() {

		return "home";
	}

	@RequestMapping("/blockadd")
	public String index() {
		return "index";
	}

	@PostMapping("/addblock")
	public String addBlock(BlockDto blockDto) {

		blockService.addBlock(blockDto);

		return "message";
	}

	@GetMapping("/getblock")
	public String getBlock(Model model) {

		List<BlockDto> blockDto = blockService.getBlock();

		model.addAttribute("blockDto", blockDto);
		return "shopadd";

	}

	@PostMapping("/addshop")
	public String addShop(ShopDto shopDto, @RequestParam String blockName) {

		shopService.addShop(shopDto, blockName);

		return "message";

	}

	@RequestMapping("/dishadd")
	public String dishAdd() {
		return "dishadd";
	}

	@RequestMapping("/getshop")
	public String getShop(Model model) {
		List<ShopDto> shopDto = shopService.getShop();
		model.addAttribute("shopDto", shopDto);
		return "dishadd";

	}

	@PostMapping("/adddish")
	public String addDish(DishDto dishDto, @RequestParam String shopName) {
		dishService.addDish(dishDto, shopName);
		return "message";
	}

	@RequestMapping("/getshoptype")
	public String shopGet() {
		return "shoptype";
	}

	@RequestMapping("/getshopdetails")
	public String getShopDetails(@RequestParam("shopType") String shopType, Model model) {

		List<ShopDto> shopDto = shopService.getShopDetails(shopType);
		model.addAttribute("shopDto", shopDto);
		return "shoptype";

	}

	@RequestMapping("/getshopname")
	public String getShopName(Model model) {
		List<ShopDto> shopDto = shopService.getShop();
		model.addAttribute("shopDto", shopDto);
		return "shopname";

	}

	@RequestMapping("/getdish")
	public String getDishDetails(@RequestParam String shopName, Model model) {

		List<DishDto> dish = dishService.getDishDetails(shopName);
		model.addAttribute("dish", dish);
		return "shopname";

	}

	@RequestMapping("/getblockname")
	public String getBlockName(Model model) {

		List<BlockDto> blockDto = blockService.getBlock();

		model.addAttribute("blockDto", blockDto);
		return "blockname";

	}
	
	@RequestMapping("/getall")
	public String getAllDetails(@RequestParam String blockName,Model model) {
		
		List<ShopDto> shopDto=shopService.getAllDetails(blockName);
		model.addAttribute("shopDto", shopDto);
		return "blockname";
	}

}
