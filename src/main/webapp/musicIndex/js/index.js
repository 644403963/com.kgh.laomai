window.onload=function(){
	queryMusic();
	//重新加载js
	$.ajax({
		type:"GET",
		url:"js/xiami.js",
		datatype:"script"
	});
}
function queryMusic(){
	$.ajax({
		url : '../music/queryMusic',
		type : 'post',
		data : {
			
		},
		success : function(data) {
		for(x=0;x<data.length;x++){
			var tabledata ='<li class="songList" style="background-color: rgb(245, 245, 245);">'+
			'<div class="songLMain">'+
			'<div class="check">'+
				'<input class="checkIn" type="checkbox" select="0">'
			+'</div>'
			+'<div class="start" >'
			+	'<em sonN="'+(x+1)+'">'+(x+1)+'</em>'
			+'</div>'
			+'<div class="songBd">'
				+'<div class="col colsn">'+data[x].musicName+'</div>'
				+'<div class="col colcn">'+data[x].singer+'</div>'
				+'<div class="col">'+data[x].musicAlbum+'</div>'
			+'</div>'
			+'<div class="control">'
				+'<a class="cicon love"></a>'
				+'<a class="cicon more" style="display:none"></a>'
				+'<a class="cicon dele" style="display:none"></a>'
			+'</div>'
		+'</div>'								
	+'</li>';
			$(".songUL").append(tabledata);
			//存 歌曲id 到隐藏文本框
			var hiddenId ='<input id="'+(x+1)+'" type="hidden" value="'+data[x].id+'">';
			//存歌曲文件  文件 名 到隐藏文本框
			var hiddenUploadId ='<input id="'+data[x].id+'" type="hidden" value="'+data[x].uploadId+'">';
			
			$(".songUL").append(hiddenId);
			$(".songUL").append(hiddenUploadId);
			$(".songUL").trigger("create");//意思重新载入所在标签延时 非常有用，不加动态append加载的标签将丢css样式
		}
		},
		error : function(data) {
			
		},
		dataType : 'json',
	})
}


