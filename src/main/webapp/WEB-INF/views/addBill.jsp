<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<script>

    var contentPage = {
        submitForm: function () {
            if (!$('#myForm').form('validate')) {
                $.messager.alert('提示', '信息不完整');
                return;
            } else {
                $.post("bill/addBill", $("#myForm").serialize(), function (data) {
                    if (data.state == 200) {
                        $.messager.alert('提示', '添加成功');
                        $("#add").window("close");
                        $("#tta").datagrid("reload");
                    } else {
                        $.messager.alert('提示', '添加失败');
                    }
                });

            }

        },
        clearForm: function () {
            $('#myForm').form('clear');
        }
    };

</script>
<div style="text-align:center;padding:5px">
    <form id="myForm">
        <table width="60%" align="center" cellpadding="5">
            <tr>
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
                <td>
                    <select class="easyui-combobox" name="paytype" style="width: 120px">
                        <option value="现金">现金</option>
                        <option value="支付宝">支付宝</option>
                        <option value="微信">微信</option>
                        <option value="刷卡">刷卡</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>备注</td>
                <td>
                    <input class="easyui-textbox" name="billdesc" data-options="multiline:true" style="height:60px">
                </td>
            </tr>
        </table>
    </form>
</div>
<div style="text-align:center;padding:5px">
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentPage.submitForm()"
       data-options="iconCls:'icon-add'">添加</a>&nbsp;&nbsp;&nbsp;&nbsp;

    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentPage.clearForm()"
       data-options="iconCls:'icon-undo'">重置</a>
</div>
