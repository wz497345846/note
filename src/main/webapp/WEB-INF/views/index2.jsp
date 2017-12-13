<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>easy-ui</title>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
	$(function(){
		//给树添加点击事件
		$("#tr").tree({

			onClick:function(node){
				var  obj = $("#tr").tree("isLeaf",node.target);
				var tab = $("#tab");
				if(obj){
					var t = tab.tabs("getTab",node.text);
					if(t == null){
						//获取选项卡
						 tab.tabs("add",{
							 title:node.text,
						     closable:true,
						     href:node.attributes.value
						 });
					}else{
						tab.tabs("select",node.text);
					}
				}
			}
		});
		
	});
</script>
</head>
<body class="easyui-layout">   
    <div data-options="region:'west',title:'菜单',split:true" style="width:200px;">
    	<ul id="tr" class="easyui-tree">
			<li>
				<span>账单管理</span>
				<ul>
					<li data-options="attributes:{value:'stuff-query'}">查看员工</li>
					<li data-options="attributes:{value:'stuff-create'}">创建员工</li>
					<li data-options="attributes:{value:'addcourse'}">添加课程</li>
					<li data-options="attributes:{value:'showcourse'}">查看课程</li>
					<li data-options="attributes:{value:'findBill'}">查看订单</li>
					<li data-options="attributes:{value:'editBill'}">编辑订单</li>
					<li data-options="attributes:{value:'member-query'}">查看会员</li>
				</ul>
			</li>
    	</ul>
    </div>   
    <div data-options="region:'center',title:'操作区'">
    	<div id="tab" class="easyui-tabs">
    		<div title="首页" style="padding:20px;">
    			
    		</div>
    	</div>
    </div>   
</body>  
</html>