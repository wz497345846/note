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
    <title>员工创建</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>
<form id="createEmployee5" method="post" action="/createE" enctype="multipart/form-data">
    <table id="tdsa">
        <tr>
            <td><label>姓名 </label></td>
            <td>
                <input class="easyui-validatebox5" type="text" name="empname" data-options="required:true" />
            </td>
        </tr>
    <tr>
        <td>
            <label >手机号 </label>
        </td>
        <td>
            <input class="easyui-validatebox" type="text" name="empphone" data-options="required:true" />
        </td>
    </tr>
    <tr>
        <td>
            <label>头像照 </label>
        </td>
        <td>
            <input class="easyui-filebox" style="width:300px" name="avatar">
        </td>
    </tr>
    <tr>
        <td>
            <label>性别 </label>
        </td>
        <td>
            <input  type="radio" name="empsex"
                   class="easyui-validatebox" checked="checked" value="1"><label>男</label></input>
            <input  type="radio" name="empsex"
                   class="easyui-validatebox" value="0"><label>女</label></input>
        </td>
    </tr>
    <tr>
        <td>
            <label >员工角色 </label>
        </td>
        <td>
            <select class="easyui-combobox"  name="roleid" style="width:200px;" panelHeight="auto" editable="false" url="/getAllRoles" valueField="roleid" textField="rolename"  >
            </select>
        </td>
    </tr>
    <tr>
        <td>
            <label >简介 </label>
        </td>
        <td>
            <textarea name="empdesc"  cols="30" rows="10" class="text-area"></textarea>
        </td>
    </tr>
        <tr>
            <td>
                <input type="submit" value="提交" class="s-btn" >
            </td>
            <td></td>
        </tr>
    </table>

</form>
<script>

</script>
</body>
</html>