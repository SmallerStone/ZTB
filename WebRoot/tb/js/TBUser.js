$(function() {
	$("#zbname").click(function(){
		var zbid=$("#jobSeekerid").val();
		$.ajax({
				url :'tb.action'
				, type : 'post'
				, dataType : 'text'
				, data:"zbid="+zbid
				, success : function (data){
					var rooms = $.parseJSON(data);
						$("#zhu").replaceWith(" " +
						 "<div class='widget'>"
							+"<div class='widget-content'>"
								+"<h3>"+rooms.zbname+"</h3>"
							+"<div style='float: right;'>"
							+"<button id='11' class='btn' data-toggle='modal'>"+'����ñ�'+"</button>"
							+"</div>"
							+"</br>"
							+"</br>"
							+"</br>"
							+"<p>"+rooms.zbintro+"</p>"
							+"<p><a>"+rooms.zbbookname+"</a></p>"
							+"<p><a>"+'����һ����'+"</a></p>"
							+"<p><a>"+'���϶�����'+"</a></p>"
							+"<p><a>"+'����������'+"</a></p>"
							+"<p><a>"+'����������'+"</a></p>"
							+"</div> "
							+"</div>"
						);
				}
	    });
	});
	
});