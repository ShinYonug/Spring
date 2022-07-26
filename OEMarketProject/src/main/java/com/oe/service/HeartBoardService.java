package com.oe.service;

import java.util.List;

import com.oe.domain.HeartBoardVO;

public interface HeartBoardService {
	public List<HeartBoardVO> getListHB(String he_nickname);
	public int removeHeart(String he_nickname);
}
