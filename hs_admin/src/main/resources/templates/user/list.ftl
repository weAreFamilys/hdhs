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

    <link href="/css/blue.css" rel="stylesheet">
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
                        <h3>用户维护</h3>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Table design <small>Custom design</small></h2>
                                <ul class="nav navbar-left panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div class="table-responsive">
                                    <table class="table table-striped jambo_table bulk_action">
                                        <thead>
                                        <tr class="headings">
                                            <th>
                                                <input type="checkbox" id="check-all" class="flat">
                                            </th>
                                            <th class="column-title">Invoice </th>
                                            <th class="column-title">Invoice Date </th>
                                            <th class="column-title">Order </th>
                                            <th class="column-title">Bill to Name </th>
                                            <th class="column-title">Status </th>
                                            <th class="column-title">Amount </th>
                                            <th class="column-title no-link last"><span class="nobr">Action</span>
                                            </th>
                                        </tr>
                                        </thead>

                                        <tbody>
                                        <tr class="even pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000040</td>
                                            <td class=" ">May 23, 2014 11:47:56 PM </td>
                                            <td class=" ">121000210 <i class="success fa fa-long-arrow-up"></i></td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$7.45</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="odd pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000039</td>
                                            <td class=" ">May 23, 2014 11:30:12 PM</td>
                                            <td class=" ">121000208 <i class="success fa fa-long-arrow-up"></i>
                                            </td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$741.20</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="even pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000038</td>
                                            <td class=" ">May 24, 2014 10:55:33 PM</td>
                                            <td class=" ">121000203 <i class="success fa fa-long-arrow-up"></i>
                                            </td>
                                            <td class=" ">Mike Smith</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$432.26</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="odd pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000037</td>
                                            <td class=" ">May 24, 2014 10:52:44 PM</td>
                                            <td class=" ">121000204</td>
                                            <td class=" ">Mike Smith</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$333.21</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="even pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000040</td>
                                            <td class=" ">May 24, 2014 11:47:56 PM </td>
                                            <td class=" ">121000210</td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$7.45</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="odd pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000039</td>
                                            <td class=" ">May 26, 2014 11:30:12 PM</td>
                                            <td class=" ">121000208 <i class="error fa fa-long-arrow-down"></i>
                                            </td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$741.20</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="even pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000038</td>
                                            <td class=" ">May 26, 2014 10:55:33 PM</td>
                                            <td class=" ">121000203</td>
                                            <td class=" ">Mike Smith</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$432.26</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="odd pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000037</td>
                                            <td class=" ">May 26, 2014 10:52:44 PM</td>
                                            <td class=" ">121000204</td>
                                            <td class=" ">Mike Smith</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$333.21</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>

                                        <tr class="even pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000040</td>
                                            <td class=" ">May 27, 2014 11:47:56 PM </td>
                                            <td class=" ">121000210</td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$7.45</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        <tr class="odd pointer">
                                            <td class="a-center ">
                                                <input type="checkbox" class="flat" name="table_records">
                                            </td>
                                            <td class=" ">121000039</td>
                                            <td class=" ">May 28, 2014 11:30:12 PM</td>
                                            <td class=" ">121000208</td>
                                            <td class=" ">John Blank L</td>
                                            <td class=" ">Paid</td>
                                            <td class="a-right a-right ">$741.20</td>
                                            <td class=" last"><a href="#">View</a>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
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

<script src="/js/icheck.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="/js/custom.min.js"></script>
</body>
</html>