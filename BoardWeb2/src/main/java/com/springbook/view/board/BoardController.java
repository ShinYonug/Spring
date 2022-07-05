package com.springbook.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardSevice;
	
	
//   글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo) {
		boardSevice.insertBoard(vo);
		return "getBoardList.do";
	} // end of insertBoard

//   글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		System.out.println("작성자 이름: " + vo.getWriter());
		System.out.println("제목" + vo.getTitle());
		System.out.println("번호: " + vo.getSeq());
		System.out.println("내용:" +vo.getContent());
		System.out.println("등록일 " + vo.getRegDate());
		System.out.println("조회수"+ vo.getCnt());
		boardSevice.updateBoard(vo);
		return "getBoardList.do";
	} // end of updateBoard

//   글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardSevice.deleteBoard(vo);
		return "getBoardList.do";
	} // end of deleteBoard

//   글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardSevice.getBoard(vo));
		return "getBoard.jsp";
	} // end of getBoard

//   글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(
			@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
			@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
			BoardVO vo, Model model) {
		System.out.println("검색 조건: " + condition);
		System.out.println("검색 단어: " + keyword);
		model.addAttribute("boardList", boardSevice.getBoardList(vo));
		return "getBoardList.jsp";

	} // end of getBoardList
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String,String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("작성자", "WRITER");
		return conditionMap;
	}
}