package com.blog_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog_test.model.User;
import com.blog_test.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	@Transactional
	public int saveUser(User user) {
		try {
			repository.save(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	@Transactional(readOnly = true)
	public User login(User user) {
		
		return repository.findByUserNameAndPassWord(user.getUserName(), user.getPassWord());
	}
		
}
