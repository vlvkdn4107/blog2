package com.blog_test.contorller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping("/login_form")
	public String login() {
		return "user/login_form";
	}
	
	@GetMapping("/join_form")
	public String join() {
		return "user/join_form";
	}
	
	@GetMapping("logout")
	public String logout() {
		httpSession.invalidate();
		return "redirect:/";
	}
	
}
