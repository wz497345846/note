$(document).ready(function () {
    $(".allMenus").find("li").first().find("i").first().css("color","rgb(255,65,0)");
}).ready(function(){
    $(".allMenus").find("a").click(function(){
        $(this).find("i").first().css("color","rgb(255,65,0)");
        $(this).parent("li").siblings().find("i").css("color","#fafafa");
    });
}).ready(function() {
    $(".about-us").children("a").click(function(){
        $("#win").window('open');
    });
}).ready(function () {
    $(".allMenus").find("li:eq(1)").hover(function () {
        $("#one").css("display","block");
    });
    /*$(".allMenus").find("li:eq(1)").children("a").hover(function () {
        $("#one").css("display","block");
    });*/
    $(".allMenus").find("li:eq(1)").siblings().hover(function () {
        $("#one").css("display","none");
    });

    $(".allMenus").find("li:eq(2)").hover(function () {
        $("#two").css("display","block");
    });
    $(".allMenus").find("li:eq(2)").siblings().hover(function () {
        $("#two").css("display","none");
    });

    $(".allMenus").find("li:eq(3)").hover(function () {
        $("#three").css("display","block");
    });
    $(".allMenus").find("li:eq(3)").siblings().hover(function () {
        $("#three").css("display","none");
    });

    $(".allMenus").find("li:eq(4)").hover(function () {
        $("#four").css("display","block");
    });
    $(".allMenus").find("li:eq(4)").siblings().hover(function () {
        $("#four").css("display","none");
    });

    $(".allMenus").find("li:eq(5)").hover(function () {
        $("#five").css("display","block");
    });
    $(".allMenus").find("li:eq(5)").siblings().hover(function () {
        $("#five").css("display","none");
    });

    $(".allMenus").find("li:eq(6)").hover(function () {
        $("#six").css("display","block");
    });
    $(".allMenus").find("li:eq(6)").siblings().hover(function () {
        $("#six").css("display","none");
    });

    $(".allMenus").find("li:eq(7)").hover(function () {
        $("#seven").css("display","block");
    });
    $(".allMenus").find("li:eq(7)").siblings().hover(function () {
        $("#seven").css("display","none");
    });

    $(".allMenus").find("li:eq(8)").hover(function () {
        $("#eight").css("display","block");
    });
    $(".allMenus").find("li:eq(8)").siblings().hover(function () {
        $("#eight").css("display","none");
    });

    /*$("#menu").mouseout(function () {
        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });*/
}).ready(function () {
    $("#three").find("li:eq(0)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });
    $("#three").find("li:eq(1)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });

    $("#four").find("li:eq(0)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });
    $("#four").find("li:eq(1)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });

    $("#five").find("li:eq(0)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });
    $("#five").find("li:eq(1)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }
        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });

    $("#one").find("li:eq(0)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text())){
            $("#tabs").tabs("select",$(this).text());
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text(),
                closable:true,
                href:$(this).attr("value")
            });
        }

        $("#one").css("display","none");
        $("#two").css("display","none");
        $("#three").css("display","none");
        $("#four").css("display","none");
        $("#five").css("display","none");
        $("#six").css("display","none");
        $("#seven").css("display","none");
        $("#eight").css("display","none");
    });
    
});/*.ready(function () {
    $(".allMenus").find("a").click(function () {
        $(this).parent("li").addClass("clk");
        $(this).parent("li").siblings().removeClass("clk");
        alert(1);
    });
})*/;
/*
$().ready(function(){
    $("#sb")/!*.children("a")*!/.click(function() {
        $.messager.show({
            title:'关于【三键客】',
            msg:'本产品由健总管所属公司南京强点信息技术有限公司提供软件系统服务。' +
            '如有业务或使用问题，请咨询贵商户或门店的系统负责人。如有软件系统问题或建议，请通过如下方式联系我们， 我们一定会仔细研究并尽快处理。\\n\' +',
            timeout:0,
            showType:'slide',
            style:{
                width:'600px',
                height:'300px',
                left:'34%',
                top:'31%',
                border:'0',
                border_radius:'3px',
                background_color:'lightblue',
                // border:radius,'3px',
                box_shadow:'0 7px 9px -4px rgba(0,0,0,.2),0 14px 21px 2px rgba(0,0,0,.14),0 5px 20px 4px rgba(0,0,0,.12)'
            }
        });

    });
});*/
