<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <jsp:useBean id="member" class="edu.bit.ex.MemberInfo" scope="page"/>
    <jsp:setProperty name="member" property="name" value="홍길동"/>
    <jsp:setProperty name="member" property="id" value="abc"/>
    <jsp:setProperty name="member" property="pw" value="123"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	이름 : <jsp:getProperty name="member" property="name"/><br/>
	id : <jsp:getProperty name="member" property="id"/><br/>
	pw : <jsp:getProperty name="member" property="pw"/><br/>
	
	<hr/>
	이름 : ${member.name}<br/>
	id : ${member.id}<br/>
	pw : ${member.pw}<br/>
	
</body>
</html>