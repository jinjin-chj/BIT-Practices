<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	Cookie[] cks = request.getCookies();

	if(cks !=null) {
		for(int i=0; i<cks.length; i++) {
			if(cks[i].getValue().equals("abc")){
				cks[i].setMaxAge(0);
				response.addCookie(cks[i]);
			}
		}
	}
	
	response.sendRedirect("login.html");
%>

</body>
</html>