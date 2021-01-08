<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>sub.jsp 페이지 입니다.</h1>
	<h2>>> forward_param.jsp 페이지도 같이ㅎ 합니다.</h2>
	<% String id,pw; %>
	<%
	id= request.getParameter("id");
	pw= request.getParameter("pw");
	%>
	
	아이디: <%= id %> <br/>
	패스워드: <%= pw %>
</body>
</html>