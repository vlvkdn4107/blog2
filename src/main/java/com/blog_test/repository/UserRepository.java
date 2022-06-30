package com.blog_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_test.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserNameAndPassWord(String userName, String passWord);
	
}
