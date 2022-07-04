<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@page import="com.springbook.biz.board.BoardVO" %>

<%
request.setCharacterEncoding("utf-8");


BoardDAO boardDAO = new BoardDAO();
BoardVO vo = new BoardVO();

String title= request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");

vo.setTitle(title);
System.out.print(vo.getTitle());
vo.setWriter(writer);
vo.setContent(content);

boardDAO.insertBoard(vo);

response.sendRedirect("getBoardList.jsp");





%>