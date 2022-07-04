package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.view.controller.old.Controller;

public class LogoutController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse responce) {
		System.out.println("로그아웃 처리");
		
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}

}