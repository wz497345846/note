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
<div style="height: 800px">
    <table id="coursegrid" class="easyui-datagrid">
        <thead>
        <tr>

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
</div>
<div style="display: none">
    <div id="modify">
        <form id="modifycourse" onsubmit="return false;">
            <table>
                <tr>
                    <td><span class="reds">*</span>课程编号：</td>
                    <td><input type="text" name="courseid" data-options="required:true" id="modifycourseid1"/>
                    </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程名：</td>
                    <td><input type="text" name="coursename" data-options="required:true" />
                    </td>
                </tr>
                <tr>
                    <td><span class="reds"></span>课程类型：</td>
                    <td><input class="easyui-combobox" name="coursetype" data-options="valueField:'id',textField:'text',url:'/ctype',required:true"/></td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>教练：</td>
                    <td><input  class="easyui-combobox" name="empid"
                                data-options="valueField:'id',textField:'text',url:'/courseemp',required:true" />   </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程费用:</td>
                    <td><input name="coursefee" class="easyui-textbox" data-options="min:0,max:9999,required:true"></td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>当前人数：</td>
                    <td>
                        <input type="text" name="currentnum"  /> </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程最大人数：</td>
                    <td>
                        <input class="easyui-textbox" name="coursecount" data-options="min:0,max:200,required:true"/>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程开始时间：</td>
                    <td><input type="text" name="curriculumstart" class="easyui-datebox" required="required"/> </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程结束时间：</td>
                    <td><input type="text" name="curriculumend" class="easyui-datebox" required="required"/> </td>
                </tr>
                <tr>
                    <td>课程简介：</td>
                    <td>   <textarea name="coursedesc" cols="30" rows="4">

                </textarea>  </td>
                </tr>
            </table>
        </form>
        <hr/>
        <form id="modifycourseplan" onsubmit="return false;">
            <table>
                <tr>
                    <td> <span class="label label-success">星期一</span>&nbsp;&nbsp;</td>

                    <td>
                        <input id="modifycourseid2" type="hidden" name="courseid" />
                        上课：<input id="mon" type=text name="mons"  class="easyui-timespinner"  style="width:80px;"  data-options="showSeconds:false" />
                        下课：<input type=text name="mone" class="easyui-timespinner"  style="width:80px;"  data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期二</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="tues"  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="tued" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期三</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="weds" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="wede" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期四</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="thurs" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="thure" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期五</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="fris" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="frie" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期六</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="sats" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="sate" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期日</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input name="suns" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input name="sune" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td></td>
                </tr>

                <tr>
                    <td></td>
                    <td><button class="btn btn-primary" id="modifybut" onclick="modify()">修改</button></td>
                </tr>
            </table>
        </form>
    </div>
    <div id="showc">
        <form id="showcourse" onsubmit="return false;">
            <table>
                <tr>
                    <td><span class="reds">*</span>课程编号：</td>
                    <td><input type="text" name="courseid" data-options="required:true" id="" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程名：</td>
                    <td><input type="text" name="coursename" data-options="required:true" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td><span class="reds"></span>课程类型：</td>
                    <td><input class="easyui-combobox" name="coursetype" readonly="true" data-options="valueField:'id',textField:'text',url:'/ctype',required:true"/></td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>教练：</td>
                    <td><input  class="easyui-combobox" name="empid" readonly="true"
                                data-options="valueField:'id',textField:'text',url:'/courseemp',required:true" />   </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程费用:</td>
                    <td><input readonly="true" name="coursefee" class="easyui-textbox" data-options="min:0,max:9999,required:true"></td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>当前人数：</td>
                    <td>
                        <input readonly="true" type="text" name="currentnum"  /> </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程最大人数：</td>
                    <td>
                        <input readonly="true" class="easyui-textbox" name="coursecount" data-options="min:0,max:200,required:true"/>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程开始时间：</td>
                    <td><input readonly="true" type="text" name="curriculumstart" class="easyui-datebox" required="required"/> </td>
                </tr>
                <tr>
                    <td><span class="reds">*</span>课程结束时间：</td>
                    <td><input readonly="true" type="text" name="curriculumend" class="easyui-datebox" required="required"/> </td>
                </tr>
                <tr>
                    <td>课程简介：</td>
                    <td>   <textarea readonly="true" name="coursedesc" cols="30" rows="4">

                </textarea>  </td>
                </tr>
            </table>
        </form>
        <hr/>
        <form id="showcourseplan" onsubmit="return false;">
            <table>
                <tr>
                    <td> <span class="label label-success">星期一</span>&nbsp;&nbsp;</td>

                    <td>
                        <input id="" type="hidden" name="courseid" />
                        上课：<input readonly="true" id="" type=text name="mons"  class="easyui-timespinner"  style="width:80px;"  data-options="showSeconds:false" />
                        下课：<input readonly="true" type=text name="mone" class="easyui-timespinner"  style="width:80px;"  data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期二</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="tues"  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="tued" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期三</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="weds" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="wede" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期四</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="thurs" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="thure" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期五</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="fris" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="frie" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期六</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="sats" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="sate" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td><span class="label label-success">星期日</span>&nbsp;&nbsp;</td>
                    <td>
                        上课：<input readonly="true" name="suns" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                        下课：<input readonly="true" name="sune" class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td></td>
                </tr>

                <tr>
                    <td></td>
                </tr>
            </table>
        </form>
    </div>
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
