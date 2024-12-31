package com.aurionpro.loan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.loan.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
<<<<<<< HEAD
	Page<User> findByFirstName(Pageable pageable,String firstName);
	User findByEmail(String email);
=======
	
//	Page<User> findByFirstName(Pageable pageable,String firstName);
//	User findByEmail(String email);
>>>>>>> 2aa52fc326558ed2110b8e0ed14d6d6112f4e4cc
}
