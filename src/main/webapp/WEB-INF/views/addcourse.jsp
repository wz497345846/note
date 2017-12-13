<%--
  Created by IntelliJ IDEA.
  User: gabriel
  Date: 2017-12-11
  Time: 10:02
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
<style>
    .reds{
        color: red;
    }
</style>
<body>--%>

<form id="course" onsubmit="return false;">
  <table>
      <tr>
          <td><span class="reds">*</span>课程编号：</td>
          <td><input type="text" name="courseid" data-options="required:true" id="courseid1"/>
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
          <td><span class="reds">*</span>课程最大人数：</td>
          <td>
              <input class="easyui-textbox" name="coursecount" data-options="min:0,max:200,required:true"/>
              <input type="hidden" name="currentnum" value="0" /> </td>
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
<form id="courseplan" onsubmit="return false;">
    <table>
        <tr>
            <td> <span class="label label-success">星期一</span>&nbsp;&nbsp;</td>

            <td>
                <input id="courseid2" type="hidden" name="courseid" />
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
    <td><button onclick="add()">添加</button></td>
</tr>
</table>
</form>
<%--
</body>
<script>
    function add() {
        var course=$("#course").serialize();
        $.ajax({
            type:"post",
            url:"/addc",
            data:$("#course").serialize(),
            dataType:"text",
            success:function (data) {
                if(data=='1'){
                    $('#courseid2').val($('#courseid1').val());
                    $.ajax({
                        type:"post",
                        url:"/addcourseplan",
                        data:$("#courseplan").serialize(),
                        dateType:"text",
                        success:function (data) {
                            if(data=='1'){
                                alert("添加成功");
                                $("#course")[0].reset();
                                $("#courseplan")[0].reset();
                            }else{
                                alert("添加失败")
                            }
                        }
                    })
                }else{
                    alert("添加失败");
                }
            }
            });

    }
</script>
</html>
--%>
