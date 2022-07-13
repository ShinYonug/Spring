package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList(){
//		mapper.getList().forEach(board -> log.info(board));
		for(BoardVO vo : mapper.getList() ) {
			log.info(vo);
		}
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("java의 정석");
		vo.setContent("자바 책 .......");
		vo.setWriter("남궁성");
		mapper.insert(vo);
		log.info(vo);
	}

	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Jsp3");
		vo.setContent("Jsp/Servlet3 ");
		vo.setWriter("성윤정3");
		mapper. insertSelectKey(vo);
		log.info(vo);
	}
	
	@Test
	public void testread() {
		BoardVO vo = mapper.read(13L);
		log.info(vo);
	}
	
	@Test
	public void testdelete() {
//		 mapper.delete(13L);
//		log.info("----------------------");
		log.info("delete count:" + mapper.delete(5L));
	}
	
	@Test
	public void testupdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(8L);
		vo.setTitle("오라클");
		vo.setContent("오라클");
		vo.setWriter("오라클");
//		mapper.update(vo);
		log.info("update:"+mapper.update(vo));
	}

	
}
