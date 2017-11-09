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
                               aria-expanded="false">学校概况<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">学校简介</a></li>
                                <li><a href="#">组织机构</a></li>
                                <li><a href="#">办学特色</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">党建工作<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">工作通知</a></li>
                                <li><a href="#">党员风采</a></li>
                                <li><a href="#">支部建设</a></li>

                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">学校德育<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">工作通知</a></li>
                                <li><a href="#">德育实践</a></li>
                                <li><a href="#">行为教育</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教学管理<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">教育教学理念</a></li>
                                <li><a href="#">教学管理体系</a></li>
                                <li><a href="#">学科建设特色</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教育科研<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">课题研究</a></li>
                                <li><a href="#">科研简讯</a></li>
                                <li><a href="#">科研指南</a></li>

                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="navbar-title" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">教学资源<span class="caret"></span></a>
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
<#if (carouselList?size > 0)>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <#list carouselList as carousel>
            <li data-slide-to="${carousel_index}" <#if (carousel_index == 0)>class="active"</#if>></li>
        </#list>
    </ol>
    <div class="carousel-inner" role="listbox">
        <#list carouselList as carousel>
            <div class="item <#if (carousel_index == 0)>active</#if>">
                <img src="${carousel.c_img}"/>

                <div class="container">
                    <div class="carousel-caption">

                        <h1>${carousel.c_title?default('')}</h1>
                        <p>${carousel.c_desc?default('')}</p>
                        <#if (carousel.c_content != '')>
                            <p><a class="btn btn-lg btn-primary" href="#" role="button">详细信息</a></p>
                        </#if>
                    </div>
                </div>
            </div>
        </#list>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">前翻</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">后翻</span>
    </a>
</div>
<#else>
<div style="height: 300px; background-color: #eeeeee"></div>
</#if>
<!-- /carousel -->

<div class="container">
    <div class="row news">
        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-cd"></span>校园新闻
                    <small>Campus News</small>
                </h3>
            </div>

            <ul class="news-ul">
            <#if (newsList?size > 0)>
                <#list newsList as news>
                    <li class="news-li news-title">
                        <span class="news-title-left">
                            <a href="#">
                                <#if (news.n_title?length lt 19)>
                                    ${news.n_title}
                                <#else>
                                    ${news.n_title[0..18]}...
                                </#if>
                            </a>
                        </span>
                        <span class="news-date">
                            <@timeline_dt datetime=news.n_create_time></@timeline_dt>
                        </span>
                    </li>
                </#list>
            </#if>
            </ul>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>
        </div>
        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-volume-up"></span>通知公告
                    <small>Public Notice</small>
                </h3>
            </div>
            <ul class="news-ul">
            <#if (noticeList?size > 0)>
                <#list noticeList as notice>
                    <li class="news-li news-title">
                        <span class="news-title-left">
                            <a href="#">
                                <#if (notice.n_title?length lt 19)>
                                ${notice.n_title}
                                <#else>
                                ${notice.n_title[0..18]}...
                                </#if>
                            </a>
                        </span>
                        <span class="news-date">
                            <@timeline_dt datetime=notice.n_create_time></@timeline_dt>
                        </span>
                    </li>
                </#list>
            </#if>
            </ul>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>
        </div>

        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-education"></span>校园活动
                    <small>Campus Activities</small>
                </h3>
            </div>
            <div class="news-ul">
                <#list activityList as activity>
                    <div class="media" style="height: 95px;">
                        <div class="media-left">
                            <a href="#">
                                <img width="120" height="85" class="media-object" src="${activity.n_img?default('')}" alt="">
                            </a>
                        </div>
                        <div class="media-body">
                            <h5 class="media-heading">
                                <#if (activity.n_title?length lt 15)>
                                    ${activity.n_title?default('')}
                                <#else>
                                    ${activity.n_title[0..14]}...
                                </#if>
                            </h5>
                            <p>

                            </p>
                        </div>
                    </div>
                </#list>
            </div>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>

        </div>
    </div>
</div><!-- /.container -->

<!-- 校园生活
<div style="width:100%;height: 100%;background-color: #122b40">
-->
<div class="container">
    <div class="page-header">
        <h3><span style="color: #428bca; letter-spacing: 10px;" class="glyphicon glyphicon-camera"></span>校园生活
            <small>Campus Life</small>
        </h3>
    </div>
    <div class="row">
        <#list schoolLifeList as schoolLife>
            <div class="col-md-4">
                <div class="thumbnail">
                    <div class="image view view-first">
                        <img style="width: 100%;height: 220px;display: block;" src="${schoolLife.s_img}" alt="">
                        <#--<h4 class="img-title">-->
                            <#--<#if (schoolLife.s_title?length lt 12)>-->
                            <#--${schoolLife.s_title}-->
                            <#--<#else>-->
                            <#--${schoolLife.s_title[0..11]}...-->
                            <#--</#if>-->
                        <#--</h4>-->
                        <div class="mask">
                            <p>
                                <h4 style="color: #fff;">
                                    <#if (schoolLife.s_title?length lt 12)>
                                        ${schoolLife.s_title}
                                    <#else>
                                        ${schoolLife.s_title[0..11]}...
                                    </#if>
                                </h4>
                                <p style="color: #fff;">
                                    <#if (schoolLife.s_desc?length lt 100)>
                                        ${schoolLife.s_desc}
                                    <#else>
                                        ${schoolLife.s_desc[0..99]}...
                                    </#if>
                                </p>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>
<!-- /校园生活
</div>
-->
<!-- footer -->
<div class="col-lg-12" style="height: 200px; background-color: #efefef; border-top: 1px solid #d4d4d4">
    <div class="container">
        <img style="margin: 50px 40px 0 0; float: left" width="100" src="/img/logo.png" />
        <div style="float: left;margin:20px 0 20px 30px;">
            <h4>学校概况</h4>
            <ul style="margin: 0; list-style: none; padding:0;line-height: 25px;">
                <li>学校简介</li>
                <li>组织机构</li>
                <li>办法特色</li>
            </ul>
        </div>
        <div style="float: left;margin:20px 0 20px 30px;">
            <h4>党建工作</h4>
            <ul style="margin: 0; padding:0 0 0 15px;line-height: 25px;">
                <li>学校简介</li>
                <li>组织机构</li>
                <li>办法特色</li>
            </ul>
        </div>
        <div style="float: left;margin:20px 0 20px 30px;">
            <h4>学校德育</h4>
            <ul style="margin: 0; padding:0 0 0 15px;line-height: 25px;">
                <li>学校简介</li>
                <li>组织机构</li>
                <li>办法特色</li>
            </ul>
        </div>
        <div style="float: left;margin:20px 0 20px 30px;">
            <h4>教学管理</h4>
            <ul style="margin: 0; padding:0 0 0 15px;line-height: 25px;">
                <li>学校简介</li>
                <li>组织机构</li>
                <li>办法特色</li>
            </ul>
        </div>
    </div>
</div>


<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/ie10-viewport-bug-workaround.js"></script>
<script src="/js/index.js"></script>
</body>
</html>
