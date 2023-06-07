<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<jsp:include page="menu.jsp" />

		</div>
		<h1>Welcome to My Sanctum</h1>
		<div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		
		
		<a href="noticeList.do">게시글 목록</a> <a href="memberList.do">멤버목록 보기</a>
		<a href="memberLoginForm.do">로그인</a>
	</div>

</body>
</html>


