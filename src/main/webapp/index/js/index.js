
new Vue({
		el : '#app',
		data : {
			        tableData: Array(20).fill(item)
		},
		methods : {
			 handleOpen:function(key, keyPath) {
			        console.log(key, keyPath);
			      },
			      handleClose:function(key, keyPath) {
			        console.log(key, keyPath);
			      }
		}
	})
	