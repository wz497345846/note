<%--
  Created by IntelliJ IDEA.
  User: gabriel
  Date: 2017-12-11
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
<body>

<form id="course" method="post" action="/addc">
  <table>
      <tr>
          <td><span class="reds">*</span>课程名：</td>
          <td><input type="text" name="coursename" data-options="required:true,validType:'email',required:true" />
          </td>
      </tr>
      <tr>
          <td><span class="reds"></span>课程类型：</td>
          <td><input class="easyui-combobox" name="coursetype" data-options="valueField:'id',textField:'text',url:'get_data.php',required:true"/></td>
      </tr>
      <tr>
          <td><span class="reds">*</span>教练：</td>
          <td><input  class="easyui-combobox" name="empid"
                     data-options="valueField:'id',textField:'text',url:'get_data.php',required:true" />   </td>
      </tr>
      <tr>
          <td><span class="reds">*</span>课程费用:</td>
          <td><input name="coursefee" class="easyui-textbox" data-options="min:0,max:9999,required:true"></td>
      </tr>
      <tr>
          <td><span class="reds">*</span>课程最大人数：</td>
          <td><input class="easyui-textbox" name="coursecount" data-options="min:0,max:200,required:true"/> </td>
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

    <table><form id="courseplan">
        <tr>
            <td> <span class="label label-success">星期一</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期二</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期三</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期四</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期五</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期六</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>
        <tr>
            <td><span class="label label-success">星期日</span>&nbsp;&nbsp;</td>
            <td>
                上课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
                下课：<input  class="easyui-timespinner"  style="width:80px;" required="required" data-options="showSeconds:false" />
            </td>
        </tr>

</form>
        <tr>
            <td>&nbsp;</td>
            <td></td>
        </tr>

<tr>
    <td></td>
    <td><button onclick="add()">添加</button></td>
</tr>
</table>
</body>
<script>
    function add() {
        var course=$("#course").serialize();
        alert(course);

        $.ajax({
            type:"post",
            url:"/addc",
            data:$("#course").serialize(),
            dataType:"text",
            success:function (data) {
                alert(data);
            }
            });

    }
</script>
</html>
