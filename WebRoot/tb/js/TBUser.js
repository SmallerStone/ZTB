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
							+"<button id='11' class='btn' data-toggle='modal'>"+'申请该标'+"</button>"
							+"</div>"
							+"</br>"
							+"</br>"
							+"</br>"
							+"<p>"+rooms.zbintro+"</p>"
							+"<p><a>"+rooms.zbbookname+"</a></p>"
							+"<p><a>"+'资料一下载'+"</a></p>"
							+"<p><a>"+'资料二下载'+"</a></p>"
							+"<p><a>"+'资料三下载'+"</a></p>"
							+"<p><a>"+'资料四下载'+"</a></p>"
							+"</div> "
							+"</div>"
						);
				}
	    });
	});
	
});