<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
</head>
<body>
 	<div align="center">
    <h1>아이디 찾기</h1>
    <h3>이름과 전화번호를 입력해주시면 아이디를 알려드립니다.</h3>
 
    <form action="findId" method="POST">
        <table>
            <tr>
                <td>이름</td>
                <td align="left"><input type="text" name="us_name" /></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td align="left"><input type="text" name="us_phone" size="20" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="아이디 찾기" /></td>
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
        <p>찾으시는 아이디는 ' ${us_id} ' 입니다.</p>
        <hr>
        <a href="login">로그인 화면으로 돌아가기</a>
    </c:if>
 
</body>
</html>