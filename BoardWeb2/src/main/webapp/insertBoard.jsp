<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
                  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>글 등록</h1>
	<a href="logout.do">log-out</a>
	<hr>
	<form action="insertBoard.do" method="post" enctype="multipart/form-data">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td align="left"><input name="title" type="text" ></td>
			</tr>
			<tr>
				<td bgcolor="orange">작성자</td>
				<td align="left"><input name="writer" type="text"></td>
			</tr>
			<tr>
				<td bgcolor="orange">내용</td>
				<td align="left"><textarea rows="10" cols="40" name="content"></textarea></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70" >업로드</td><td align = "left">
				<input type= "file" name="uploadFile"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="글 등록">
				<input type="button" value="취소" onclick="location.href='getBoardList.jsp'">
			</tr>
		</table>
	</form>
	<hr>
	<a href="getBoardList.jsp">글목록</a>
</center>
</body>
</html>