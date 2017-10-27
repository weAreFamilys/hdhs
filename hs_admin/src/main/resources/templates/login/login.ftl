<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/css/nprogress.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="/css/custom.min.css" rel="stylesheet">
    <title>桦树林子学校</title>
</head>
<body class="login">
<div>
    <div class="login_wrapper">
        <div class="login_form">
            <section class="login_content">
                <form id="login_form" method="post">
                    <h1>后台管理系统</h1>
                    <div>
                        <input id="account" type="text" class="form-control" placeholder="用户名" />
                    </div>
                    <div>
                        <input id="password" type="password" class="form-control" placeholder="密 码" />
                    </div>
                    <div id="check_message" style="height: 20px; text-align: left;">

                    </div>
                    <div style="margin-top: 10px;">
                        <button onclick="checkFiled()" type="button" class="btn btn-primary">登 录</button>
                        <button type="reset" class="btn btn-primary">重 置</button>
                    </div>
                    <div class="clearfix"></div>

                    <div class="separator">
                        <div class="clearfix"></div>
                        <br />
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
<script src="/js/jquery.min.js"></script>
<script src="/js/login.js"></script>
</body>
</html>