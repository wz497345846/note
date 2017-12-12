<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-12
  Time: 下午2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>角色与权限</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script>
        $.ajax({
            type: 'POST',
            dataType : 'json',
            url: "",
            data: param,
            beforeSend: ajaxLoading,
            success: function(json){
                for(var i=0;i<json.length;i++){

                }
            }
        });
        $("#menu-checkbox")
    </script>
</head>
<body>
<table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:500px"
       url="/getAllRoles"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th field="roleid" width="50">#</th>
        <th field="rolename" width="50">角色类型</th>
        <th field="roledesc" width="50">角色权限</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>

<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">
    <div class="ftitle">角色信息 :</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>角色名称:</label>
            <input name="rolename" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem" id="menu-checkbox">
            <label >功能权限：</label>

        </div>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">Save</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>
</body>
</html>
