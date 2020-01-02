package com.mindtree.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.library.dto.RatingDto;
import com.mindtree.library.service.RatingService;

@RestController
public class RatingController {
	@Autowired
	RatingService ratingService;
	@PostMapping(value="/rating")
	public RatingDto addRating(@RequestBody RatingDto rating) {
		return ratingService.addRating(rating);
	}
}
