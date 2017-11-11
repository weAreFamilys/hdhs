<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>桦树林子学校</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/index.css" rel="stylesheet">
</head>
<body>
<#include "common/common.ftl">
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">导航菜单</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <div style="float: left;width:200px;">
                        <a href="#">
                            <img style="float: left;margin-top: 4px;" width="50" src="/img/logo.png" />
                            <div style="float: left;margin: 15px 0 0 5px;">
                                <h4 style="color: #fffd38;margin: 0px;">桦树林子学校</h4>
                                <p style="font-size: 12px;color: #fffd38; padding: 0px;margin: 0px;">Hua Shu Lin Zi School</p>
                            </div>

                        </a>
                    </div>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">学校概况</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">学校简介</a></li>
                                <li><a href="#">组织机构</a></li>
                                <li><a href="#">办学特色</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">党建工作</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">工作通知</a></li>
                                <li><a href="#">党员风采</a></li>
                                <li><a href="#">支部建设</a></li>

                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">学校德育</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">工作通知</a></li>
                                <li><a href="#">德育实践</a></li>
                                <li><a href="#">行为教育</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教学管理</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">教育教学理念</a></li>
                                <li><a href="#">教学管理体系</a></li>
                                <li><a href="#">学科建设特色</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教育科研</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">课题研究</a></li>
                                <li><a href="#">科研简讯</a></li>
                                <li><a href="#">科研指南</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教学资源</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">电子教案</a></li>
                                <li><a href="#">课件</a></li>
                                <li><a href="#">教学视频</a></li>

                            </ul>
                        </li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li id="index_signin"><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
                        <li id="index_login"><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
                    </ul>

                </div>
            </div>
        </nav>

    </div>
</div>

<!-- Carousel -->
<#include "carousel.ftl">
<!-- /carousel -->

<!-- 新闻 -->
<#include "news.ftl">
<!-- /新闻 -->

<!-- 校园生活 -->
<#include "campus-life.ftl">
<!-- /校园生活-->

<#include "footer.ftl">

<#include "common/script.ftl">
</body>
</html>
