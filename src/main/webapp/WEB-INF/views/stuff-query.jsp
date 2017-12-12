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
    <script>

        function pagerFilter(data){
            debugger;
            if (typeof data.pageListdata.length == 'number' && typeof data.pageListdata.splice == 'function'){// is array
                data = {
                    total: data.pageListdata.length,
                    rows: data.pageListdata
                }
            }
            var dg = $('#dataGrid');
            var opts = dg.datagrid('options');
            var pager = $('#dataGrid').datagrid('getPager');
            $(pager).pagination({
                onSelectPage:function(pageNum, pageSize){
                    opts.pageNumber = pageNum;
                    opts.pageSize = pageSize;
                    pager.pagination('refresh',{
                        pageNumber:pageNum,
                        pageSize:pageSize
                    });
                    $('#dataGrid').datagrid('loadData',data);
                },
                beforePageText : '第', //页数文本框前显示的汉字
                afterPageText : '页    共 {pages} 页',
                displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
            });
            if (!data.pageListdata){
                data.pageListdata = (data.rows);
            }
            var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = (data.pageListdata.slice(start, end));
            return data;
        }


        function Search() {
            //pageNumber为datagrid的当前页码
            var page_Number = $('#dataGrid').datagrid('options').pageNumber;
            //pageSize为datagrid的每页记录条数
            var page_Size = $('#dataGrid').datagrid('options').pageSize;
            var path = $("#query-employee").attr("action");
            $.ajax({
                url : path,
                type : "post",
                data : {
                    empname:$("#empname").val(),
                    empstate:$("#empstate").combobox('getValue'),
                    roleid:$("#roleid").combobox('getValue'),
                    pageNumber : page_Number,
                    pageSize : page_Size
                },
                dataType : "json",
                success : function(datas) {
                    $('#dataGrid').datagrid({loadFilter:pagerFilter}).datagrid('loadData',datas);
                }
            });
            return false;
        }
    </script>
</head>
<body>

<form id="query-employee"  onsubmit="return false;" action="/selectEmployee">
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
        <input type="submit" value="查询" class="s-btn" onclick="return Search();">
    </div>
</form>

<div style="clear: both"></div>

<table id="dataGrid" class="easyui-datagrid" title="员工基本信息"  data-options="rownumbers:true,
    singleSelect:true,
    autoRowHeight:true,
    pagination:true,
    pageSize:10,fit:false"
    >
    <thead>
    <tr>
        <th field="empid" width="200" align="center">#</th>
        <th field="empname" width="200" align="center">姓名</th>
        <th field="empphone" width="200" align="center">手机号</th>
        <th field="empsex" width="200" align="center">性别</th>
        <th field="empstate" width="200" align="center">状态</th>
        <th field="roleid" width="200" align="center">角色</th>
        <th field="empdesc" width="200" align="center">备注</th>
        <th field="oper" width="200" align="center">操作</th>
    </tr>
    </thead>
</table>

</body>
</html>
