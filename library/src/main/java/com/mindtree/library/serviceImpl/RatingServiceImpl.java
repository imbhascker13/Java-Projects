package com.mindtree.library.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.dto.RatingDto;
import com.mindtree.library.entity.Rating;
import com.mindtree.library.repository.RatingRepository;
import com.mindtree.library.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	RatingRepository ratingRepository;
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public RatingDto addRating(RatingDto rating) {
		Rating rating1 = convertDtoToEntity(rating);
		Rating rating2 = ratingRepository.save(rating1);
		RatingDto ratingDto = convertEntityToDto(rating2);
		return ratingDto;

	}

	private RatingDto convertEntityToDto(Rating rating2) {
		return modelMapper.map(rating2, RatingDto.class);
	}

	private Rating convertDtoToEntity(RatingDto rating) {
		// TODO Auto-generated method stub
		return modelMapper.map(rating, Rating.class);
	}

}
