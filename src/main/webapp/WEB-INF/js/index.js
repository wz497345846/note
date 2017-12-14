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


}).ready(function () {
    $("#one").find("li").children("a").click(function () {
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

    $("#two").find("li").children("a").click(function () {
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

    $("#three").find("li").children("a").click(function () {
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

    $("#four").find("li").children("a").click(function () {
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

    $("#five").find("li").children("a").click(function () {
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

    $("#six").find("li").children("a").click(function () {
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

    $("#seven").find("li").children("a").click(function () {
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

    $("#guide").children("span").text(window.location.search.substring(6));

    $(".allMenus").find("li:eq(0)").children("a").click(function () {
        if($("#tabs").tabs("exists",$(this).text().substring(1))){
            $("#tabs").tabs("select",$(this).text().substring(1));
        }else{
            $("#tabs").tabs('add',{
                title:$(this).text().substring(1),
                closable:true,
                href:$(this).attr("value")
            });
        }
    });
    if($("#tabs").tabs("exists",$(".allMenus").find("li:eq(0)").children("a").text().substring(1))){
        $("#tabs").tabs("select",$(".allMenus").find("li:eq(0)").children("a").text().substring(1));
    }else{
        $("#tabs").tabs('add',{
            title:$(".allMenus").find("li:eq(0)").children("a").text().substring(1),
            closable:true,
            href:$(".allMenus").find("li:eq(0)").children("a").attr("value")
        });
    }
});

