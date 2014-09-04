<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <title>招投标登录</title>    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="招标" content="yes" />    
    <script src="js/jquery-2.1.1.js"></script>
   <script src="js/bootstrap.js"></script>
    
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
    
    <link href="css/font-awesome.css" rel="stylesheet" />
    
    <link href="css/adminia.css" rel="stylesheet" /> 
    <link href="css/adminia-responsive.css" rel="stylesheet" /> 
    
    <link href="./css/pages/login.css" rel="stylesheet" /> 

 
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/></head>

<body>
	
<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 				
			</a>
			<a class="brand" href="./">招投标login</a>
			<div class="nav-collapse">
				<ul class="nav pull-right">
				</ul>
			</div> 
		</div>
	</div> 
</div> 


<div id="login-container">
	
	
	<div id="login-header">
		
		<h3>登录</h3>
		
	</div> <!-- /login-header -->
	
	<div id="login-content" class="clearfix">
	
	<form action="hello.action" method="post">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="username" >用户名</label>
						<div class="controls">
							<input type="text" class="" id="username" style="height: 40px;" name="username"/>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">密码</label>
						<div class="controls">
							<input type="password" class="" id="password" style="height: 40px;" name="password"/>
						</div>
					</div>
				</fieldset>
				
				<div id="remember-me" class="pull-left">
					<input type="checkbox" name="remember" id="remember" />
					<label id="remember-label" for="remember">Remember Me</label>
				</div>
				
				<div class="pull-right">
					<button type="submit" class="btn btn-warning btn-large">
						登录/login
					</button>
				</div>
		</form>
		</div>
</div> 

  </body>
</html>
