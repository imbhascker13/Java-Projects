package com.mindtree.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer>{

}
