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
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<body>
<div id="mm" class="easyui-menu" style="width:120px;">
    <div>New</div>
    <div>
        <span>Open</span>
        <div style="width:150px;">
            <div><b>Word</b></div>
            <div>Excel</div>
            <div>PowerPoint</div>
        </div>
    </div>
    <div data-options="iconCls:'icon-save'">Save</div>
    <div class="menu-sep"></div>
    <div>Exit</div>
</div>
<form id="ff" method="post">
  <table>
      <tr>
          <td>课程名：</td>
          <td><input type="text" name="coursename" data-options="required:true,validType:'email'" />
          </td>
      </tr>
      <tr>
          <td>教练：</td>
          <td><input  class="easyui-combobox" name="empid"
                     data-options="valueField:'id',textField:'text',url:'get_data.php'" />   </td>
      </tr>
      <tr>
          <td></td>
          <td><button>添加</button></td>
      </tr>
  </table>
</form>
</body>
</html>
