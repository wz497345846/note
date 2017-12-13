<%--
  Created by IntelliJ IDEA.
  User: Stefan
  Date: 2017/12/11
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
    <link rel="stylesheet" href="css/font_icon/iconfont.css">
    <link rel="stylesheet" href="css/index.css">

    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
    <script type="text/javascript" src="js/course.js"></script>
    <script type="text/javascript" src="js/member-query.js"></script>
</head>
<body>
<div id="cc" class="easyui-layout" style="width:100%;height:100%;">
    <%--<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>--%>
    <%--<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>--%>
    <%--<div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>--%>
    <div id="menus" data-options="region:'west'<%--,title:'West'--%>" style="width:186px;background-color: rgb(51,51,51);overflow: hidden">
        <div id="store"><i class="iconfont">&#xe635;</i> 阿赛服饰店</div>
        <div id="logo">
            <img src="img/head.jpeg" alt="">
        </div>
        <div id="menu">
            <ul class="allMenus">
                <li><a href="#"><i class="iconfont">&#xe67b;</i><span>首页</span></a></li>
                <li><a href="#"><i class="iconfont">&#xe7c1;</i><span>会员</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe660;</i><span>客户</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe73f;</i><span>课程</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe68e;</i><span>员工</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe607;</i><span>财务</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe677;</i><span>营销</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe62e;</i><span>统计</span><i class="iconfont">&#xe50f;</i></a></li>
                <li><a href="#"><i class="iconfont">&#xe638;</i><span>设置</span><i class="iconfont">&#xe50f;</i></a></li>
            </ul>
        </div>
        <div class="about-us">由 <a id="sb" href="#">三键客 ™</a> 提供技术支持</div>
        <div id="win" class="easyui-window" title="关于【三键客】" style="width:550px;height:250px" collapsible="false" minimizable="false" maximizable="false" closed="true" draggable="false" resizable="false"
             data-options="iconCls:'icon-save',modal:true">
            <div id="content">
                本产品由三键客所属公司<b>尚学堂科技有限公司</b>提供软件系统服务。
                <p>如有业务或使用问题，请咨询贵商户或门店的系统负责人。如有软件系统问题或建议，请通过如下方式联系我们， 我们一定会仔细研究并尽快处理。</p>
                <ul>
                    <li>电话： 025-66045495</li>
                    <li>QQ： 3188259912</li>
                </ul>
            </div>
        </div>
    </div>
    <div data-options="region:'center'<%--,title:'center title'--%>" style="background:#eee;">
        <div id="one">
            <ul class="child_menu">
                <li><a href="#" value="member-query">会员查询</a></li>
                <li><a href="#">新建会员</a></li>
                <li><a href="#">会员卡查询</a></li>
                <li><a href="#">批量操作</a></li>
                <li><a href="#">消息提醒</a></li>
            </ul>
        </div>
        <div id="two">
            <ul class="child_menu">
                <li><a href="#">客户查询</a></li>
                <li><a href="#">新建客户</a></li>
                <li><a href="#">跟进记录</a></li>
                <li><a href="#">跟进统计</a></li>
                <li><a href="#">批量操作</a></li>
            </ul>
        </div>
        <div id="three">
            <ul class="child_menu">
                <li><a href="#" value="addcourse">添加课程</a></li>
                <li><a href="#" value="showcourse">查看课程</a></li>
            </ul>
        </div>
        <div id="four">
            <ul class="child_menu">
                <li><a href="#" value="stuff-query">员工查询</a></li>
                <li><a href="#" value="stuff-create">新建员工</a></li>
            </ul>
        </div>
        <div id="five">
            <ul class="child_menu">
                <li><a href="#" value="findBill">查看账单</a></li>
                <li><a href="#" value="editBill">编辑账单</a></li>
            </ul>
        </div>
        <div id="six">
            <ul class="child_menu">
                <li><a href="#">微官网</a></li>
                <li><a href="#">营销工具</a></li>
            </ul>
        </div>
        <div id="seven">
            <ul class="child_menu">
                <li><a href="#">会员统计</a></li>
                <li><a href="#">员工统计</a></li>
                <li><a href="#">课程统计</a></li>
                <li><a href="#">会员卡统计</a></li>
                <li><a href="#">收支统计</a></li>
                <li><a href="#">营业报表</a></li>
            </ul>
        </div>
        <div id="eight">
            <ul class="child_menu">
                <li><a href="#">门店信息</a></li>
                <li><a href="#">门店场地</a></li>
                <li><a href="#">会员卡设置</a></li>
                <li><a href="#">积分设置</a></li>
                <li><a href="#">客户来源</a></li>
                <li><a href="#">参数设置</a></li>
                <li><a href="#">短信记录</a></li>
                <li><a href="#">手机版</a></li>
                <li><a href="#">收费详细</a></li>
            </ul>
        </div>
        <div id="tabs" class="easyui-tabs">
            <%--<div title="Tab1" style="padding:20px;display:none;">--%>
                <%--tab1--%>
            <%--</div>--%>
            <%--<div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;display:none;">--%>
                <%--tab2--%>
            <%--</div>--%>
            <%--<div title="Tab3" data-options="iconCls:'icon-reload',closable:true" style="padding:20px;display:none;">
                首页
            </div>--%>
        </div>

    </div>
</div>
</body>
</html>
