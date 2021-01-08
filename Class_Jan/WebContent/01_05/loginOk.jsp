<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
	String id, pw;
	%>
	
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		if(id.equals("abc") && pw.equals("1234")) {
			Cookie ck = new Cookie("id", id);
			ck.setMaxAge(60);
			response.addCookie(ck);
			response.sendRedirect("welcome.jsp");
			
		} else {
			response.sendRedirect("login.html");
		}
	%>


</body>
</html>