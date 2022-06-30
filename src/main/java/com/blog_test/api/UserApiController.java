package com.blog_test.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog_test.dto.ResponseDto;
import com.blog_test.model.RoleType;
import com.blog_test.model.User;
import com.blog_test.service.UserService;

@RestController
public class UserApiController {
	@Autowired
	private UserService service;
	@Autowired
	private HttpSession httpSession;
	
	@PostMapping("/api/joinuser")
	public ResponseDto<Integer> save(@RequestBody User user){		
		user.setRole(RoleType.USER);
		int result = service.saveUser(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),result);
	}
	
	@PostMapping("/api/login")
	public ResponseDto<Integer> login(@RequestBody User user){
		System.out.println("api login 호출");
		System.out.println(user);
		User principal = service.login(user);
		System.out.println("principal : " + principal); 
		// 왜 null 이지? js에서 user의 정보를 못넘겨줘서였음 form에서 지정한 id값이랑 js에서 넘겨 받을 id랑 대소문자가 달라서...
		if(principal != null) {
			
			httpSession.setAttribute("principal", principal);
			System.out.println("세션 정보 저장!");
		}
		
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}
}
