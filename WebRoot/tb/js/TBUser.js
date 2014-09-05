$(function() {
		$("#search").click(function(){
			$("#zhu").replaceWith(" " +
					  "<div class='widget'>"
						+"	<div class='widget-content'>"
								+"<h3>"+'国家工商局电脑采购 '+"</h3>"
								+"<div style='float: right;'>"
					  				+"<button id='11' class='btn' data-toggle='modal'>"+'申请该标'+"</button>"
					 				+"</div>"
					 				+"</br>"
					 				+"</br>"
					 				+"</br>"
					 				+"<p>"+'我公司与采购一批电脑，价格号商量，希望大家来报名，具体文档和信息如下11！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！'+"</p>"
								+"<p><a>"+'招标文件word下载'+"</a></p>"
								+"<p><a>"+'资料一下载'+"</a></p>"
								+"<p><a>"+'资料二下载'+"</a></p>"
								+"<p><a>"+'资料三下载'+"</a></p>"
								+"<p><a>"+'资料四下载'+"</a></p>"
								+"</div> "
								+"</div>"
								);
		});
});

$(function() {
	$("#apply").click(function(){
		var jobSeekerid=$("#jobSeekerid").val();
		var enterpriseid=$("#enterpriseid").val();
		var jobSeekerPosition=$("#jobSeekerPosition").val();
		var workdress=$("#workdress").val();
		var enterpriseName=$("#enterpriseName").val();
		
		$.ajax({
				url :'http://localhost:8080/ZeroSSH/job_seekerjl!Shenqueryjli.action'
				, type : 'post'
				, dataType : 'text'
				, data:"jobSeekerid="+jobSeekerid
				, success : function (data){
					var rooms = $.parseJSON(data);
					 $("#myjl").empty();
					 for(var i=0 ;i <rooms.length; i++){
						 $("#myjl").append(
								 "<tr>"+
									"<td>"+
									rooms[i].JLName
									+"</td>"
									+"<td>"
									+"<a href="+'/ZeroSSH/recruitment_job_shen!PositionShenqin.action?'
									+"id="+rooms[i].id
									+"&enterpriseid="+enterpriseid
									+"&jobSeekerPosition="+jobSeekerPosition
									+"&workdress="+workdress
									+"&enterpriseName="+enterpriseName
									+">"+'申请'+"</a>"
									+"</td>"
								    +"</tr> "
								 );
					 }
					
		      }
		});
		
	});
	
});