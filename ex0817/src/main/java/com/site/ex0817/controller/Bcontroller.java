package com.site.ex0817.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.ex0817.service.BService;

@Controller
public class Bcontroller {

	@Autowired
	BService bService;
	
	@RequestMapping("blist")
	public String blist(Model model) {
		Map<String, Object> map = bService.boardList();
		model.addAttribute("map",map);
		return "/blist";
	}
}
