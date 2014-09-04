<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>添加人员信息</title>
</head>
<body>
<center>
<form action="user!add" method="post">
	登录名：<input type="text" name="userName">
	用户密码：<input type="text" name="password">
	用户角色：<select name="role">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
		  </select>
	<input type="submit" value="添加用户更">
</form>
</center>
</body>
</html>