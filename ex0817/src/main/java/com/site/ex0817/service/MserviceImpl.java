package com.site.ex0817.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.site.ex0817.vo.MVo;

@Service
public class MserviceImpl implements MService {

	
	
	
	
	@Override
	public Map<String, Object> memberInsert(MVo mVo) {
		//dao로 정리해서 보내줌.
		Map<String, Object> map = new HashMap<String, Object>();
		
		System.out.println("MserviceImpl : "+mVo.getHobby());
		System.out.println("page :" + 1);
		System.out.println("Maxpage :" + 11);
		System.out.println("Count :" + 115);
		System.out.println("name :" + mVo.getName());
		
		
		int page =1;
		int maxPage = 11;
		int count = 115;
		
		
		String name = mVo.getName();
		map.put("page", page);
		map.put("Maxpage", maxPage);
		map.put("Count", count);
		map.put("name", name);
		map.put("hobby", mVo.getHobby());
		
		return map;
	}
	
	
	@Override
	public Map<String, Object> memberSelect(){
		Map<String, Object> map = new HashMap<String,Object>();
		ArrayList<MVo> list = new ArrayList<MVo>(); 
		
		for(int i=0; i<=10; i++) {
			MVo m = new MVo();
			m.setId("a"+i);
			m.setName("홍길동"+i);
			m.setGender("male"+i);
			m.setTel("010-1111-1111");
			list.add(m);
		}
		int page=1;
		int count=22;
		
		map.put("list", list);
		map.put("page", page);
		map.put("count", count);
		
		
		return map;
	}
}
