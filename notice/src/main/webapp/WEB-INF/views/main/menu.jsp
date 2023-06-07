<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<nav id="topMenu">
			<ul>
				<li><a class="menuLink" href="main.do">Home</a></li>
				<li><a class="menuLink" href="noticeList.do">Notice</a></li>
				<c:if test="${empty id }">
					<li><a class="menuLink" href="memberJoin.do">MemberJoin</a></li>
				</c:if>
				<li><a class="menuLink" href="#">일단보류</a></li>
				<li><a class="menuLink" href="#">일단보류</a></li>
				<c:if test="${not empty id }">
					<li><a class="menuLink" href="#">Logout</a></li>
				</c:if>
				<c:if test="${not empty name}">
					<li><a class="menuLink" href="#">${name }님 로그인</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
</body>
</html>