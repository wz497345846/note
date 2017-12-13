<%--
  Created by IntelliJ IDEA.
  User: JonyChen
  Date: 2017/12/11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>查看账单</title>
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
                                href:node.attributes.suibian
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
                <li data-options="attributes:{suibian:'findBill'}">查看账单</li>
                <li data-options="attributes:{suibian:'editBill'}">编辑账单</li>
            </ul>
        </li>
    </ul>
</div>
<div data-options="region:'center',title:'操作区'">
    <div id="tab" class="easyui-tabs">

        </div>
    </div>
</div>
</body>
</html>
