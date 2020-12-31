<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>forward_data</title>
</head>
<body>
	<table border=1>
		<tr>
				<%
				String num = request.getParameter("num");
				int n = Integer.parseInt(num);
				for (int i = 1; i < 10; i++) {
					out.println("<td>");
					out.println(n + " * " + i + " = " + (i * n));
					out.println("</td>");
					out.println("</tr>");
				}
				%>
			
	</table>
</body>
</html>