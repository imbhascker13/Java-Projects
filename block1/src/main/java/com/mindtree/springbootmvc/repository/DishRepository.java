package com.mindtree.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer>{

}
