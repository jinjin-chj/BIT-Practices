<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <jsp:useBean id="result" class="edu.bit.ex.Grade" scope="page"/>
 <jsp:setProperty property="*" name="result" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("UTF-8");	
	int sNum=Integer.parseInt(request.getParameter("sNum"));
	int java=Integer.parseInt(request.getParameter("java"));
	int DB=Integer.parseInt(request.getParameter("DB"));
	int JSP=Integer.parseInt(request.getParameter("JSP"));
%>
	<form action="Input.html" method="get">
		<table border="1">
			<tr>
				<td colspan="2" width="120" height="20">�й�</td>
				<td width="180" height="20">${result.sNum}</td>
			</tr>
			<tr>
				<td align=center rowspan="3" width="50">����</td>
				<td>Java</td>
				<td>${result.java}</td>
			</tr>
			<tr>
				<td>Database</td>
				<td>${result.DB}</td>
			</tr>
			<tr>
				<td>JSP</td>
				<td>${result.JSP}</td>
			</tr>
			<tr>
				<td colspan="2" width="120" height="20">�������</td>
				<td width="180" height="20">${result.getAvg()}</td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="�Է�ȭ��"></td>
			</tr>
		</table>
	</form>
</body>
</html>