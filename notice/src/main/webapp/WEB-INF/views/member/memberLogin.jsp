<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<form id="login" action="memberLogin.do" method="post">
		id 
		<input type="email" id="memberId" name="member_id">
		<hr>
		password 
		<input type="password" id="memberPw" name="memberPw">
		<input type="submit" value="login">&nbsp;&nbsp; 
		<input type="reset" value="cancel">
	</form>
</body>
</html>