<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <title>Ͷ����ҳ��</title>
    
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
	     .th2{
	        width:200px;
	     }
	     .th3{
	        width:50px;
	     }
	  
	  </style>
  </head>

<body>
	
	<!-- ҳ�浼�� -->
<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 				
			</a>
			
			<a class="brand" >��Ͷ��ϵͳ</a>
			
			<div class="nav-collapse">
			
				<ul class="nav pull-right">
					<li>
						<a href="#"><span class="badge badge-warning">7</span></a>
					</li>
					
					<li class="divider-vertical"></li>
					
					<li class="dropdown">
						
						<a data-toggle="dropdown" class="dropdown-toggle " >
						 �쳽������޹�˾
							<b class="caret"></b>							
						</a>
						
						<ul class="dropdown-menu">
							<li>
								<a href="./account.html"><i class="icon-user"></i> �ʻ�����  </a>
							</li>
							
							<li>
								<a href="./change_password.html"><i class="icon-lock"></i> ��������</a>
							</li>
							
							<li class="divider"></li>
							
							<li>
								<a href="./"><i class="icon-off"></i>ע��</a>
							</li>
						</ul>
					</li>
				</ul>
				
			</div> <!-- /nav-collapse -->
			
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
					
						<span class="account-name">�쳽������޹�˾</span>
						
						<span class="account-role">Ͷ����</span>
						
						<span class="account-actions">
							<a href="javascript:;">���</a> |
							
							<a href="javascript:;">�༭����</a>
						</span>
					
					</div> <!-- /account-details -->
				
				</div> <!-- /account-container -->
				
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					
					<li >
						<a href="TBUser.jsp">
							<i class="icon-pushpin"></i>
							��ҳ		
						</a>
					</li>
					
					<li>
						<a href="TBtb.jsp">
							<i class="icon-home"></i>
							Ͷ��ͳ��
						</a>
					</li>
					
					<li>
						<a href="./plans.html">
							<i class="icon-th-list"></i>
							����ҳ��		
						</a>
					</li>
					
					<li class="active">
						<a href="TBResult.jsp">
							<i class="icon-th-large"></i>
							���ҳ��	
						</a>
					</li>
				</ul>	
				<hr />
				<br />
		
			</div> <!-- /span3 -->
	
			
			<div class="span9">
			
			<h1 class="page-title">
					<i class="icon-pushpin"></i>
					Ͷ����				
				</h1>
				
				<div class="widget widget-table">
										
					<div class="widget-header">
						<i class="icon-th-list"></i>
						<h3>ͳ��</h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
					
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th class="th3">#</th>
									<th class="th2">������</th>
									<th>������Ϣ</th>
									<th class="th1">�Ƿ��б�</th>
								</tr>
							</thead>
							
							<tbody>
								<tr>
									<td>1</td>
									<td>���̵��Բɹ�</td>
									<td>���Բɹ�</td>
									<td>�б�</td>
								</tr>
								<tr>
									<td>2</td>
									<td>���ݽ���</td>
									<td>�������</td>
									<td>δ�б�</td>
								</tr>
								<tr>
									<td>3</td>
									<td>�������Բɹ�</td>
									<td>���Բɹ�</td>
									<td>�б�</td>
								</tr>
								<tr>
									<td>4</td>
									<td>�������Ĳɹ�</td>
									<td>�ɹ��ĵ�</td>
									<td>�б�</td>
								</tr>
								<tr>
									<td>5</td>
									<td>David</td>
									<td>Robinson</td>
									<td>δ�б�</td>
								</tr>
								<tr>
									<td>6</td>
									<td>Reggie</td>
									<td>Miller</td>
									<td>2014/09/01</td>
								</tr>
								<tr>
									<td>7</td>
									<td>Clyde</td>
									<td>Drexler</td>
									<td>2014/09/01</td>
								</tr>
								<tr>
									<td>8</td>
									<td>Hakeem</td>
									<td>Olajuwon</td>
									<td>2014/09/01</td>
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
				<p>&copy; 2014 Go �б�.</p>
			</div> <!-- /container -->
			
			
			
		</div> <!-- /footer -->
	
		
		
		
		
  </body>
</html>
