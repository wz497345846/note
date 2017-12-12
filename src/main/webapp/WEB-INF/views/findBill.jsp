<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/11
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table id="ta" class="easyui-datagrid" data-options="pageSize:30,toolbar:tool,pagination:true,url:'bill/findAllBill'>
    <thead>
    <tr>
       <th data-options="field:'billid',width:60">账单ID</th>
        <th data-options="field:'empid',width:60">记账人</th>
        <th data-options="field:'cost'">消费总额</th>
        <th data-options="field:'paytype'">支付类型</th>
        <th data-options="field:'createtime'">创建时间</th>
        <th data-options="field:'billdesc'">备注</th>
    </tr>
    </thead>
</table>
