<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-12
  Time: 下午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<table id="ttb" class="easyui-datagrid" style="width:100%;height:100%"
       url="/getMembers" toolbar="#tbb"
       title="会员信息" iconCls="icon-save"
       buttons="#dlg-buttons"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="memberid" width="80">#</th>
        <th field="membername" width="80">姓名</th>
        <th field="memberphone" width="80" align="right">手机号</th>
        <th field="membersex" width="80" align="right">性别</th>
        <th field="memberbirth" width="120" formatter="DateTimeFormatter" name="memberbirth">生日</th>
        <th field="referee" width="60" align="center">推荐人</th>
        <th field="memberremark" width="60" align="center">会员标记</th>
        <th field="memberdesc" width="150" align="center">备注</th>
    </tr>
    </thead>
</table>

<div id="tbb" style="padding:3px">
    <div>
        <span>姓名:</span>
        <input id="membernameb" style="line-height:26px;border:1px solid #ccc">
        <span>手机号:</span>
        <input id="memberphoneb" style="line-height:26px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearchb()">Search</a>
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUserb()">新建用户</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUserb()">编辑用户</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUserb()">删除用户</a>
    </div>
</div>


<div id="dlgb" class="easyui-dialog" style="width:400px;height:500px;padding:10px 20px"
     closed="true" buttons="#dlg-buttonsb">
    <div class="ftitle">用户信息：</div>
    <form id="fmm" method="post">
        <table>
            <tr>
                <td>
                    <label>姓名:</label>
                </td>
                <td>
                    <input name="membername" class="easyui-validatebox" required="true">
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
                    <input type="text" class="easyui-datebox" formatter="DateTimeFormatter" name="memberbirth">

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
                    <label>备注:</label>

                </td>
                <td>
                    <input name="memberdesc" class="easyui-validatebox">
                </td>
            </tr>

        </table>
    </form>
</div>

<div id="dlg-buttonsb">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUserb()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgb').dialog('close')">取消</a>
</div>
<script>
    var urlb;

    function doSearchb() {
        $('#ttb').datagrid('load', {
            membername: $('#membernameb').val(),
            memberphone: $('#memberphoneb').val()
        });
    }

    function newUserb() {
        $('#dlgb').dialog('open').dialog('setTitle', '新建用户');
        $('#fmm').form('clear');
        urlb = '/createMember';
    }


    function editUserb() {

        var row = $('#ttb').datagrid('getSelected');
        if (row) {
            $('#dlgb').dialog('open').dialog('setTitle', '修改用户');
            $('#fmm').form('load', row);
            urlb = '/updateMember';
        }
    }

    function saveUserb() {
        $('#fmm').form('submit', {
            url: urlb,
            onSubmit: function () {
                return $('#fmm').form('validate');
            },
            success: function (result) {
                var result = eval('(' + result + ')');
                if (result.errorMsg) {
                    $.messager.show({
                        title: 'Error',
                        msg: result.errorMsg
                    });
                } else {
                    $('#dlgb').dialog('close');		// close the dialog
                    $('#ttb').datagrid('reload');	// reload the user data
                }
            }
        });
    }

    function destroyUserb() {
        var row = $('#ttb').datagrid('getSelected');
        if (row) {
            $.messager.confirm('Confirm', '你确定删除这个会员?', function (r) {
                if (r) {
                    $.post('/delMember', {id: row.memberid}, function (result) {
                        if (result.success) {
                            $('#ttb').datagrid('reload');	// reload the user data
                        } else {
                            $.messager.show({	// show error message
                                title: 'Error',
                                msg: result.errorMsg
                            });
                        }
                    }, 'json');
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
        return year + "/" + month + "/" + day;
    }

    $.fn.datebox.defaults.parser = function (s) {
        var t = Date.parse(s);
        if (!isNaN(t)) {
            return new Date(t);
        } else {
            return new Date();
        }
    }
</script>
