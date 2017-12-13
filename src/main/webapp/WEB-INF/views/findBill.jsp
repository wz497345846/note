<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/11
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" charset="utf-8">
    function doSearch(){
        var obj3  = $("#tta").datagrid("getSelections");
        if(obj3 == null || obj3.length != 1){
            $.messager.alert('提示','选择数据不合法');
        }else{
        $.get("bill/findById",{"billid":obj3[0].billid},function(data){
            if(data.state == 200){
                $.messager.alert('提示',getData());
            }else{
                $.messager.alert('提示','6666');
            }
        });
        }
    }
</script>
<div>
    <form id="serach-form" method="get">
    <span>账单ID:</span>
    <input  class="easyui-textbox" type="text" name="billid" style="line-height:26px;border:1px solid #ccc">
        <input type="button" class="easyui-linkbutton" value="查找" iconCls="icon-search" onclick="doSearch()">
    </form>
</div>
<table id="ta" class="easyui-datagrid" data-options="rownumbers:true,pageSize:10,pagination:true,url:'bill/findAllBill'">
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

