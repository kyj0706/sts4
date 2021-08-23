package com.site.ex0817.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.ex0817.service.MService;
import com.site.ex0817.service.MserviceImpl;
import com.site.ex0817.vo.MVo;

@Controller
public class Mcontroller {
	
	@Autowired
	MService mService;
	
	@RequestMapping("index")//http://localhost:8000/ 내용 빼고 /  뒤에 있는 내용이 들어오면  index 페이지로 내용을 보내라 
	public String index() {
		return "/index";
	}
	
	@PostMapping("member") //post 받는 방법 => request,requestParam,vo,patvariable
	public String member(MVo mVo, Model model) { //Model =>데이터를 전달할때
		System.out.println("Mcontroller : "+mVo.getHobby());
		//회원가입에서 넘어온 데이터 -> DB저장 
		Map<String, Object> map = 	mService.memberInsert(mVo);
		model.addAttribute("map",map);
		
		
		return "/index";		
	}
	@RequestMapping("list")
	public String list(Model model) {
		Map<String, Object> map = mService.memberSelect();
		model.addAttribute("map",map);
		
		// [ controller ]
				// mService.memberSelect(); -> model -> list.jsp
				// 10명의 사람을 출력을 해보세요.
				
				// [ service ]
				// a1,a2,a3,a4 .... a10
				// 홍길동1,홍길동2,홍길동3....홍길동10
				// 남자
				// 010-1111-1111
				// map으로 저장해서 controller로 보냄.

		
		return "/list";
	}
	
//	@RequestMapping("list")
//	public String list(MVo mVo,Model model) {
//		Map<String, Object> map = mService.memberSelect(mVo);
//		model.addAttribute("map",map);
//		return "/list";
//	}
	
	
	@GetMapping("member")
	public String member() {
		return "/member";
	}
	
}
