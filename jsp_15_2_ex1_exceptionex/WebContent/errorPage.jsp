<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true"%>
<% response.setStatus(200); %>	<!-- 여기 봐 이런게 있어!!! 속이고 있음 200이라고. -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	에러 발생<br /> <!--위에 봐바 response 있어 !!! / 문법 오류니까 500이 뜨겠지.  -->
	<%= exception.getMessage() %>
</body>
</html>