package com.mindtree.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.library.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
