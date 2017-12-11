$(document).ready(function(){
   $("button").click(function(){
       if($("#phone").val().length == 0 || $("#phone").val() == ""){
           $("#info").css("display" , "block");
       }else if($("#phone").val().length != 11){
           $("#message").html("手机号码格式错误");
           $("#info").css("display" , "block");
       }else if($("#pwd").val().length == 0 || $("#pwd").val() == ""){
           $("#message").html("请输入登录密码");
           $("#info").css("display" , "block");
       }else{
           $("#info").hide();
       }
   });
});