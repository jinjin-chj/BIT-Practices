<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>sub.jsp ������ �Դϴ�.</h1>
	<h2>>> forward_param.jsp �������� ���̤� �մϴ�.</h2>
	<% String id,pw; %>
	<%
	id= request.getParameter("id");
	pw= request.getParameter("pw");
	%>
	
	���̵�: <%= id %> <br/>
	�н�����: <%= pw %>
</body>
</html>