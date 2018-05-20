var _this = new Vue({
    el: '#app',
    data: {
        form: {
            phoneNumber: '',
            sex: '',
            nickName: '',
            passWordTwo: '',
            passWord: '',
            userName: '',
            isTrueUN: false,
            isTruePW:false
        },
        rules: {
        	userName: [{
                 required: true,
                 message: '请输入用户名',
                 trigger: 'blur'
             },
             {
                 min: 1,
                 max: 15,
                 message: '长度在 1到 15 个字符',
                 trigger: 'blur'
             }],
            phoneNumber: [{
                required: true,
                message: '请输入电话',
                trigger: 'blur'
            },
            {
                min: 1,
                max: 15,
                message: '长度在 1到 15 个字符',
                trigger: 'blur'
            }],
            sex: [{
                required: true,
                message: '请选择性别',
                trigger: 'blur'
            }],
            nickName: [{
                required: true,
                message: '请输入昵称',
                trigger: 'blur'
            },
            {
                min: 1,
                max: 15,
                message: '长度在 1到 15 个字符',
                trigger: 'blur'
            }],

            passWordTwo: [{
                required: true,
                message: '请再次输入密码',
                trigger: 'blur'
            },
            {
                min: 1,
                max: 15,
                message: '长度在 1到 15 个字符',
                trigger: 'blur'
            }],
            passWord: [{
                required: true,
                message: '请输入密码',
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

    methods: {
        reg: function(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid&&isTruePW&&isTrueUN) {
                	$.ajax({
                        url: '../user/insertUser',
                        type: 'post',
                        data: {
                            phoneNumber:this.form.phoneNumber,
                            sex:this.form.sex,
                            nickName:this.form.nickName,
                            passWord:this.form.passWord,
                            userName:this.form.userName
                        },
                        success: function(data) {
                        	if(data.result=='操作成功'){
                        		window.location.href='./logIn.html';  
                        	}else{
                        		_this.$message.error('注册失败');
                        	}
                        	
                        },
                        error: function(data) {},
                        dataType: 'json',
                    })
;                 
                } else {
                	 this.$message.error('请输入正确必填项');
                  return false;
                }
                
              });
        },
        checkPassWord: function() {
            var passWordTwo = this.form.passWordTwo;
            var passWord = this.form.passWord;
            if (passWord == "" || passWordTwo == "") {
                return;
            }

            if (passWordTwo == passWord) {
            	isTruePW = true;
                $("#checkPassWord").html("密码正确");
                $("#checkPassWord").attr("style", "color: green;")
            } else {
            	isTruePW = false;
                $("#checkPassWord").html("两次密码不一致");
                $("#checkPassWord").attr("style", "color: red;")
            }
        },
        checkUserName: function() {
            var userName = this.form.userName;
            if (userName == "") {
                return;
            }

            $.ajax({
                url: '../user/checkUserName',
                type: 'post',
                data: {
                    userName: userName,
                },
                success: function(data) {
                    if (data == false) {
                        isTrueUN = true;
                        $("#checkUserName").html("用户名可用");
                        $("#checkUserName").attr("style", "color: green;")
                    } else {
                    	isTrueUN = false;
                        $("#checkUserName").html("用户名重复");
                        $("#checkUserName").attr("style", "color: red;")
                    }
                },
                error: function(data) {},
                dataType: 'json',
            })
        },

    },
    //页面加载完成
    mounted() {
        //			$("#checkPassWord").attr("onblur","checkPassWord()");
        //			$("#checkUserName").attr("onblur","checkUserName()");
    }
})