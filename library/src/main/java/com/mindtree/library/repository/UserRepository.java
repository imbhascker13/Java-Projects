package com.mindtree.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.library.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
