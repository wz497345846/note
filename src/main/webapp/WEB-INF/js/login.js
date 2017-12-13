$(document).ready(function(){
   $("button").click(function(){
       if($("#name").val().length == 0 || $("#phone").val() == ""){
           $("#info").css("display" , "block");
       }/*else if($("#name").val().length != 11){
           $("#message").html("手机号码格式错误");
           $("#info").css("display" , "block");
       }*/else if($("#pwd").val().length == 0 || $("#pwd").val() == ""){
           $("#message").html("请输入登录密码");
           $("#info").css("display" , "block");
       }else{
           $("#info").hide();
           var name = $("#name").val();
           var pwd = $("#pwd").val();
           $.ajax({
               url : "/selectEmployee",
               method : "post",
               data : {
                   empname:name,
                   empstate:$("#empstate").combobox('getValue'),
                   roleid:$("#roleid").combobox('getValue'),
                   pageNumber : page_Number,
                   pageSize : page_Size
               }
           })
       }
   });
});