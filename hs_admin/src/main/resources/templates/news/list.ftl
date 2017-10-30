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
                                <#--<h2>Table design <small>Custom design</small></h2>-->
                                    <a href="/news/add" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 增加 </a>
                                    <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 修改 </a>
                                    <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除 </a>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="table table-striped projects">
                                    <thead>
                                    <tr>
                                        <th style="width: 5%">
                                            <input type="checkbox" id="checkboxSuccess">
                                        </th>
                                        <th style="width: 40%">文章标题</th>
                                        <th>创建时间</th>
                                        <th>录入人</th>
                                        <th style="width: 10%">已发布</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#--<#list userList as user>-->
                                    <tr>
                                        <td><input type="checkbox" id="checkboxSuccess"></td>
                                        <td>
                                            <#--${user.account?default('')}-->
                                        </td>
                                        <td>
                                            <#--${user.name?default('')}-->
                                        </td>
                                        <td>
                                            <#--${user.memo?default('')}-->
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                    <#--</#list>-->
                                    </tbody>
                                </table>

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

<!-- Custom Theme Scripts -->
<script src="/js/custom.min.js"></script>
</body>
</html>