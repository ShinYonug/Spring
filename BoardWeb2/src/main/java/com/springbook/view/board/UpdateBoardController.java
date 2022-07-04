package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {
@RequestMapping("/updateBoard.do")
	public ModelAndView handleRequest(BoardVO vo , BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 수정 처리");
		boardDAO.updateBoard(vo);
		mav.setViewName("getBoardList.do");
		return mav;
	}

}
