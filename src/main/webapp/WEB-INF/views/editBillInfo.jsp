<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<script>
    $(function(){
        var obj  = $("#ta").datagrid("getSelections");
        $("#modifyBillInfo").form("load",{
            billid:obj[0].billid,
            empid:obj[0].empid,
            cost:obj[0].cost,
            paytype:obj[0].paytype,
            createtime:obj[0].createtime,
            billdesc:obj[0].billdesc
        })
    });

    function subform(){
        $.post("bill/editbf",$("#modifyBillInfo").serialize(),function(data){
            if(data.state == 200){
                $.messager.alert('提示','修改成功');
                $("#modifyBillInfo").form("reset");
                $("#e").window("close");
                $("#ta").datagrid("reload");
            }else{
                $.messager.alert('提示','修改失败');
            }
        });
    }
</script>
<form id="modifyBillInfo">
    <table align="center" width="60%" >
        <tr >
            <td>账单ID</td>
            <td >
                <input  class="easyui-textbox" type="text" name="billid" data-options="required:true">
            </td>
        </tr>
        <tr>
            <td>记账人ID</td>
            <td>
                <input class="easyui-textbox" type="text"  name="empid" data-options="required:true">
            </td>
        </tr>
        <tr>
            <td>消费总额</td>
            <td>
                <input class="easyui-textbox" type="text" name="cost" data-options="required:true">
            </td>
        </tr>
        <tr>
            <td>支付类型</td>
            <td style="width: 141px">
                <select class="easyui-combobox" name="paytype">
                    <option value=""></option>
                    <option value="0">现金</option>
                    <option value="1">支付宝</option>
                    <option value="2">微信</option>
                    <option value="3">刷卡</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>备注</td>
            <td>
                <input class="easyui-textbox" name="billdesc" data-options="multiline:true" style="height:60px">
            </td>
        </tr>
        <tr>
            <td colspan="2" >
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="subform()" data-options="iconCls:'icon-add'">提交</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentPage.clearForm()">重置</a>
            </td>

        </tr>
    </table>
</form>