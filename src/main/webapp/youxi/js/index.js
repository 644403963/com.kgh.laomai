
new Vue({
		el : '#app',
		data : {
			
			 editableTabsValue2: '2',
		        editableTabs2: [{
		          title: 'Tab 1',
		          name: '1',
		          content: 'Tab 1 content'
		        }, {
		          title: 'Tab 2',
		          name: '2',
		          content: 'Tab 2 content'
		        }],
		        tabIndex: 2
		      },
			
		methods : {
			 handleOpen:function(key, keyPath) {
			        console.log(key, keyPath);
			      },
			      handleClose:function(key, keyPath) {
			        console.log(key, keyPath);
			      },
			      addTab:function(targetName) {
			          let newTabName = ++this.tabIndex + '';
			          this.editableTabs2.push({
			            title: 'New Tab',
			            name: newTabName,
			            content: 'New Tab content'
			          });
			          this.editableTabsValue2 = newTabName;
			        },
			        
			        removeTab:function(targetName) {
			            let tabs = this.editableTabs2;
			            let activeName = this.editableTabsValue2;
			            if (activeName === targetName) {
			              tabs.forEach((tab, index) => {
			                if (tab.name === targetName) {
			                  let nextTab = tabs[index + 1] || tabs[index - 1];
			                  if (nextTab) {
			                    activeName = nextTab.name;
			                  }
			                }
			              });
			            }
			            
			            this.editableTabsValue2 = activeName;
			            this.editableTabs2 = tabs.filter(tab => tab.name !== targetName);
			          }
			        
		}
	})
	