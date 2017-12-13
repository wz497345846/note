<%--
  Created by IntelliJ IDEA.
  User: gabriel
  Date: 2017-12-12
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<body>--%>

    <table id="coursegrid" class="easyui-datagrid">
        <thead>
        <tr>
            <th data-options="filed:'ck',checkbox:true"></th>
            <th data-options="field:'courseid',width:100">课程ID</th>
            <th data-options="field:'empid',width:100">教练编号</th>
            <th data-options="field:'coursename',width:100,align:'right'">课程名</th>
            <th data-options="field:'coursetype',width:100">课程类型</th>
            <th data-options="field:'coursefee',width:100">费用（元）</th>
            <th data-options="field:'currentnum',width:100">当前人数</th>
            <th data-options="field:'curriculumstart',width:100,sortable:true" >开课时间</th>
            <th data-options="field:'curriculumend',width:100">课程结束时间</th>
            <th data-options="field:'coursedesc',width:100">简介</th>
        </tr>
        </thead>
     <%--   <tbody>
        <tr>
            <td>1</td>
            <td>1</td>
            <td>10</td>
        </tr>
        </tbody>--%>
    </table>

    <div id="modify">
        Window Content
    </div>
    <div id="add">
        Window Content
    </div>

<script>
    $(function () {
        showcourseonload();
    });

</script>
<%--</body>
<script>
    $('#coursegrid').datagrid({
        title:'健生房课程',
        iconCls:'icon-edit',//图标
        width: 700,
        height: 'auto',
        nowrap: false,
        striped: true,
        border: true,
        collapsible:false,//是否可折叠的
        fit: true,//自动大小
        url:'/allcourse',
        //sortName: 'code',
        //sortOrder: 'desc',
        remoteSort:false,
        idField:'fldId',
        singleSelect:false,//是否单选
        pagination:true,//分页控件
        rownumbers:true,//行号
        frozenColumns:[[
            {field:'ck',checkbox:true}
        ]],
        toolbar: [{
            text: '添加',
            iconCls: 'icon-add',
            handler: function(id) {
                $('#modify').window({
                    width:600,
                    height:400,
                    modal:true,
                    href:"/addcourse"
                });
            }
        }, '-', {
            text: '修改',
            iconCls: 'icon-edit',
            handler: function() {
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $('#modify').window({
                        width:600,
                        height:400,
                        modal:true
                    });

//                    $.ajax({
//                        type:'post',
//                        data:{"id":obj[0].courseid},
//                        url:'',
//                        success:function (data) {
//                            if(data=="1"){
//
//                            }
//                        }
//                    })
                }
            }
        }, '-',{
            text: '删除',
            iconCls: 'icon-remove',
            handler: function(){
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $.ajax({
                        type:'post',
                        data:{"id":obj[0].courseid},
                        url:'/delcourse',
                        success:function (data) {
                            if(data=="1"){
                                $.messager.alert("提示","删除成功")
                                $("#coursegrid").datagrid("reload");
                            }
                        }
                    })
                }
            }
        }],
    });
    //设置分页控件
    var p = $('#coursegrid').datagrid('getPager');
    $(p).pagination({
        pageSize: 10,//每页显示的记录条数，默认为10
        pageList: [5,10,15],//可以设置每页记录条数的列表
        beforePageText: '第',//页数文本框前显示的汉字
        afterPageText: '页    共 {pages} 页',
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
        onBeforeRefresh:function(){
            $(this).pagination('loading');
            alert('before refresh');
            $(this).pagination('loaded');
        }
    });

</script>
</html>--%>
