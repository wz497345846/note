$(document).ready(function(){
   $("button").click(function(){
       if($("#name").val().length == 0 || $("#name").val() == ""){
           $("#message").html("请输入用户名");
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
               url : "/employeeLogin",
               method : "post",
               data : {
                   empname:name,
                   emppwd:pwd,
               },
               dataType:"json",
               success:function (data) {
                   if(data == ""){
                       $("#message").html("用户名或密码错误");
                       $("#info").css("display" , "block");
                   }else{
                       window.location.href="index";
                   }
               },
               error:function () {
                   $("#message").html("服务器正忙");
                   $("#info").css("display" , "block");
               }
           });
       }
   });
});