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
	�̸�: <input type="text" name="name" size="10"><br/>
	���̵�: <input type="text" name="id" size="10"><br/>
	��й�ȣ: <input type="password" name="pw" size="10"><br/>
	���: <input type="checkbox" name="hobby" value="reading">����
	 <input type="checkbox" name="hobby" value="cooking">�丮
	 <input type="checkbox" name="hobby" value="jogging">����
	 <input type="checkbox" name="hobby" value="swimming">����
	 <input type="checkbox" name="hobby" value="sleeping">��ħ<br/>
	����: <input type="radio" name="major" value="Korean">����
		<input type="radio" name="major" value="English" checked="checked">����
		<input type="radio" name="major" value="Math">����
		<input type="radio" name="major" value="Design">������<br/>
	<select name="protocol">
		<option value="http">http</option>
		<option value="ftp" selected="selected">ftp</option>
		<option value="smtp">smtp</option>
		<option value="pop">pop</option>
	</select><br/>
	<input type="submit" value="����">
	<input type="reset" value="�ʱ�ȭ">
	</form>
</body>
</html>