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

			turnReg : function(){
				window.location.href='./reg.html';  
			},
			check : function(event){
				//获取值
				var name = this.name;
				var password = this.password;
				if(name == '' || password == ''){
					this.$message({
						message : '账号或密码为空！',
						type : 'error'
					})
					return;
				}
				$.ajax({
					url : '../user/userLogIn',
					type : 'post',
					data : {
						userName : name,
						passWord : password
					},
					success : function(data) {
						if(data == 'true' || data == true){
							alert("登录成功");
							window.location.href='../musicIndex/index.html';  
						}else {
							alert("登录失败");
						}
					},
					error : function(data) {
						alert(data);
					},
					dataType : 'json',
				})
			}
		}
	})
	