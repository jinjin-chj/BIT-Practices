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

	for(int i =0; i<cks.length; i++) {
		String id= cks[i].getValue();
		
		if(id.equals("abc")) 
			out.println(id+"�� �ȳ��ϼ���." + "<br/>");
	}

%>

	<a href="logout.jsp">�α׾ƿ�</a>
</body>
</html>