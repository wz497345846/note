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
        var obj2  = $("#tta").datagrid("getSelections");
        $("#editBill").form("load",{
            billid:obj2[0].billid,
            empid:obj2[0].empid,
            cost:obj2[0].cost,
            paytype:obj2[0].paytype,
            createtime:obj2[0].createtime,
            billdesc:obj2[0].billdesc
        })
    });

    function subform(){
        $.post("bill/updateBill",$("#editBill").serialize(),function(data){
            if(data.state == 200){
                $.messager.alert('提示','修改成功');
                $("#edit").window("close");
                $("#tta").datagrid("reload");
            }else{
                $.messager.alert('提示','修改失败');
            }
        });
    }
    function clearForm(){
        $('#editBill').form('clear');
    }
</script>
<div style="text-align:center;padding:5px">
<form id="editBill">
    <table align="center" width="60%" >
        <tr >
            <td>账单ID</td>
            <td >
                <input  class="easyui-textbox" type="text" name="billid" readonly><br/>
            </td>
        </tr>
            <tr></tr>
        <tr>
            <td>记账人ID</td>
            <td>
                <input class="easyui-textbox" type="text"  name="empid" data-options="required:true"><br/>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td>消费总额</td>
            <td>
                <input class="easyui-textbox" type="text" name="cost" data-options="required:true"><br/>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td>支付类型</td>
            <td style="width: 141px">
                <select class="easyui-combobox" name="paytype" style="width: 120px"><br/>
                    <option value="现金">现金</option>
                    <option value="支付宝">支付宝</option>
                    <option value="微信">微信</option>
                    <option value="刷卡">刷卡</option>
                </select>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td>备注</td>
            <td>
                <input class="easyui-textbox" name="billdesc" data-options="multiline:true" style="height:60px"><br/>
            </td>
        </tr>
    </table>
</form>
</div>
    <div style="text-align:center;padding:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="subform()" data-options="iconCls:'icon-save'">保存</a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" data-options="iconCls:'icon-cancel'">取消</a>
</div>