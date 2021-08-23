package com.site.ex0817.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.ex0817.mapper.BMapper;
import com.site.ex0817.vo.BVo;

@Service
public class BserviceImpl implements BService {
	
	@Autowired
	BMapper bMapper;
	
	@Override
	public Map<String, Object> boardList() {
		Map<String, Object> map =new HashMap<String, Object>();
		ArrayList<BVo> list = bMapper.selectBlist();
		
		map.put("list", list);
		map.put("page", 1);
		map.put("count", 115);
		
		
		
		return map;
	}

}
