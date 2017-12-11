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

<form id="query-employee"  onsubmit="return false;">
    <div style="float: left">
        <label for="empname">姓名:</label>
        <input class="easyui-validatebox" type="text" name="empname" id="empname" data-options="required:true" />
    </div>
    <div style="float: left">
        <label for="empstate">状态:</label>
        <select class="easyui-combobox" id="empstate" name="empstate" style="width:200px;" panelHeight="auto" editable="false">
            <option value="1">正常</option>
            <option value="2">离职</option>
            <option value="3">请假</option>
        </select>
    </div>
    <div style="float: left">
        <label for="roleid">角色:</label>
        <select class="easyui-combobox" id="roleid" name="roleid" style="width:200px;" panelHeight="auto" editable="false" url="/getAllRoles" valueField="roleid" textField="rolename"  >
        </select>
    </div>
    <div style="float: left">
        <input type="submit" value="查询" class="s-btn" onclick="return getList();">
    </div>
</form>

<table id="tt" class="easyui-datagrid" style="width:600px;height:250px"
       url="/selectEmployee"
       title="Load Data" iconCls="icon-save"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="empid" width="80">#</th>
        <th field="empname" width="80">姓名</th>
        <th field="empphone" width="80" align="right">手机号</th>
        <th field="empsex" width="80" align="right">性别</th>
        <th field="empstate" width="150">状态</th>
        <th field="roleid" width="60" align="center">角色</th>
        <th field="oper" width="60" align="center">操作</th>
    </tr>
    </thead>
</table>
</body>
</html>
