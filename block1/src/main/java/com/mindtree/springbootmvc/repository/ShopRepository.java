package com.mindtree.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer>{

}
