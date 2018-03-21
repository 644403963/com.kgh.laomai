new Vue({
		el : '#app',
		data : {
			name : '',
			password : ''
		},
		//页面加载完成
		mounted(){
			this.setImg();
		},
		
		methods : {
			
			setImg : function(){
				$('.el-carousel__item:nth-child(3) img').attr('src','../../index/img/img1.jpg');
				$('.el-carousel__item:nth-child(4) img').attr('src','../../index/img/img2.jpg');
				$('.el-carousel__item:nth-child(5) img').attr('src','../../index/img/img3.jpg');
				$('.el-carousel__item:nth-child(6) img').attr('src','../../index/img/img4.jpg');
			},
			check : function(event){
				//获取值
				var name = this.name;
				var password = this.password;
				
				if(name == ''){
					this.$message({
						message : '你想不想玩，不输入姓名就想玩。再有一次不给你wan了',
						type : 'error'
					})
					return;
				}
				$.ajax({
					url : '../user/youxi',
					type : 'post',
					data : {
						kUserName : name,
						kPassword : password
					},
					success : function(data) {
						
						if(data){
							  this.$prompt('请输入邮箱', '提示', {
						          confirmButtonText: '确定',
						          cancelButtonText: '取消',
						          inputErrorMessage: '邮箱格式不正确'
						        }).then(window.location.href="../youxi/index.html");
						}
					},
					error : function(data) {
						alert(data);
					},
					dataType : 'json',
				})
			},
			 open3: function() {
		        this.$prompt('请输入邮箱', '提示', {
		          confirmButtonText: '确定',
		          cancelButtonText: '取消',
		          inputErrorMessage: '邮箱格式不正确'
		        }).then();
		      }
		}
	})
	