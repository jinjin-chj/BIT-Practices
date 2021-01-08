<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="edu.bit.ex.dao.EmpDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.bit.ex.vo.EmpVO"%>
<%@page import="java.sql.*"%>
<jsp:useBean id="eDao" class="edu.bit.ex.dao.EmpDAO" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
   //EmpDAO eDao = new EmpDAO();  // useBean 대신에 사용 가능한 것. 
   
   ArrayList<EmpVO> dtos = eDao.empSelect();
   for (int i = 0; i < dtos.size() ; i++){
      EmpVO vo = dtos.get(i);
      
      out.println("이름: "+vo.getEname()+", 번호: "+vo.getEmpno()+"<br/>");
   }

%>
</body>
</html>