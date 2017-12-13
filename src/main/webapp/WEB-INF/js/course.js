
function add() {
    var course=$("#course").serialize();
    $.ajax({
        type:"post",
        url:"/addc",
        data:$("#course").serialize(),
        dataType:"text",
        success:function (data) {
            if(data=='1'){
                $('#courseid2').val($('#courseid1').val());
                $.ajax({
                    type:"post",
                    url:"/addcourseplan",
                    data:$("#courseplan").serialize(),
                    dateType:"text",
                    success:function (data) {
                        if(data=='1'){
                            alert("添加成功");
                            $("#course")[0].reset();
                            $("#courseplan")[0].reset();
                        }else{
                            alert("添加失败")
                        }
                    }
                })
            }else{
                alert("添加失败");
            }
        }
    });

}


function showcourseonload() {
//shoucourse.jsp
    $('#coursegrid').datagrid({
        title:'健生房课程',
        iconCls:'icon-edit',//图标
        width: 700,
        height: 'auto',
        nowrap: false,
        striped: true,
        border: true,
        collapsible:false,//是否可折叠的
        fit: true,//自动大小
        url:'/allcourse',
        //sortName: 'code',
        //sortOrder: 'desc',
        remoteSort:false,
        idField:'fldId',
        singleSelect:false,//是否单选
        pagination:true,//分页控件
        rownumbers:true,//行号
        frozenColumns:[[
            {field:'ck',checkbox:true}
        ]],
        toolbar: [{
            text: '添加',
            iconCls: 'icon-add',
            handler: function(id) {
                $('#modify').window({
                    width:600,
                    height:400,
                    modal:true,
                    href:"/addcourse"
                });
            }
        }, '-', {
            text: '修改',
            iconCls: 'icon-edit',
            handler: function() {
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $('#modify').window({
                        width:600,
                        height:400,
                        modal:true
                    });

//                    $.ajax({
//                        type:'post',
//                        data:{"id":obj[0].courseid},
//                        url:'',
//                        success:function (data) {
//                            if(data=="1"){
//
//                            }
//                        }
//                    })
                }
            }
        }, '-',{
            text: '删除',
            iconCls: 'icon-remove',
            handler: function(){
                var obj=$("#coursegrid").datagrid("getSelections");
                if(obj!=null&&obj.length!=1){
                    $.messager.alert('提示','请选择一条');
                }else{
                    $.ajax({
                        type:'post',
                        data:{"id":obj[0].courseid},
                        url:'/delcourse',
                        success:function (data) {
                            if(data=="1"){
                                $.messager.alert("提示","删除成功")
                                $("#coursegrid").datagrid("reload");
                            }
                        }
                    })
                }
            }
        }],
    });
//设置分页控件
    var p = $('#coursegrid').datagrid('getPager');
    $(p).pagination({
        pageSize: 10,//每页显示的记录条数，默认为10
        pageList: [5,10,15],//可以设置每页记录条数的列表
        beforePageText: '第',//页数文本框前显示的汉字
        afterPageText: '页    共 {pages} 页',
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
        onBeforeRefresh:function(){
            $(this).pagination('loading');
            alert('before refresh');
            $(this).pagination('loaded');
        }
    });

}
