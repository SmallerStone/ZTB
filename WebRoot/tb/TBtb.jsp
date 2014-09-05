<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <title>投标投标页面</title>
    
          <script src="../js/jquery-2.1.1.js"></script>
   <script src="../js/bootstrap.js"></script>   
   <script src="../js/faq.js"></script>
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" />
    
      <link href="../css/font-awesome.css" rel="stylesheet" />
    
     <link href="../css/adminia.css" rel="stylesheet" /> 
    <link href="../css/adminia-responsive.css" rel="stylesheet" /> 
    <link href="../css/pages/faq.css" rel="stylesheet" /> 
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	  <style type="text/css">
	     .th1{
	        width: 80px;
	     }
	  </style>
  </head>

<body class="back">
	<!-- 页面导航 -->
<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container" align="center">

			<a class="brand" href="#" >招投标系统</a>
			
			<div class="nav-collapse">
			
				<ul class="nav pull-right">
					<li>
						<a href="#"><span class="badge badge-warning">7</span></a>
					</li>
					
					<li class="divider-vertical"></li>
					
					<li class="dropdown">
						
						<a  class="dropdown-toggle " >
						 天辰软件有限公司
							<b class="caret"></b>							
						</a>
						
						<ul class="dropdown-menu">
							<li>
								<a href="./account.html"><i class="icon-user"></i> 帐户设置  </a>
							</li>
							
							<li>
								<a href="./change_password.html"><i class="icon-lock"></i> 更改密码</a>
							</li>
							
							<li class="divider"></li>
							
							<li>
								<a href="./"><i class="icon-off"></i>注销</a>
							</li>
						</ul>
					</li>
				</ul>
				
			</div> 
			
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->

<div id="content">
	
	<div class="container">
		
		<div class="row">
			
			<div class="span3">
				
				<div class="account-container">
				
					<div class="account-avatar">
						<img src="img/headshot.png" alt="" class="thumbnail" />
					</div> 
				
					<div class="account-details">
					
						<span class="account-name">天辰软件有限公司</span>
						
						<span class="account-role">投标人</span>
						
						<span class="account-actions">
							<a href="javascript:;">简介</a> |
							
							<a href="javascript:;">编辑设置</a>
						</span>
					
					</div> <!-- /account-details -->
				
				</div> <!-- /account-container -->
				
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					
					<li >
						<a href="TBUser.jsp">
							<i class="icon-pushpin"></i>
							首页		
						</a>
					</li>
					
					<li class="active">
						<a href="TBtb.jsp">
							<i class="icon-home"></i>
							投标统计
						</a>
					</li>
					
					<li>
						<a href="./plans.html">
							<i class="icon-th-list"></i>
							开标页面		
						</a>
					</li>
					
					<li>
						<a href="TBResult.jsp">
							<i class="icon-th-large"></i>
							结果页面	
						</a>
					</li>
				</ul>	
				<hr />
				<br />
		
			</div> <!-- /span3 -->
	
			
			<div class="span9">
			
			<h1 class="page-title">
					<i class="icon-pushpin"></i>
					投标统计				
				</h1>
				
				<div class="widget widget-table">
										
					<div class="widget-header">
						<i class="icon-th-list"></i>
						<h3>统计</h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
					
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>#</th>
									<th>标名称</th>
									<th>投标文件名称</th>
									<th>投标时间</th>
									<th class="th1">操作</th>
									
								</tr>
							</thead>
							
							<tbody>
								<tr>
									<td>1</td>
									<td>工商电脑采购</td>
									<td>电脑采购</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>2</td>
									<td>房屋建筑</td>
									<td>建设设计</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>3</td>
									<td>政府电脑采购</td>
									<td>电脑采购</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>4</td>
									<td>工程器材采购</td>
									<td>采购文档</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>5</td>
									<td>David</td>
									<td>Robinson</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>6</td>
									<td>Reggie</td>
									<td>Miller</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>7</td>
									<td>Clyde</td>
									<td>Drexler</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
								<tr>
									<td>8</td>
									<td>Hakeem</td>
									<td>Olajuwon</td>
									<td>2014/09/01</td>
									<td><button class="btn btn-small btn-warning" data-toggle="modal">开标</button></td>
								</tr>
							</tbody>
						</table>
					
					</div> <!-- /widget-content -->
					
				
				
			</div> <!-- /span9 -->
			
		</div> <!-- /row -->
		
	</div> <!-- /container -->
	</div>
	
</div> <!-- /content -->
					
	
		<div id="footer">
			
			<div class="container">				
				<hr />
				<p>&copy; 2014 Go 招标.</p>
			</div> <!-- /container -->
			
			
			
		</div> <!-- /footer -->
	
		
		
		
		
  </body>
</html>
