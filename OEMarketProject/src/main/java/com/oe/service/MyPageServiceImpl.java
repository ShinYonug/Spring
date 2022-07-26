package com.oe.service;

import org.springframework.stereotype.Service;

import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;
import com.oe.mapper.MyPageMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class MyPageServiceImpl implements MyPageService {
	private MyPageMapper mapper;
	
	@Override
	public MyPageVO get(String my_id) {
		log.info("get★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		return mapper.readMyPage(my_id);
	}
	@Override
	public void profileEdit(MyPageVO vo) {
		log.info("profileEdit★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		mapper.updateMyPage(vo);
	}
	@Override
	public void withdrawal(String my_id) {
		log.info("withdrawal★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		mapper.deleteMember(my_id);
	}
	
	@Override
	   public MarketUserVO checkPass(String my_id) {
	      log.info("getUser★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
	      return mapper.getUserPass(my_id);
	   }
}
