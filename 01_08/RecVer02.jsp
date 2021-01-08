<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="area" class="edu.bit.ex.Rec" scope="page" />
    <jsp:setProperty property="*" name="area" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   넓이 : <%=area.getHeight()*area.getWidth() %>
</body>
</html>