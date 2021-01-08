<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="area" class="edu.bit.ex.Rec" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");	

	int width = Integer.parseInt(request.getParameter("width"));
	int height = Integer.parseInt(request.getParameter("height"));
	
	area.setWidth(width);
	area.setHeight(height);
	
	out.println(area.getArea());
%>
<%-- <jsp:setProperty name="area" property="height" value="<%= height %>" /> --%>

</body>
</html>