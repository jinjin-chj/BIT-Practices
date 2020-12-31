<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>gugudan</title>
</head>
<body>
<h2>구구단 출력</h2>
<table border=1>
<tr>
<%
for (int i = 2; i < 10; i++) {
	for (int j = 1; j < 10; j++) {
		out.println("<td>");
		out.println(i + "*" + j + "=" + (i * j));
		out.println("</td>");
	}
	out.println("</tr>");
}
%>
</table>
</body>
</html>