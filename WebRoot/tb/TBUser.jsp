<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <title>Ͷ���˲��ҳ��</title>
     <script src="../js/jquery-2.1.1.js"></script>
     <script src="../js/bootstrap.js"></script>   
     <script src="../js/faq.js"></script>
      <script src="js/TBUser.js"></script>
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" />
    
      <link href="../css/font-awesome.css" rel="stylesheet" />
    
     <link href="../css/adminia.css" rel="stylesheet" /> 
    <link href="../css/adminia-responsive.css" rel="stylesheet" /> 
    
    
    <link href="../css/pages/faq.css" rel="stylesheet" /> 
	
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

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
								<a href="#"><i class="icon-user"></i> �ʻ�����  </a>
							</li>
							
							<li>
								<a href="#"><i class="icon-lock"></i> ��������</a>
							</li>
							
							<li class="divider"></li>
							
							<li>
								<a href="#"><i class="icon-off"></i>ע��</a>
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
							<a href="#">���</a> |
							
							<a href="#">�༭����</a>
						</span>
					
					</div> <!-- /account-details -->
				
				</div> <!-- /account-container -->
				
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					
					<li class="active">
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
					
					<li>
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
					��������Ŀ					
				</h1>
				<div class="widget" id="zhu">
					<div class="widget-content">
						<h3>Search...</h3>
							<form class="faq-search">
							   <input type="text" name="search" placeholder="Search by Keyword">
							</form>
						<ol> 
						  <c:catch>
						     <c:forEach var="list" items="${lis2}">
							<li>
									<h4><a id="zbname" >${list.zbname}</a></h4>
									 <div style="display:none;">
									  <input id="zbid" value="${list.id}"/>
									 </div>
							</li>
							 </c:forEach>
						   </c:catch>
							<li>
									<h4>�����칫��Ʒ�ɹ�</h4>
							</li>
							<li>
									<h4>�����Ҿ������ɹ�</h4>
							</li>
							<li>
									<h4>����aoϵͳ�б�</h4>
							</li>
							<li>
									<h4>��ľ�޽��б�</h4>
							</li>
							<li>
									<h4>����ˮ��ϵͳ�б�</h4>
							</li>
						</ol>
						<!-- �б����� -->
					</div> <!-- /widget-content -->
					
				</div> <!-- /widget -->
				
			<!-- 	<div class="widget">
					<div class="widget-content">
						<h3>���ҹ��ֵ̾��Բɹ� </h3>
						<div style="float: right;">
					  		<button id="11" class="btn" data-toggle="modal">����ñ�</button>
					 	</div>
					 		</br>
					 		</br>
					 		</br>
					 	<p>�ҹ�˾��ɹ�һ�����ԣ��۸��������ϣ������������������ĵ�����Ϣ����11��������������������������������������������������������������������������'+"</p>"
						<p><a>�б��ļ�word����</a></p>
						<p><a>����һ����</a></p>
						<p><a>���϶�����</a></p>
						<p><a>����������</a></p>
						<p><a>��������</a></p>
					</div> widget-content
				</div>widget -->
								
				
			</div> <!-- /span9 -->
			
		</div> <!-- /row -->
		
	</div> <!-- /container -->
	
</div> <!-- /content -->
					
	
		<div id="footer">
			
			<div class="container">				
				<hr />
				<p>&copy; 2014 Go �б�.</p>
			</div> <!-- /container -->
		</div> <!-- /footer -->
	   <script src="../js/jquery-2.1.1.js"></script>
	   <script src="js/TBUser.js"></script>	
  </body>
        
</html>
