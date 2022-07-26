package com.oe.mapper;

import com.oe.domain.HeartBoardVO;

public interface HeartBoardMapper {
	public HeartBoardVO readHB(String he_nickname);
	public int deleteHeart(String he_nickname);
}
