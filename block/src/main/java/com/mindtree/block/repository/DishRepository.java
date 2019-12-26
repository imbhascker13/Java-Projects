package com.mindtree.block.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.block.entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer>{

}
