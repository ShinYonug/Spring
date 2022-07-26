package com.oe.service;

import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;

public interface MyPageService {
	/*	
	 *	<마이페이지 초기값 설정>
	 *	프로필 사진 : 웹페이지의 noimage.gif와 같이 기본 이미지 파일을 지정 후, 이를 초기값으로 부여
	 *	닉네임 : 회원가입시 닉네임을 입력해야 하므로 패스
	 *	자기소개 : "자기소개를 입력해주세요." 문구를 초기값으로 부여
	 *	
	 *	<회원 탈퇴>
	 *	MYPAGE 테이블에서만 회원 데이터 삭제(MARKETUSER 테이블에는 남겨놓음.)
	 */
	public MyPageVO get(String my_id); //해당 id를 갖는 회원의 프로필 정보 보기
	public void profileEdit(MyPageVO vo); //닉네임, 자기소개 수정
	public void withdrawal(String my_id); //회원 탈퇴
	public MarketUserVO checkPass(String my_id); //회원탈퇴 시 비번 확인 위해 가져옴
}
