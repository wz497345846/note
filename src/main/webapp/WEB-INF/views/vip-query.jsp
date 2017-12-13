<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-13
  Time: 下午2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员类型查询</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>
<table id="tta" class="easyui-datagrid" style="width:100%;height:100%"
       url="/getMemberTypes" toolbar="#tba"
       title="会员卡信息" iconCls="icon-save"
       buttons="#dlg-buttonsa"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="membertypeId" width="80">#</th>
        <th field="membertypeName" width="80">会员卡类型</th>
        <th field="membertypeCost" width="80" align="right">会员卡价格</th>
        <th field="monthTime" width="80" align="right">会员时长（月）</th>
    </tr>
    </thead>
</table>

<div id="tba" style="padding:3px">
    <div>
        <span>会员卡类型:</span>
        <input id="membertypeNamea" style="line-height:26px;border:1px solid #ccc">
        <span>会员时长（月）:</span>
        <input id="monthTimea" style="line-height:26px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearcha()">Search</a>
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUsera()">新建会员卡</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUsera()">编辑会员卡</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUsera()">删除会员卡</a>
    </div>
</div>


<div id="dlga" class="easyui-dialog" style="width:400px;height:500px;padding:10px 20px"
     closed="true" buttons="#dlg-buttonsa">
    <div class="ftitle">用户信息：</div>
    <form id="fma" method="post">
        <table>
            <tr>
                <td>
                    <label>会员卡类型:</label>
                </td>
                <td>
                    <input name="membertypeName"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>会员卡价格:</label>
                </td>
                <td>
                    <input name="membertypeCost"  class="easyui-validatebox" required="true">
                </td>
            </tr>


            <tr>
                <td>
                    <label>会员时长（月）:</label>
                </td>
                <td>
                    <input name="monthTime" class="easyui-validatebox" required="true">
                </td>
            </tr>

        </table>
    </form>
</div>

<div id="dlg-buttonsa">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUsera()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlga').dialog('close')">取消</a>
</div>

<script>

    var urla;

    function doSearcha() {
        $('#tta').datagrid('load', {
            membertypeName: $('#membertypeNamea').val(),
            monthTime: $('#monthTimea').val()
        });
    }

    function newUsera(){
        $('#dlga').dialog('open').dialog('setTitle','新建会员卡信息');
        $('#fma').form('clear');
        urla = '/createMemberType';
    }


    function editUsera() {
        var row = $('#tta').datagrid('getSelected');
        if (row){
            $('#dlga').dialog('open').dialog('setTitle','修改会员卡信息');
            $('#fma').form('load',row);
            urla = '/updateMemberType?id='+row.membertypeId;
        }
    }

    function saveUsera(){
        $('#fma').form('submit',{
            url: urla,
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
                    $('#dlga').dialog('close');		// close the dialog
                    $('#tta').datagrid('reload');	// reload the user data
                }
            }
        });
    }

    function destroyUsera(){
        var row = $('#tta').datagrid('getSelected');
        if (row){
            $.messager.confirm('Confirm','你确定删除这个会员卡类型?',function(r){
                if (r){
                    $.post('/delMemberType',{id:row.membertypeId},function(result){
                        if (result.success){
                            $('#tta').datagrid('reload');	// reload the user data
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
        return year + "/" + month + "/" + day;
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