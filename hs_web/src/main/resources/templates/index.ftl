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
                    <div>
                        <div style="float: left;margin: 5px 0 0 10px;">
                            <img width="40" src="/img/logo.png" />
                        </div>
                        <div style="float: left;margin: 9px 0 0 10px;">
                            <h4 style="color: #fffd38;margin: 0px;">桦树林子学校</h4>
                            <p style="font-size: 12px;color: #fffd38; padding: 0px;margin: 0px;">Hua Shu Lin Zi School</p>
                        </div>
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
                                <#if Session.LOGIN_USER?exists>
                                    <li><a href="/upload/index">上传教学资源</a></li>
                                </#if>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                        <#if Session.LOGIN_USER?exists>
                            <div style="float: right; margin: 15px 30px 0 0; color: #fff">
                                <span style="margin-right: 10px;">
                                    <span class="glyphicon glyphicon-user"></span> ${Session.LOGIN_USER.name?default('')}
                                </span>
                                <span>
                                    <a style="color: #fffd38;" href="/user/logout">
                                        <span class="glyphicon glyphicon-log-out"></span>
                                    </a>
                                </span>
                            </div>
                        <#else>
                            <div style="color: #fff; margin: 15px 30px 0 0">
                                <span style="color: #f2f2f2">还未登录!</span>
                                <span>|</span>
                                <span>
                                    <a style="color: #fffd38;" href="#" data-toggle="modal" data-target="#registModel">
                                        注册
                                    </a>
                                </span>
                                <span>|</span>
                                <span>
                                    <a style="color: #fffd38;" href="#" data-toggle="modal" data-target="#loginModel">
                                        登录
                                    </a>
                                </span>
                            </div>
                        </#if>
                        </li>
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

<!-- 登录 -->
<div class="modal fade" id="loginModel" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h3 class="modal-title">登 录</h3>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="login_account" class="control-label">用户名:</label>
                        <input placeholder="输入用户名" type="text" class="form-control" id="login_account">
                    </div>
                    <div class="form-group">
                        <label for="login_pwd" class="control-label">密 码:</label>
                        <input placeholder="输入密码" type="password" class="form-control" id="login_pwd">
                    </div>
                    <div class="text-danger" style="height: 30px;" id="login_err_tips">

                    </div>
                    <div>
                        <button type="button" class="btn btn-link">忘记密码?</button>
                        <button type="button" class="btn btn-link">没有账号? 立即注册</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button id="loginBtn" style="width: 100%" type="button" class="btn btn-primary">登 录</button>
            </div>
        </div>
    </div>
</div>

<!-- 注册 -->
<div class="modal fade" id="registModel" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">注 册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="regist_account" class="col-sm-2 control-label">* 用户名</label>
                        <div class="col-sm-10">
                            <input placeholder="输入用户名" type="text" class="form-control" id="regist_account">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10" style="color: #999">
                            格式: 5-20个以字母开头、可带数字、“_”、“.”的字串。
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regist_name" class="col-sm-2 control-label">* 姓 名</label>
                        <div class="col-sm-10">
                        <input placeholder="输入姓名" type="text" class="form-control" id="regist_name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10" style="color: #999">
                            格式: 真实姓名,中文。
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regist_idcard" class="col-sm-2 control-label">* 身份证号</label>
                        <div class="col-sm-10">
                        <input placeholder="输入身份证号" type="text" class="form-control" id="regist_idcard">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regist_pwd" class="col-sm-2 control-label">* 密 码</label>
                        <div class="col-sm-10">
                        <input placeholder="输入密码" type="password" class="form-control" id="regist_pwd">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10" style="color: #999">
                            格式: 6-20个字母、数字、下划线
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regist_pwd_repeat" class="col-sm-2 control-label">* 再次输入</label>
                        <div class="col-sm-10">
                            <input placeholder="再次输入密码" type="password" class="form-control" id="regist_pwd_repeat">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10">
                            <div class="text-danger" id="regist_err_tips">

                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button id="registBtn" style="width: 100%" type="button" class="btn btn-primary">注 册</button>
            </div>
        </div>
    </div>
</div>
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/ie10-viewport-bug-workaround.js"></script>
<script src="/js/index.js"></script>
</body>
</html>
