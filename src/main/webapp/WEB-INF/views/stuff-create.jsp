<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-11
  Time: 下午3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新建员工</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>
<form id="ff" method="post">
    <div>
        <label for="empname">姓名 </label>
        <input class="easyui-validatebox" type="text" name="empname" id="empname" data-options="required:true" />
    </div>
    <div>
        <label for="empphone">手机号 </label>
        <input class="easyui-validatebox" type="text" name="empphone" id="empphone" data-options="required:true" />
    </div>
    <div>
        <label for="empphone">头像照 </label>
        <input class="easyui-filebox" style="width:300px">
    </div>
    <div>
        <label for="empphone">性别 </label>
        <div class="easyui-panel" style="padding:5px;">
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">男</a>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1',selected:true">女</a>
        </div>
    </div>
    <div>
        <label for="empphone">员工角色 </label>
        <div class="easyui-panel" style="padding:5px;">
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'"></a>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1',selected:true">女</a>
        </div>
    </div>

    <div>
        <a href="#" class="easyui-linkbutton">提交</a>
    </div>
</form>
</body>
</html>
