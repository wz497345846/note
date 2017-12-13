
var url;

function doSearch() {
    $('#tt').datagrid('load', {
        membername: $('#membername').val(),
        memberphone: $('#memberphone').val()
    });
}

function newUser(){
    $('#dlg').dialog('open').dialog('setTitle','新建用户');
    $('#fm').form('clear');
    url = '/createMember';
}


function editUser() {
    var row = $('#tt').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','修改用户');
        $('#fm').form('load',row);
        url = '/updateMember?id='+row.memberid;
    }
}

function saveUser(){
    $('#fm').form('submit',{
        url: url,
        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            var result = eval('('+result+')');
            if (result.errorMsg){
                $.messager.show({
                    title: 'Error',
                    msg: result.errorMsg
                });
            } else {
                $('#dlg').dialog('close');		// close the dialog
                $('#tt').datagrid('reload');	// reload the user data
            }
        }
    });
}

function destroyUser(){
    var row = $('#tt').datagrid('getSelected');
    if (row){
        $.messager.confirm('Confirm','你确定删除这个会员?',function(r){
            if (r){
                $.post('/delMember',{id:row.memberid},function(result){
                    if (result.success){
                        $('#tt').datagrid('reload');	// reload the user data
                    } else {
                        $.messager.show({	// show error message
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    }
                },'json');
            }
        });
    }
}




function DateTimeFormatter(value) {
    var date = new Date(value);
    var year = date.getFullYear().toString();
    var month = (date.getMonth() + 1);
    var day = date.getDate().toString();
    var hour = date.getHours().toString();
    var minutes = date.getMinutes().toString();
    var seconds = date.getSeconds().toString();
    if (month < 10) {
        month = "0" + month;
    }
    if (day < 10) {
        day = "0" + day;
    }
    if (hour < 10) {
        hour = "0" + hour;
    }
    if (minutes < 10) {
        minutes = "0" + minutes;
    }
    if (seconds < 10) {
        seconds = "0" + seconds;
    }
    return year + "-" + month + "-" + day + " " + hour + ":" + minutes + ":" + seconds;
}

$.fn.datebox.defaults.parser = function(s){
        var t = Date.parse(s);
        if (!isNaN(t)){
            return new Date(t);
        } else {
            return new Date();
        }
    }
