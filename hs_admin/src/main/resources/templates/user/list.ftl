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

<body class="nav-md footer_fixed">
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
                                <ul class="nav navbar-left panel_toolbox">
                                    <li>
                                        <a data-toggle="modal" data-target="#user_add" style="color: #449d44"><i class="fa fa-plus-square"></i> 新增用户</a>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="table table-striped projects">
                                    <thead>
                                    <tr>
                                        <th style="width: 1%">#</th>
                                        <th style="width: 20%">登录账户</th>
                                        <th>用户名</th>
                                        <th>描 述</th>
                                        <th style="width: 30%">操 作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#list userList as user>
                                    <tr>
                                        <td>#</td>
                                        <td>
                                            ${user.account?default('')}
                                        </td>
                                        <td>
                                            ${user.name?default('')}
                                        </td>
                                        <td>
                                            ${user.memo?default('')}
                                        </td>
                                        <td>
                                            <a data-toggle="modal" data-target="#user" href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit </a>
                                            <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> Delete </a>
                                        </td>
                                    </tr>
                                    </#list>
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

<!-- 增加用户 -->
<div class="modal fade" id="user_add" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="user">新增用户</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="user_account" class="control-label">登录账户:</label>
                        <input type="text" class="form-control" id="user_account">
                    </div>
                    <div class="form-group">
                        <label for="user_name" class="control-label">用户名:</label>
                        <input type="text" class="form-control" id="user_name">
                    </div>
                    <#--<div class="form-group">-->
                        <#--<label for="user_pwd" class="control-label">密码:</label>-->
                        <#--<input type="password" class="form-control" id="user_pwd">-->
                    <#--</div>-->
                    <div class="form-group">
                        <label for="user_memo" class="control-label">描述:</label>
                        <input type="text" class="form-control" id="user_memo">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
                <button type="button" class="btn btn-primary">提 交</button>
            </div>
        </div>
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