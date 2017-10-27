<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="/css/animate.min.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="/css/custom.min.css" rel="stylesheet">
    <title>桦树林子学校</title>
</head>
<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form>
                    <h1>后台管理系统</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="用户名" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="密码" />
                    </div>
                    <div>
                        <button onclick="valid()" type="button" class="btn btn-primary">登 录</button>
                    </div>
                    <div class="clearfix"></div>
                    <div class="separator">
                        <div class="clearfix"></div>
                        <br/>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
</body>
</html>
<script language="JavaScript">
    function valid() {
        window.location.href = "/index"
    }
</script>