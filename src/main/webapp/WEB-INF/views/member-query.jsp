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
        <th field="memberbirth" width="60" formatter="DateTimeFormatter" name="memberbirth">生日</th>
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
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新建用户</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑用户</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除用户</a>
    </div>
</div>


<div id="dlg" class="easyui-dialog" style="width:400px;height:500px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">
    <div class="ftitle">用户信息：</div>
    <form id="fm" method="post">
        <table>
            <tr>
                <td>
                    <label>姓名:</label>
                </td>
                <td>
                    <input name="membername"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>手机号:</label>
                </td>
                <td>
                    <input name="memberphone" class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>性别:</label>
                </td>
                <td>
                    男：<input name="membersex" value="男" type="radio">
                    女：<input name="membersex" value="女" type="radio">
                </td>
            </tr>
            <tr>
                <td>
                    <label>生日:</label>

                </td>
                <td>
                    <input type="text" class="easyui-datebox" formatter="DateTimeFormatter"  name="memberbirth">

                </td>
            </tr>

            <tr>
                <td>
                    <label>推荐人:</label>
                </td>
                <td>
                    <input name="referee" class="easyui-validatebox">
                </td>
            </tr>

            <tr>
                <td>
                    <label>会员标注:</label>
                </td>
                <td>
                    <input name="memberremark" class="easyui-validatebox">
                </td>
            </tr>
            <tr>
                <td>
                    <label>备注:</label>

                </td>
                <td>
                    <input name="memberdesc" class="easyui-validatebox">

                </td>
            </tr>

        </table>
    </form>
</div>

<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
</div>
<script>

    var url;

    function doSearch() {
        $('#tt').datagrid('load', {
            membername: $('#membername').val(),
            memberphone: $('#memberphone').val()
        });
    }

    function newUser(){
        $('#dlg').dialog('open').dialog('setTitle','新建用户');
        $('#fm').form('clear');
        url = '/createMember';
    }


    function editUser() {
        var row = $('#tt').datagrid('getSelected');
        if (row){
            $('#dlg').dialog('open').dialog('setTitle','修改用户');
            $('#fm').form('load',row);
            url = '/updateMember?id='+row.memberid;
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
                    $.post('/delMember',{id:row.memberid},function(result){
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




    function DateTimeFormatter(value) {
        var date = new Date(value);
        var year = date.getFullYear().toString();
        var month = (date.getMonth() + 1);
        var day = date.getDate().toString();
        var hour = date.getHours().toString();
        var minutes = date.getMinutes().toString();
        var seconds = date.getSeconds().toString();
        if (month < 10) {
            month = "0" + month;
        }
        if (day < 10) {
            day = "0" + day;
        }
        if (hour < 10) {
            hour = "0" + hour;
        }
        if (minutes < 10) {
            minutes = "0" + minutes;
        }
        if (seconds < 10) {
            seconds = "0" + seconds;
        }
        return year + "-" + month + "-" + day + " " + hour + ":" + minutes + ":" + seconds;
    }

    $.fn.datebox.defaults.parser = function(s){
        var t = Date.parse(s);
        if (!isNaN(t)){
            return new Date(t);
        } else {
            return new Date();
        }
    }
</script>
</body>
</html>
