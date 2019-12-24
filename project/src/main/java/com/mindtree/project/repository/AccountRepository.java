package com.mindtree.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.project.entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
