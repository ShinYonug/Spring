<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@page import="com.springbook.biz.board.BoardVO" %>

<%
request.setCharacterEncoding("utf-8");


BoardDAO boardDAO = new BoardDAO();
BoardVO vo = new BoardVO();

String title= request.getParameter("title");
String content = request.getParameter("content");
vo.setTitle(title);
vo.setContent(content);
vo.setSeq(Integer.parseInt(request.getParameter("seq")));
boardDAO.updateBoard(vo);

response.sendRedirect("getBoardList.jsp");





%>