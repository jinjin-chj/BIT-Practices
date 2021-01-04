<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>gugudan</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<table border="1">
		<tr>
			<%
				for (int i = 2; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
			%>
			<td><%=i + "*" + j + "=" + i * j%></td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>