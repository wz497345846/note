<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-13
  Time: 下午8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工编辑</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>
<table id="tt3" class="easyui-datagrid" style="width:100%;height:100%"
       url="/getallEmployee" toolbar="#tb3"
       title="员工信息编辑" iconCls="icon-save"
       buttons="#dlg-buttons3"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="empid" width="200" align="center">#</th>
        <th field="empname" width="200" align="center">姓名</th>
        <th field="empphone" width="200" align="center">手机号</th>
        <th field="empsex" width="200" align="center">性别</th>
        <th field="empstate" width="200" align="center">状态</th>
        <th field="roleid" width="200" align="center">角色</th>
        <th field="empdesc" width="200" align="center">备注</th>
    </tr>
    </thead>
</table>

<div id="tb3" style="padding:3px">
    <div>
        <span>员工编号:</span>
        <input id="empid3" style="line-height:26px;border:1px solid #ccc">
        <span>员工姓名:</span>
        <input id="empname3" style="line-height:26px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch3()">查找</a>
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="updateE3()">编辑员工</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser3()">删除员工</a>
    </div>
</div>


<div id="dlg3" class="easyui-dialog" style="width:400px;height:500px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons3">
    <div class="ftitle">员工信息修改：</div>
    <form id="fm3" method="post">
        <table>
            <tr>
                <td>
                    <label>员工编号:</label>
                </td>
                <td>
                    <input name="empid"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>姓名:</label>
                </td>
                <td>
                    <input name="empname"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>手机号:</label>
                </td>
                <td>
                    <input name="empphone"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>状态:</label>
                </td>
                <td>
                    <select class="easyui-combobox" id="empstate3" name="empstate" style="width:200px;" panelHeight="auto"
                            editable="false">
                        <option value="1">正常</option>
                        <option value="2">离职</option>
                        <option value="3">请假</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>职位：</td>
                <td>
                    <select class="easyui-combobox" id="roleid3" name="roleid" style="width:200px;" panelHeight="auto"
                            editable="false" url="/getAllRoles" valueField="roleid" textField="rolename">
                    </select>
                </td>
            </tr>
            <tr>
                <td>备注：</td>
                <td>
                    <textarea name="empdesc" id="empdesc3" cols="30" rows="10" class="text-area"></textarea>
                </td>
            </tr>

        </table>
    </form>
</div>

<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser3()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg3').dialog('close')">取消</a>
</div>


<script>

    var url;

    function doSearch3() {
        $('#tt3').datagrid('load', {
            empid: $('#empid3').val(),
            empname: $('#empname3').val(),
        });
    }

    function updateE3(){
        var row = $('#tt3').datagrid('getSelected');
        if (row){
            $('#dlg3').dialog('open').dialog('setTitle','修改员工信息');
            $('#fm3').form('load',row);
            url3 = '/changeEmployee';
        }
    }

    function saveUser3(){
        $('#fm3').form('submit',{
            url: url3,
            onSubmit: function(){
                return $('#fm3').form('validate');
            },
            success: function(result){
                var result = eval('('+result+')');
                if (result.errorMsg){
                    $.messager.show({
                        title: 'Error',
                        msg: result.errorMsg
                    });
                } else {
                    $('#dlg3').dialog('close');		// close the dialog
                    $('#tt3').datagrid('reload');	// reload the user data
                }
            }
        });
    }

    function destroyUser3(){
        var row = $('#tt3').datagrid('getSelected');
        if (row){
            $.messager.confirm('Confirm','你确定删除这个员工信息?',function(r){
                if (r){
                    $.post('/deleteE',{empid:row.empid},function(result){
                        if (result.success){
                            $('#tt3').datagrid('reload');	// reload the user data
                        } else {
                            $.messager.show({	// show error message
                                title: 'Error',
                                msg: result.errorMsg
                            });
                        }
                    },'json');
                }
            });
        }
    }


</script>
</body>
</html>
