<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="GB18030" />
    <title>�б�������</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />    
    
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" />
    
    <link href=".��/css/font-awesome.css" rel="stylesheet" />
    
    <link href=".��/css/adminia.css" rel="stylesheet" /> 
    <link href=".��/css/adminia-responsive.css" rel="stylesheet" /> 
    
    <link href=".��/css/pages/dashboard.css" rel="stylesheet" /> 
    

  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
	
<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 				
			</a>
			
			<a class="brand" href="./">��Ͷ��ϵͳ</a>
			
			<div class="nav-collapse">
			
				<ul class="nav pull-right">
					<li>
						<a href="#"><span class="badge badge-warning">7</span></a>
					</li>
					
					<li class="divider-vertical"></li>
					
					<li class="dropdown">
						
						<a data-toggle="dropdown" class="dropdown-toggle " href="#">
							Rod Howard <b class="caret"></b>							
						</a>
						
						<ul class="dropdown-menu">
							<li>
								<a href="./zhaobiao.html"><i class="icon-user"></i> �б����  </a>
							</li>
							
							<li>
								<a href="./change_password.html"><i class="icon-lock"></i> Change Password</a>
							</li>
							
							<li class="divider"></li>
							
							<li>
								<a href="./"><i class="icon-off"></i> Logout</a>
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
						<img src="./img/headshot.png" alt="" class="thumbnail" />
					</div> <!-- /account-avatar -->
				
					<div class="account-details">
					
						<span class="account-name">����</span>
						
						<span class="account-role">�б���Ա</span>
						
						<span class="account-actions">
							<a href="#">Profile</a> |
							
							<a href="#">Edit Settings</a>
						</span>
					
					</div> <!-- /account-details -->
				
				</div> <!-- /account-container -->
				
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					
					<li class="active">
						<a href="./index.html">
							<i class="icon-home"></i>
							�б��ļ�����	 		
						</a>
					</li>
					
					<li>
						<a href="./faq.html">
							<i class="icon-pushpin"></i>
							δ���衣��	
						</a>
					</li>
					
					<li>
						<a href="./plans.html">
							<i class="icon-th-list"></i>
							δ���衣��		
						</a>
					</li>
					
					<li>
						<a href="./grid.html">
							<i class="icon-th-large"></i>
							δ���衣��	
							<span class="label label-warning pull-right">5</span>
						</a>
					</li>
					
					<li>
						<a href="./charts.html">
							<i class="icon-signal"></i>
							δ���衣��	
						</a>
					</li>
					
					<li>
						<a href="./account.html">
							<i class="icon-user"></i>
							δ���衣��						
						</a>
					</li>
					
					<li>
						<a href="./login.html">
							<i class="icon-lock"></i>
							δ���衣��
						</a>
					</li>
					
				</ul>	
				
				<hr />
				<br />
		
			</div> <!-- /span3 -->
		
			
		<div class="span9">
				
				<h1 class="page-title">
					<i class="icon-th-large"></i>
					�б�������					
				</h1>
				
				
				<div class="row">
					
					<div class="span9">
				
						<div class="widget">
							
							<div class="widget-header">
								<h3>������Ϣ</h3>
							</div> <!-- /widget-header -->
									
							<div class="widget-content">
								
								
								
				<div class="tabbable">					
						<br />
						
							<div class="tab-content">
								<div class="tab-pane active" id="1">
								<form id="edit-profile" class="form-horizontal" />
									<fieldset>
										
										<div class="control-group">											
											<label class="control-label" for="username">�б���ID</label>
											<div class="controls">
												<input type="text" class="input-medium disabled" id="username" value="1332"  disabled=""/>
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="firstname">�б�����</label>
											<div class="controls">
												<input type="text" class="input-medium" id="firstname" value="GB2113" />
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="lastname">�б�������</label>
											<div class="controls">
												<input type="text" class="input-medium" id="lastname" value="�������������б��ļ�" />
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="control-group">											
											<label class="control-label" for="lastname">Ͷ����</label>
											<div class="controls">
												<input type="text" class="input-medium" id="lastname" value="��֪��" />
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="control-group">											
											<label class="control-label" for="email">�б���</label>
											<div class="controls">	
												<textarea class="form-control" rows="3" id="email" > </textarea> 
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="inputfile">�����ϴ�</label>
											<div class="controls">	
												<input type="file" id="inputfile">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->										
											
										<div class="form-actions">
											<button type="submit" class="btn btn-primary">Save</button> 
											<button class="btn">Cancel</button>
										</div> <!-- /form-actions -->
									</fieldset>
								</form>
								</div>

							</div>
			  
						</div>
								
							</div> <!-- /widget-content -->
							
						</div> <!-- /widget -->
						
					</div> <!-- /span9 -->
					
				</div> <!-- /row -->
				
				
				
				
				
				
				
				
				
			</div> <!-- /span9 -->
			
			
		</div> <!-- /row -->
		
	</div> <!-- /container -->
	
</div> <!-- /content -->
					
	
<div id="footer">
	
	<div class="container">				
		<hr />
		<p>&copy; 2012 Go Ideate.</p>
	</div> <!-- /container -->
	
</div> <!-- /footer -->


    

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="./js/jquery-1.7.2.min.js"></script>


<script src="./js/bootstrap.js"></script>

  </body>
</html>