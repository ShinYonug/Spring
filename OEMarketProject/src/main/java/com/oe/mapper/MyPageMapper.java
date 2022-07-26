package com.oe.mapper;

import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;

public interface MyPageMapper {
	public MyPageVO readMyPage(String my_id);
	public int updateMyPage(MyPageVO vo);
	public int deleteMember(String my_id);
	public MarketUserVO getUserPass(String my_id);
}
