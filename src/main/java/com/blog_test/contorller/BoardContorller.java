package com.blog_test.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardContorller {
	
		@GetMapping("/board/save")
		public String boardSave() {
			return "/board/board_form";
		}
}
