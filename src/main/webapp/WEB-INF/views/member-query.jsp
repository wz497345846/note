<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-12
  Time: 下午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员查询</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>

<table id="tt" class="easyui-datagrid" style="width:100%;height:100%"
       url="/getMembers" toolbar="#tb"
       title="会员信息" iconCls="icon-save"
       buttons="#dlg-buttons"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="memberid" width="80">#</th>
        <th field="membername" width="80">姓名</th>
        <th field="memberphone" width="80" align="right">手机号</th>
        <th field="membersex" width="80" align="right">性别</th>
        <th field="memberbirth" width="60">生日</th>
        <th field="referee" width="60" align="center">推荐人</th>
        <th field="memberremark" width="60" align="center">会员标记</th>
        <th field="memberdesc" width="150" align="center">备注</th>
    </tr>
    </thead>
</table>

<div id="tb" style="padding:3px">
        <div>
            <span>姓名:</span>
            <input id="membername" style="line-height:26px;border:1px solid #ccc">
            <span>手机号:</span>
            <input id="memberphone" style="line-height:26px;border:1px solid #ccc">
            <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
        </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
    </div>
</div>


<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">
    <div class="ftitle">用户信息：</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名:</label>
            <input name="membername" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>手机号:</label>
            <input name="memberphone" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>membersex:</label>
            男：<input name="membersex" value="男" type="radio">
            女：<input name="membersex" value="女" type="radio">
        </div>
        <div class="fitem">
            <label>生日:</label>
            <input id="memberbirth" type="text" class="easyui-datebox" required="required" name="memberbirth">
        </div>
        <div class="fitem">
            <label>推荐人:</label>
            <input name="referee" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>会员标注:</label>
            <input name="memberremark" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>备注:</label>
            <input name="memberdesc" class="easyui-validatebox" required="true">
        </div>
    </form>
</div>

<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">Save</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>

<script>
    function doSearch() {
        $('#tt').datagrid('load', {
            membername: $('#membername').val(),
            memberphone: $('#memberphone').val()
        });
    }

    function newUser(){
        $('#dlg').dialog('open').dialog('setTitle','新建用户');
        $('#fm').form('clear');
        url = 'createMember';
    }


    function editUser() {
        alert("1")
        var row = $('#tt').datagrid('getSelected');
        if (row){
            $('#dlg').dialog('open').dialog('setTitle','Edit User');
            $('#fm').form('load',row);
            url = 'updateMember?id='+row.id;
        }
    }

    function saveUser(){
        $('#fm').form('submit',{
            url: url,
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                var result = eval('('+result+')');
                if (result.errorMsg){
                    $.messager.show({
                        title: 'Error',
                        msg: result.errorMsg
                    });
                } else {
                    $('#dlg').dialog('close');		// close the dialog
                    $('#tt').datagrid('reload');	// reload the user data
                }
            }
        });
    }

    function destroyUser(){
        var row = $('#tt').datagrid('getSelected');
        if (row){
            $.messager.confirm('Confirm','你确定删除这个会员?',function(r){
                if (r){
                    $.post('delMember',{id:row.id},function(result){
                        if (result.success){
                            $('#tt').datagrid('reload');	// reload the user data
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
