var _this = new Vue({
		el : '#app',
		data : {
			tableData:[],
			dialogFormVisible:false,
			fileList: [],
			url:'../upload/uploadFile',
			form:{
				name:'',
				album:'',
				musicName:'',
				musicAlbum:'',
				singer:''
				},
				rules: {
					musicName: [{
		                 required: true,
		                 message: '请输入歌曲名',
		                 trigger: 'blur'
		             },
		             {
		                 min: 1,
		                 max: 15,
		                 message: '长度在 1到 15 个字符',
		                 trigger: 'blur'
		             }],
		             musicAlbum: [{
		                 required: true,
		                 message: '请输入专辑名',
		                 trigger: 'blur'
		             },
		             {
		                 min: 1,
		                 max: 15,
		                 message: '长度在 1到 15 个字符',
		                 trigger: 'blur'
		             }],
		             singer: [{
		                 required: true,
		                 message: '请输入歌手名',
		                 trigger: 'blur'
		             },
		             {
		                 min: 1,
		                 max: 15,
		                 message: '长度在 1到 15 个字符',
		                 trigger: 'blur'
		             }]
		             
		        }
			
			
		},
		
		methods : {
			handleCurrentChange(val) {
				$.ajax({
                    url: '../music/queryMusicInfo',
                    type: 'post',
                    async:false,//重要的关健点在于同步和异步的参数， 
                    data: {
                    	musicName:this.form.musicName,
    					musicAlbum:this.form.musicAlbum,
    					singer:this.form.singer,
    					pag:val
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
			handleRemove(file, fileList) {
		        console.log(file, fileList);
		      },
		      handlePreview(file) {
				window.location.href = '../upload/download/' + file.response.data;
		      },
		      uploadSuccess(response, file, fileList){
		    	  var button=$("<button>");//定义一个button
		    	  var span=$("<span>下载</span>");//定义一个button表单
		    	  button.append(span);
		    	  button.attr("type","button");
		    	  button.attr("class","el-button el-button--primary el-button--small");
		    	  	var time = _this.uploadTime+1;
		    		$(".el-upload-list__item:nth-child("+time+") a").append(button);
		    		_this.uploadTime++;
		      },
		      //提交上传到 后台 入库 写入文件。
		      submitUpload() {
		          this.$refs.upload.submit();
		        },
		        
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
				
			},
			formatter:function(row, column) {
		        return row.address;
		      },
		      addMusic: function(formName){
		    	  this.submitUpload();
		    	  
		    	  this.$refs[formName].validate((valid) => {
		                if (valid) {
		                	$.ajax({
		                        url: '../music/insertMusic',
		                        type: 'post',
		                        data: {
		                        	musicName:this.form.musicName,
		        					musicAlbum:this.form.musicAlbum,
		        					singer:this.form.singer
		                        },
		                        success: function(data) {
		                        	if(data.result=='操作成功'){
		                        		 location.reload() ;
		                        	}else{
		                        		_this.$message.error('注册失败');
		                        	}
		                        	
		                        },
		                        error: function(data) {},
		                        dataType: 'json',
		                    });          
		                	
		                } else {
		                	 this.$message.error('请输入正确必填项');
		                  return false;
		                }
		                
		              });
				},
		      
		}
	})
	