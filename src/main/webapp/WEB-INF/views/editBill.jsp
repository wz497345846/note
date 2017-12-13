<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<script type="text/javascript">
    var tool =[{
        text:"新增",
        iconCls:"icon-add",
        handler:function(){
            $("#add").window({
                title:"新增账单",
                width:"60%",
                height:"60%",
                modal:true,
                href:"addBill"
            });
        }
    },{
        text:"编辑",
        iconCls:"icon-edit",
        handler:function(){
            var obj1=$("#tta").datagrid("getSelections");
            if(obj1 == null || obj1.length != 1){
                $.messager.alert('提示','选择数据不合法');
            }else{
                $("#edit").window({
                    title:"编辑账单",
                    width:"60%",
                    height:"60%",
                    modal:true,
                    href:"editBillInfo"
                });
            }
        }
    },{
        text:"删除",
        iconCls:"icon-remove",
        handler:function(){
            var obj  = $("#tta").datagrid("getSelections");
            if(obj == null || obj.length != 1){
                $.messager.alert('提示','选择数据不合法');
            }else{
                $.post("bill/dropBill",{"billid":obj[0].billid},function(data){
                    if(data.state == 200){
                        $.messager.alert('提示','删除成功');
                        $("#tta").datagrid("reload");
                    }else{
                        $.messager.alert('提示','删除失败');
                    }
                });
            }

        }
    }];
</script>

<table id="tta" class="easyui-datagrid" data-options="rownumbers:true,pageSize:10,toolbar:tool,pagination:true,url:'bill/findAllBill',singleSelect:false">
    <thead>
    <tr>
        <th data-options="field:'ck',checkbox:true"></th>
        <th data-options="field:'billid',width:60">账单ID</th>
        <th data-options="field:'empid',width:60">记账人</th>
        <th data-options="field:'cost'">消费总额</th>
        <th data-options="field:'paytype'">支付类型</th>
        <th data-options="field:'createtime'">创建时间</th>
        <th data-options="field:'billdesc'">备注</th>
    </tr>
    </thead>
</table>
<div id="add" >

</div>
<div id="edit" >

</div>