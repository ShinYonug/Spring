<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import ="com.springbook.biz.board.impl.BoardDAO" %>
    <%@page import ="com.springbook.biz.board.BoardVO" %>
<% response.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>글 등록</h1>
	<a href="logout_proc.jsp">LogOut</a>
	<hr>
	
	<form action = "insertBoard_proc.jsp" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
		<tr>	
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input name="title" type="text" /></td>
		</tr>
		<tr>	
			<td bgcolor="orange" >작성자</td>
			<td align="left"><input name="writer" type="text" /></td>
		</tr>
		<tr>	
			<td bgcolor="orange" >내용</td>
			<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
		</tr>
		<tr>	
			<td colspan="2" align="center">
				<input type="submit" value="등록"/>
				<input type="button" value="취소"  onclick="location.href=history.back"/>
			</td>
		</tr>
	</table>
	</form>
	<hr>
</center>

</body>
</html>