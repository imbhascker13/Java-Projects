package com.mindtree.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.project.entity.IG;

@Repository
public interface IgRepository extends JpaRepository<IG, Integer>{

}
