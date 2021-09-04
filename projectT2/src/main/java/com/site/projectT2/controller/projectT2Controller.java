package com.site.projectT2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class projectT2Controller {

	
	@RequestMapping("write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("index")
	public String index() {
		return "/index";
	}
	
	
	@RequestMapping("main")
	public String main() {
		return "/main";
	}
}
