<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Practice04-1</title>
</head>
<body>
  <%!
  String name, id, pw, major, protocol;
  String[] hobbies;
  %>
  
  <%
  	request.setCharacterEncoding("euc-kr");
  
  	name=request.getParameter("name");
  	id=request.getParameter("id");
  	pw=request.getParameter("pw");
  	major=request.getParameter("major");
  	protocol=request.getParameter("protocol");
  	
  	hobbies=request.getParameterValues("hobby");
  
  %>
  
�̸� : <%= name %><br />
���̵� : <%= id %><br />
��й�ȣ : <%= pw %><br />
��� : <%= Arrays.toString(hobbies) %><br />
���� : <%= major %><br />
�������� : <%= protocol %><br />
</body>
</html>