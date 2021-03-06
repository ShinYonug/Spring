package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList();
	}
	
	@Test
	public void testRead() {
		mapper.read(4L);
	}
	@Test
	public void testDelete() {
		mapper.delete(4L);
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목");
		vo.setContent("내용");
		vo.setWriter("작성자");
		mapper.insert(vo);
	}

	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목2");
		vo.setContent("내용2");
		vo.setWriter("작성자2");
		mapper.insertSelectKey(vo);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(6L);
		vo.setTitle("java");
		vo.setContent("java");
		vo.setWriter("java");
		mapper.update(vo);
	}
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(4);
		cri.setAmount(15);
		List<BoardVO> list = mapper.getListWithPagging(cri);
		log.info(list);
		
	}
	@Test
	public void testPageDTO() {
		Criteria cri = new Criteria();
		cri.setPageNum(15);
		cri.setAmount(10);
		PageDTO pageDTO = new PageDTO(cri, 315);
		log.info(pageDTO);
	}
	
	@Test
	public void testSearchTest() {
		Map<String, String> map = new HashMap<>()	;
		map.put("T", "java");
		map.put("C", "아");
		map.put("W", "김신일");
		
		Map<String , Map<String,String>> outer = new HashMap<String, Map<String,String>>();
		
		outer.put("map", map);
		List<BoardVO> list = mapper.searchTest(outer);
		log.info(list);
		
	}
}
