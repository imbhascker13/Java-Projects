package com.mindtree.block.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.block.entity.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer>{

}
