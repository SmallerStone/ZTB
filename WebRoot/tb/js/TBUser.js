$(function() {
		$("#search").click(function(){
			$("#zhu").replaceWith(" " +
					  "<div class='widget'>"
						+"	<div class='widget-content'>"
								+"<h3>"+'���ҹ��ֵ̾��Բɹ� '+"</h3>"
								+"<div style='float: right;'>"
					  				+"<button id='11' class='btn' data-toggle='modal'>"+'����ñ�'+"</button>"
					 				+"</div>"
					 				+"</br>"
					 				+"</br>"
					 				+"</br>"
					 				+"<p>"+'�ҹ�˾��ɹ�һ�����ԣ��۸��������ϣ������������������ĵ�����Ϣ����11��������������������������������������������������������������������������'+"</p>"
								+"<p><a>"+'�б��ļ�word����'+"</a></p>"
								+"<p><a>"+'����һ����'+"</a></p>"
								+"<p><a>"+'���϶�����'+"</a></p>"
								+"<p><a>"+'����������'+"</a></p>"
								+"<p><a>"+'����������'+"</a></p>"
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
									+">"+'����'+"</a>"
									+"</td>"
								    +"</tr> "
								 );
					 }
					
		      }
		});
		
	});
	
});