<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table id="dg" class="easyui-datagrid"  style="height:auto"
       data-options="
				iconCls: 'icon-edit',
				singleSelect: false,
				toolbar: '#tb',
				url: 'datagrid_data1.json',
				method: 'get',
				onClickRow: onClickRow
			">
    <thead>
    <tr>
        <th data-options="field:'billid',width:80,editor:{type:'numberbox'}">账单 ID</th>
        <th data-options="field:'empid',width:80,editor:{type:'numberbox'}">记账人 ID</th>
        <th data-options="field:'cost',width:80,align:'right',editor:{type:'numberbox',options:{precision:2}}">消费总额</th>
        <th data-options="field:'paytype',width:80,
						formatter:function(value,row){
							return row.productname;
						},
						editor:{
							type:'combobox',
							options:{
								valueField:'productid',
								textField:'productname',
								method:'get',
								url:'products.json',
								required:true
							}
						}">支付类型</th>
        <th data-options="field:'createtime',width:130">创建时间</th>
        <th data-options="field:'billdesc',width:164,align:'center',editor:'textbox'">备注</th>
    </tr>
    </thead>
</table>

<div id="tb" style="height:auto">
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">记账</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">返回</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">本次操作行数</a>
</div>

<script type="text/javascript">
    var editIndex = undefined;
    function endEditing(){
        if (editIndex == undefined){return true}
        if ($('#dg').datagrid('validateRow', editIndex)){
            var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});
            var productname = $(ed.target).combobox('getText');
            $('#dg').datagrid('getRows')[editIndex]['productname'] = productname;
            $('#dg').datagrid('endEdit', editIndex);
            editIndex = undefined;
            return true;
        } else {
            return false;
        }
    }
    function onClickRow(index){
        if (editIndex != index){
            if (endEditing()){
                $('#dg').datagrid('selectRow', index)
                    .datagrid('beginEdit', index);
                editIndex = index;
            } else {
                $('#dg').datagrid('selectRow', editIndex);
            }
        }
    }
    function append(){
        if (endEditing()){
            $('#dg').datagrid('appendRow',{status:'P'});
            editIndex = $('#dg').datagrid('getRows').length-1;
            $('#dg').datagrid('selectRow', editIndex)
                .datagrid('beginEdit', editIndex);
        }
    }
    function removeit(){
        if (editIndex == undefined){return}
        $('#dg').datagrid('cancelEdit', editIndex)
            .datagrid('deleteRow', editIndex);
        editIndex = undefined;
    }
    function accept(){
        if (endEditing()){
            $('#dg').datagrid('acceptChanges');
        }
    }
    function reject(){
        $('#dg').datagrid('rejectChanges');
        editIndex = undefined;
    }
    function getChanges(){
        var rows = $('#dg').datagrid('getChanges');
        alert(rows.length+'行发生改变!');
    }
</script>