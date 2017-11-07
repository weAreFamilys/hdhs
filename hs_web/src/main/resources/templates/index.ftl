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
                    <a class="navbar-brand" href="#" style="font-size: 22px; margin: 5px 20px;color: #ffffff">桦树林子学校</a>
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
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-cd"></span>学校新闻
                    <small>Subtext for header</small>
                </h3>
            </div>

            <ul class="news-ul">
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
            </ul>
            <hr/>
            <a href="#">更多学校新闻 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
        </div>
        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-volume-up"></span>通知公告
                    <small>Subtext for header</small>
                </h3>
            </div>
            <ul class="news-ul">
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
                <li class="news-li"><a href="#">这里是新闻内容这里容这里是新闻内容...</a></li>
            </ul>
            <hr/>
            <a href="#">通知公告 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
        </div>

        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-education"></span>最新活动
                    <small>Subtext for header</small>
                </h3>
            </div>
            <div style="height: 300px;">
                <div class="media">
                    <div class="media-left">
                        <a href="#">
                            <img width="100" height="60" class="media-object" src="/img/1.jpg" alt="">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">这里是标题</h4>
                        <p>
                            是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容
                        </p>
                    </div>
                </div>
                <div class="media">
                    <div class="media-left">
                        <a href="#">
                            <img width="100" height="60" class="media-object" src="/img/1.jpg" alt="">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">这里是标题</h4>
                        <p>
                            是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容
                        </p>
                    </div>
                </div>
                <div class="media">
                    <div class="media-left">
                        <a href="#">
                            <img width="100" height="60" class="media-object" src="/img/1.jpg" alt="">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">这里是标题</h4>
                        <p>
                            是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容
                        </p>
                    </div>
                </div>
            </div>
            <hr/>
            <a href="#">最新活动 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>

        </div>
    </div>
</div><!-- /.container -->

<!-- 校园生活 -->
<div style="width:100%;height: 100%;background-color: #122b40">
<div class="container">
    <div class="page-header">
        <h3 style="color: #fff;"><span style="color: #fff; letter-spacing: 10px;" class="glyphicon glyphicon-camera"></span>校园生活
            <small style="color: #fff;">School Life</small>
        </h3>
    </div>
    <div class="row">
        <#list schoolLifeList as schoolLife>
            <div class="col-md-4">
                <div class="thumbnail">
                    <div class="image view view-first">
                        <img style="width: 100%;height: 220px;" src="${schoolLife.s_img}" alt="">
                    </div>
                    <div class="caption">
                        <h3>${schoolLife.s_title}</h3>
                        <p style="height: 60px;overflow: hidden">${schoolLife.s_desc}</p>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>
<!-- /校园生活 -->
</div>
<!-- footer -->
<div class="col-lg-12" style="height: 100px; background-color: #e8e8e8; border-top: 1px solid #d4d4d4">
    <p class="pull-right"><a href="#">Back to top</a></p>
</div>


<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/ie10-viewport-bug-workaround.js"></script>
<script src="/js/index.js"></script>
</body>
</html>
