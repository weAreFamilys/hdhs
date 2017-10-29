<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!-- Bootstrap -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/css/nprogress.css" rel="stylesheet">

    <!-- PNotify -->
    <link href="/css/pnotify/pnotify.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
    <#include "../nav_left.ftl">
    <#include "../nav_top.ftl">
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>这里放路径</h3>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                            <h2>创建 新闻 - 公告 - 活动</h2>
                                <#--<a href="/user/add" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增用户 </a>-->
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <br />
                                <form class="form-horizontal form-label-left">

                                    <div class="form-group">
                                        <label for="title" class="control-label col-md-2 col-sm-2">
                                            文章类型 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <select class="form-control col-md-4 col-sm-4">
                                                <option selected>学校新闻</option>
                                                <option>通知公告</option>
                                                <option>最新活动</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="title" class="control-label col-md-2 col-sm-2">
                                            标题 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <input id="title" required="required" type="text" class="form-control col-md-7 col-xs-12">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="entryPerson" class="control-label col-md-2 col-sm-2">
                                            录入人 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <input id="entryPerson" required="required" type="text" class="form-control col-md-7 col-xs-12">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="createTime" class="control-label col-md-2 col-sm-2">
                                            录入时间 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <input id="createTime" required="required" type="text" class="form-control col-md-7 col-xs-12">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="createTime" class="control-label col-md-2 col-sm-2">
                                            文章简介 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <textarea id="message" class="form-control"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="img" class="control-label col-md-2 col-sm-2">
                                            图片上传
                                        </label>
                                        <div class="col-md-10 col-sm-10">

                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="" class="control-label col-md-2 col-sm-2">
                                            文章内容 <span class="required">*</span>
                                        </label>
                                        <div class="col-md-10 col-sm-10">
                                            <script style="height:400px;" id="editor" type="text/plain"></script>
                                        </div>
                                    </div>


                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <label class="control-label col-md-2 col-sm-2"></label>
                                        <div class="col-md-10 col-sm-10">
                                            <button class="btn btn-primary" type="reset">重 置</button>
                                            <button onclick="addNews()" type="button" class="btn btn-success">提 交</button>
                                        </div>
                                    </div>

                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /page content -->

    <#include "../footer.ftl">
    </div>
</div>



<!-- jQuery -->
<script src="/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="/js/fastclick.js"></script>
<!-- NProgress -->
<script src="/js/nprogress.js"></script>

<script type="text/javascript" charset="utf-8" src="/plugins/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/plugins/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="/plugins/ueditor/lang/zh-cn/zh-cn.js"></script>
<!-- PNotify -->
<script src="/js/pnotify/pnotify.js"></script>

<script src="/js/news/addNews.js"></script>

<script src="/js/common.js"></script>
<!-- Custom Theme Scripts -->
<script src="/js/custom.js"></script>
</body>
</html>