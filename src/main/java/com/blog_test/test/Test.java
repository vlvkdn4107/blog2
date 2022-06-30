package com.blog_test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	
	@GetMapping("/home")
	public String test() {
		return "/index";
	}
}
