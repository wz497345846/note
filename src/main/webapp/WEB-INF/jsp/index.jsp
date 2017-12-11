<%--
  Created by IntelliJ IDEA.
  User: Stefan
  Date: 2017/12/7
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>魔鬼健身房</title>
    <link rel="stylesheet" href="css/font_icon/iconfont.css">
    <link rel="stylesheet" href="css/index.css" type="text/css">
    <script src="js/jquery.min.js"></script>
    <script src="js/index.js"></script>
  </head>
  <body>
      <div id="total">
        <div id="head">
          <div id="logo">
              <i class="iconfont">&#xe613;</i>&nbsp;
              <span>三 健 客</span>
          </div>
        </div>
        <div id="content">
          <div>
            <div id="login">用户登录 / SIGN IN</div>
            <div id="data">
              <div class="input">
                <i class="iconfont">&#xe601;</i><input id="phone" type="number" placeholder="请输入登录手机号">
              </div>
              <div class="input">
                <i class="iconfont">&#xe6b2;</i><input id="pwd" type="password" placeholder="请输入登录密码">
              </div>
              <button>
                <span>登录</span>
              </button>
              <div id="more">
                <a href="">密码设置</a>
                <span>|</span>
                <a href="regist">用户注册</a>
              </div>
              <div id="info">
                <i class="iconfont">&#xe502;</i>
                <span id="message">请输入登录手机号</span>
              </div>
            </div>
          </div>
        </div>
        <div id="footer">© 2017   北京尚学堂科技有限公司</div>
      </div>
  </body>
</html>
