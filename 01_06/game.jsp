<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GAME</title>
<style>
	body{
		margin:10px;
		padding:10px;
		line-height:10px;
	}
</style>
</head>
<body>
	<%!
	int user, com;
	Random random = new Random();
	%>
	
	<%
	user = Integer.parseInt(request.getParameter("game"));
	com = (random.nextInt(3)+1);
	%>
	<h2>당신이 낸 것</h2>
		<%
		if(user==2) {
			%>
			<img src="https://image.shutterstock.com/image-vector/rock-hand-gesture-paper-scissors-260nw-580972717.jpg"/>
			<%} else if(user==1) { %>
			<img src="https://image.shutterstock.com/image-vector/scissors-hand-gesture-rock-paper-260nw-580972723.jpg"/>
			<%} else {%>
			<img src="https://image.shutterstock.com/image-vector/paper-hand-gesture-rock-scissors-260nw-580972726.jpg"/>
			<%} %>
		<h2>컴퓨터가 낸 것</h2>
		<%
		if(com==2) {
			%>
			<img src="https://image.shutterstock.com/image-vector/rock-hand-gesture-paper-scissors-260nw-580972717.jpg"/>
			<%} else if(com==1) { %>
			<img src="https://image.shutterstock.com/image-vector/scissors-hand-gesture-rock-paper-260nw-580972723.jpg"/>
			<%} else {%>
			<img src="https://image.shutterstock.com/image-vector/paper-hand-gesture-rock-scissors-260nw-580972726.jpg"/>
			<%} %>
	<hr/>
		<%
		if((com==1 && user==2)||(com==2 && user==3)||(com==3 && user==1)) { 
			%> <h3>>> 당신이 승리하였습니다.</h3> <%
		} else if(com==user){ %>
			<h3>>> 비겼습니다.</h3> <%
		} else  %><h3>>> 당신이 졌습니다.</h3>
		<br/>
		<h3><a href="game.html">다시하기</a></h3>

</body>
</html>
