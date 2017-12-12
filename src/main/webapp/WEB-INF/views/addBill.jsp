<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<script>

    var contentPage = {
        submitForm:function(){

            if(!$('#myForm').form('validate')){
                $.messager.alert('提示','信息不完整');
                return ;
            }else{
                $.post("bill/addBill",$("#myForm").serialize(),function(data){
                    if(data.state == 200){
                        $.messager.alert('提示','添加成功');
                        $("#myForm").form("reset");
                        $("#d").window("close");
                        $("#ta").datagrid("reload");
                    }else{
                        $.messager.alert('提示','添加失败');
                    }
                });

            }

        },
        clearForm:function(){
            $('#myForm').form('clear');
        }
    };

</script>
<form id="myForm">
    <table align="center" width="60%" >
        <tr >
            <td>账单ID</td>
            <td>
                <input class="easyui-textbox" type="text" name="billid" data-options="required:true">
            </td>
        </tr>
        <tr>
            <td>记账人编号</td>
            <td>
                <input class="easyui-textbox" type="text" name="empid" data-options="required:true">
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
                <input class="easyui-textbox"  name="cost" data-options="multiline:true" style="height:60px">
            </td>
        </tr>
        <tr>
            <td colspan="2" >
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentPage.submitForm()" data-options="iconCls:'icon-add'">提交</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentPage.clearForm()">重置</a>
            </td>
        </tr>
    </table>
</form>