function checkZh(){
	var val=document.getElementById("username").value;
	$.ajax( {
		url:'/companymgr1/checkzh',
		type:'post',
		data: {
			username:val
		},
		datatype : "json",//"xml", "html", "script", "json", "jsonp", "text".           
		success : function(data) {
			if(data =='2'){
				document.getElementById("result").innerHTML="<font color='red'>×用户名不能为空</font>";
			}
			if(data =='0'){
				document.getElementById("result").innerHTML="<font color='green'>√用户名可用!</font>";
			}
			if(data=='1'){
				document.getElementById("result").innerHTML="<font color='red'>×用户名不可用</font>";
			}
		}
	});
}
