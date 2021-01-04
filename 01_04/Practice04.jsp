<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Practice04</title>
</head>
<body>
	<form action="Practice04-1.jsp" method="post">
	이름: <input type="text" name="name" size="10"><br/>
	아이디: <input type="text" name="id" size="10"><br/>
	비밀번호: <input type="password" name="pw" size="10"><br/>
	취미: <input type="checkbox" name="hobby" value="reading">독서
	 <input type="checkbox" name="hobby" value="cooking">요리
	 <input type="checkbox" name="hobby" value="jogging">조깅
	 <input type="checkbox" name="hobby" value="swimming">수영
	 <input type="checkbox" name="hobby" value="sleeping">취침<br/>
	전공: <input type="radio" name="major" value="Korean">국어
		<input type="radio" name="major" value="English" checked="checked">영어
		<input type="radio" name="major" value="Math">수학
		<input type="radio" name="major" value="Design">디자인<br/>
	<select name="protocol">
		<option value="http">http</option>
		<option value="ftp" selected="selected">ftp</option>
		<option value="smtp">smtp</option>
		<option value="pop">pop</option>
	</select><br/>
	<input type="submit" value="전송">
	<input type="reset" value="초기화">
	</form>
</body>
</html>