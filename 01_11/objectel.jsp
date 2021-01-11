<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="result2.jsp" method="get" >
	<!-- <form action="result.jsp" method="get" > -->
	<!-- 	아이디 : <input type="text" name="id"><br />
		비밀번호 : <input type="password" name="pw"><br /> -->
		<input type="submit" value="결과">
	</form>
	
	<%-- <%
      application.setAttribute("application_name","application_value" );
      session.setAttribute("session_name","session_value" );
      pageContext.setAttribute("page_name","pageContext_value" );
      request.setAttribute("request_name","request_value" );
	%> --%>
   
   ${applicationScope.application_name}<br/>
   ${sessionScope.session_name}<br/>
   ${pageScope.page_name}<br/>
   ${requestScope.request_name}<br/>
   
	
</body>
</html>