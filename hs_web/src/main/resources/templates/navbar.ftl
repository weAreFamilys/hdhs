<nav class="navbar navbar-default navbar-fixed-top" style="background-color: #fff;">
    <hr style="width: 100%; height: 3px; background-color: #3e94d8; padding: 0; margin: 0"/>
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">导航菜单</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <#--<li>-->
                    <#--<a href="/" style="margin: 0; padding: 5px 10px">-->
                        <#--<img width="40" src="/img/logo.png"/>-->
                    <#--</a>-->
                <#--</li>-->
                <li>
                    <a href="/">
                        <span class="glyphicon glyphicon-home"></span> 返回首页
                    </a>
                </li>
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">学校概况</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">学校简介</a></li>
                        <li><a href="#">组织机构</a></li>
                        <li><a href="#">办学特色</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">党建工作</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">工作通知</a></li>
                        <li><a href="#">党员风采</a></li>
                        <li><a href="#">支部建设</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">学校德育</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">工作通知</a></li>
                        <li><a href="#">德育实践</a></li>
                        <li><a href="#">行为教育</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">教学管理</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">教育教学理念</a></li>
                        <li><a href="#">教学管理体系</a></li>
                        <li><a href="#">学科建设特色</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">教育科研</a>
                    <ul class="dropdown-menu">
                        <li><a href="#">课题研究</a></li>
                        <li><a href="#">科研简讯</a></li>
                        <li><a href="#">科研指南</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" role="button" aria-haspopup="true"
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
            <#if Session.LOGIN_USER?exists>
                <div style="float: right; margin: 15px 15px 0 0;">
                    <span style="margin-right: 10px;">
                        <span class="glyphicon glyphicon-user"></span> ${Session.LOGIN_USER.name?default('')}
                    </span>
                    <span>
                        <a href="/user/logout">
                            <span class="glyphicon glyphicon-log-out"></span>
                        </a>
                    </span>
                </div>
            <#else>
                <div style="margin: 15px 15px 0  0">
                    <span>还未登录!</span>
                    <span>|</span>
                    <span>
                    <a href="#" data-toggle="modal" data-target="#registModel">
                        注册
                    </a>
                    </span>
                    <span>|</span>
                    <span>
                    <a href="#" data-toggle="modal" data-target="#loginModel">
                        登录
                    </a>
                    </span>
                </div>
            </#if>
            </ul>

        </div>
    </div>
</nav>