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
	public void testGetList() {
		log.info(mapper.getList());
		
	}
	@Test
	public void testRead() {
		log.info(mapper.read(1L));
	}
	@Test
	public  void testDelete() {
		log.info(mapper.delete(1L));
	}
	@Test
	public  void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("spring");
		vo.setContent("hard");
		vo.setWriter("김신영");
		log.info(mapper.insert(vo));
	}
	@Test
	public  void testInsertSelectKey() {
		 BoardVO vo = new BoardVO();
		vo.setTitle("java");
		vo.setContent("ez");
		vo.setWriter("김신영");
		log.info(mapper.insertSelectKey(vo));
	}
	@Test
	public  void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(2L);
		vo.setTitle("java2");
		vo.setContent("ez2");
		vo.setWriter("김신일");
		log.info(mapper.update(vo));
	}
}
