<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
<script type="text/javascript">
function passChk() {
      if(document.form.pass.value.length = 0){
         alert("비밀번호를 입력해주세요.");
          form.pass.focus();
         return false;
      }
      if((document.form.pass.value != document.form.pass_chk.value)
            && document.form.pass.value.length != 0 ){
         alert("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력해주세요.");
          form.pass.focus();
            return false;
      }
      else{
         alert("회원 탈퇴가 완료되었습니다. 지금까지 오이마켓과 함께해주셔서 감사합니다.");
         return true;
      }
   }
</script>
<style type="text/css">
   #withdrawal{width:350px; margin:0 auto;}
</style>
<body><c:out value=""/>
   <h1 align="center">회원 탈퇴</h1><hr>
   <form action="/mypage/withdrawal" method="post" name="form">
   <input type="hidden" name="pass_chk" value="${user.us_pass}">
   <input type="hidden" name="my_id" value="${mypage.my_id}">
      <table id="withdrawal">
         <tr>
            <td>　아이디 </td>
            <td>${mypage.my_id}</td>
         </tr>
         <tr>
            <td>비밀번호 </td>
            <td><input type="password" name ="pass"></td>
         </tr>
         <tr>
            <td colspan="2" align="right"><input type="submit" value="회원 탈퇴" onclick="return passChk()">
               &nbsp;&nbsp;<button onclick="location.href='myPage.jsp'">취소</button></td>
         </tr>
      </table>
   </form>
</body>
</html>