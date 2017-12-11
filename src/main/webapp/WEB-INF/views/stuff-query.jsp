<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-11
  Time: 上午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工查询</title>
    <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>

</head>
<body>

<form id="ff" method="post">
    <div>
        <label for="empname">姓名:</label>
        <input class="easyui-validatebox" type="text" name="empname" id="empname" data-options="required:true" />
    </div>
    <div>
        <label for="empstate">状态:</label>
        <select class="easyui-combobox" id="empstate" name="empstate" style="width:200px;" panelHeight="auto" editable="false">
            <option value="1">正常</option>
            <option value="2">离职</option>
            <option value="3">请假</option>
        </select>
    </div>
    <div>
        <label for="roleid">角色:</label>
        <select class="easyui-combobox" id="roleid" name="roleid" style="width:200px;" panelHeight="auto" editable="false" url="/getAllRoles" valueField="roleid" textField="rolename"  >
        </select>
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search">查询</a>
    </div>
</form>
</body>
</html>
