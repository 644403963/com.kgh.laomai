var _this = new Vue({
		el : '#app',
		data : {
			tableData:[]

		},
		
		methods : {  
			queryInfo: function(){
				$.ajax({
                    url: '../music/queryMusicInfo',
                    type: 'post',
                    async:false,//重要的关健点在于同步和异步的参数， 
                    data: {
                    	musicName:this.form.musicName,
    					musicAlbum:this.form.musicAlbum,
    					singer:this.form.singer
                    },
                    success: function(data) {
                    	//清空表单
                    	_this.tableData=[];
                    	
                    	for(var x=0;x<data.length;x++){
                    		_this.tableData.push({
            					musicName:data[x].musicName,
            					musicAlbum:data[x].musicAlbum,
            					singer:data[x].singer,
            					status:data[x].status,
            					reason:data[x].reason
            				})
                    	}
                    	
                    },
                    error: function(data) {},
                    dataType: 'json',
                });   
				
			},
			toEdit: function(s){
				
			},
			del: function(s){
				
			}
		}
	})
	