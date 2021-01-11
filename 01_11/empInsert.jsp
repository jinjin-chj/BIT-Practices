<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="empInsert" class="edu.bit.ex.Emp" scope="page" />
    <jsp:setProperty property="*" name="empInsert" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 입사일 클래스에서 스트링으로 받아서 처리해 줘야 함. -->
<h1>정보입력이 정상적으로 처리 되었습니다.</h1>
<a href="empList.jsp">리스트</a>
</body>
</html>