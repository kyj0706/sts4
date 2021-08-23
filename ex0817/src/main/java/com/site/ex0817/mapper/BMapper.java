package com.site.ex0817.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.site.ex0817.vo.BVo;

@Mapper
public interface BMapper {

	//board 테이블에 있는 모든 리스트를 가져오는 메소드
	ArrayList<BVo> selectBlist();
}
