<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>forward</title>
</head>
<body> 
<!-- http://localhost:8282/Practice_Dec/html_12_31/forward.jsp -->
<h4>구구단 출력하기</h4>
<jsp:forward page="forward_data.jsp">
<jsp:param name="num" value="5"/>
</jsp:forward>
</body>
</html>