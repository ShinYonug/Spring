<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>패스워드 찾기</title>
</head>
<body>
 	<div align="center">
    <h1>패스워드 찾기</h1>
    <h3>아이디와 이름, 전화번호를 입력해주시면 패스워드를 알려드립니다.</h3>
 
    <form action="findPass" method="POST">
        <table>
            <tr>
                <td>아이디</td>
                <td align="left"><input type="text" name="us_id" /></td>
            </tr>
            <tr>
                <td>이름</td>
                <td align="left"><input type="text" name="us_name" /></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td align="left"><input type="text" name="us_phone" size="20" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="패스워드 찾기" /></td>
            </tr>
        </table>
        <hr>
    </form>
 	</div>
    
    <c:if test = "${check == 1}">
        <p>일치하는 정보가 존재하지 않습니다.</p>
        <hr>
        <a href="login">로그인 화면으로 돌아가기</a>
    </c:if>
    
    <c:if test = "${check == 0}">
        <p>찾으시는 패스워드는 ' ${us_pass} ' 입니다.</p>
        <hr>
        <a href="login">로그인 화면으로 돌아가기</a>
    </c:if>
 
</body>
</html>