package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;



public interface TimeMapper {

	// 이놈이 어노테이션으로 SQL 문장 넣어준거고
	@Select("select sysdate from dual")
	public String getTime();
	//이놈이 xml 파일에서 아이디에 변수명 넣고 반환 타입에 스트링 넣어서 
	//SQL 문장 넣어준거
	public String getTime2();
}
