package com.mindtree.block.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.block.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer>{

}
