var _this = new Vue({
		el : '#app',
		data : {
			name : '',
			password : ''
			
			
		},
		
		methods : {
			reg : function(){
				var passWordTwo=this.form.passWordTwo;
				var  passWord=this.form.passWord;
				var  userName=this.form.userName;
				
			},
			formatter:function(row, column) {
		        return row.address;
		      }
		}
	})
	