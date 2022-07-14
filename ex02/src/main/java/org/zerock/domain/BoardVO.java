package org.zerock.domain;

import java.sql.Date;

import lombok.Data;

/*
 * bno number(10,0),
 * title varchar2(200)not null, 
 * content varchar2(2000) not null, 
 * writer varchar2(20) not null, 
 * regdate date default sysdate, 
 * updatedate date default sysdate
 */

@Data
public class BoardVO {

	private Long bno;
	private String title, content, writer;
	private Date regdate, updatedate;
}
