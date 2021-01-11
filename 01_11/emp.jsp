<%@page import= "java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.list {
	font-weight:bold;
	text-align:center;
	}
</style>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

Connection connection;
Statement statement;
ResultSet resultSet;

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String upw = "tiger";
String query = "select * from emp, dept";%>

<%
	Class.forName(driver);
	connection = DriverManager.getConnection(url, uid, upw);
	statement = connection.createStatement();
	resultSet = statement.executeQuery(query);
%>
<h2>EMP 테이블 직원 목록</h2>
<table border="1">
		<tr class="list">
			<td>사원번호</td>
			<td>사원이름</td>
			<td>직급(업무)</td>
			<td>상사(이름)</td>
			<td>입사일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
			<td>관리</td>
		</tr>
		<%
			while (resultSet.next()) {
			String empno = resultSet.getString("empno");
			String ename = resultSet.getString("ename");
			String job = resultSet.getString("job");
			String mgr = resultSet.getString("mgr");
			String hiredate = resultSet.getString("hiredate");
			String sal = resultSet.getString("sal");
			String comm = resultSet.getString("comm");
			String deptno = resultSet.getString("deptno");
			String dname = resultSet.getString("dname");
			String loc = resultSet.getString("loc");
			
		%>
		<tr>
			<td><%=empno%></td>
			<td><%=ename%></td>
			<td><%=job%></td>
			<td><%=mgr%></td>
			<td><%=hiredate%></td>
			<td><%=sal%></td>
			<td><%=comm%></td>
			<td><%=deptno%></td>
			<td><%=dname%></td>
			<td><%=loc%></td>
			<td><a href=#>수정</a></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>