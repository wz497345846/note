<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 17-12-13
  Time: 下午4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员课程查询</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/demo/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
</head>
<body>
<table id="tt2" class="easyui-datagrid" style="width:100%;height:100%"
       url="/getUserCourse" toolbar="#tb2"
       title="会员选课信息" iconCls="icon-save"
       buttons="#dlg-buttons2"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="courseid" width="80">#</th>
        <th field="coursename" width="80">课程名</th>
        <th field="coursetype" width="80" align="right">课程类型</th>
        <th field="empid" width="80" align="right">教练</th>
        <th field="currentnum" width="80" align="right">课程时费</th>
        <th field="coursecount" width="80" align="right">最多人数</th>
        <th field="curriculumstart" width="80" align="right">开始时间</th>
        <th field="curriculumend" width="80" align="right">结束时间</th>
    </tr>
    </thead>
</table>

<div id="tb2" style="padding:3px">
    <div>
        <span>会员编号:</span>
        <input id="memberid2" style="line-height:26px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch2()">Search</a>
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser2()">新建选课</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser2()">删除选课</a>
    </div>
</div>


<div id="dlg2" class="easyui-dialog" style="width:400px;height:500px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons2">
    <div class="ftitle">添加课程：</div>
    <form id="fm2" method="post">
        <table>
            <tr>
                <td>
                    <label>会员编号:</label>
                </td>
                <td>
                    <input name="memberid"  class="easyui-validatebox" required="true">
                </td>
            </tr>
            <tr>
                <td>
                    <label>课程编号:</label>
                </td>
                <td>
                    <input name="courseid"  class="easyui-validatebox" required="true">
                </td>
            </tr>
        </table>
    </form>
</div>

<div id="dlg-buttons2">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser2()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg2').dialog('close')">取消</a>
</div>


<script>

    var url2;

    function doSearch2() {
        $('#tt2').datagrid('load', {
            memberid: $('#memberid2').val(),
        });
    }

    function newUser2(){
        $('#dlg2').dialog('open').dialog('setTitle','新建选课信息');
        $('#fm2').form('clear');
        url2 = '/createUserCourse';
    }



    function saveUser2(){
        $('#fm2').form('submit',{
            url: url2,
            onSubmit: function(){
                return $('#fm2').form('validate');
            },
            success: function(result){
                var result = eval('('+result+')');
                if (result.errorMsg){
                    $.messager.show({
                        title: 'Error',
                        msg: result.errorMsg
                    });
                } else {
                    $('#dlg2').dialog('close');		// close the dialog
                    $('#tt2').datagrid('reload');	// reload the user data
                }
            }
        });
    }

    function destroyUser2(){
        var row = $('#tt2').datagrid('getSelected');
        if (row){
            $.messager.confirm('Confirm','你确定删除这个选课信息?',function(r){
                if (r){
                    $.post('/delUserCourse',{memberid:$("#memberid2").val(),courseid:row.courseid},function(result){
                        if (result.success){
                            $('#tt2').datagrid('reload');	// reload the user data
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
