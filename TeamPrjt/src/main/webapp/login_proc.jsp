<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.springbook.biz.user.impl.UserDAO" %>
<%@page import="com.springbook.biz.user.UserVO" %>

<%
	request.setCharacterEncoding("utf-8");
	
String id= request.getParameter("id");
String password= request.getParameter("password");

UserVO vo = new UserVO();
vo.setId(id);
vo.setPassword(password);

UserDAO userDAO = new UserDAO();
UserVO user = userDAO.getUser(vo);
System.out.print(user);
if(user != null){
	response.sendRedirect("getBoardList.jsp");               //뛰어주는 놈 화면에서 데이터를
}else {
	response.sendRedirect("login.jsp");
}


%>