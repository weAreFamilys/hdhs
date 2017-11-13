// 验证中文名称
function isChinaName(name) {
    var pattern = /^[\u4E00-\u9FA5]{1,6}$/;
    return pattern.test(name);
}
// 验证身份证
function isCardNo(card) {
    var pattern = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    return pattern.test(card);
}
//校验登录名：只能输入5-20个以字母开头、可带数字、“_”、“.”的字串
function isRegisterUserName(s){
    var patrn=/^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19}$/;
    if (!patrn.exec(s)) return false
    return true
}
// 只能输入6-20个字母、数字、下划线
function isPasswd(s) {
    var patrn=/^(\w){6,20}$/;
    if (!patrn.exec(s)) return false
    return true
}

// 登录
function login() {
    var account = $.trim($("#login_account").val());
    var pwd = $.trim($("#login_pwd").val());
    if (!isRegisterUserName(account)) {
        $("#login_err_tips").html('用户名格式有误,重新输入!');
        $('#login_account').focus();
        return;
    }
    if (!isPasswd(pwd)) {
        $("#login_err_tips").html('密码格式有误,重新输入!');
        $('#login_pwd').focus();
        return;
    }
    $.ajax({
        type: "POST",
        url: "/user/login",
        data: {
            account: account,
            pwd: pwd
        },
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function (data) {
            console.log(data);
            if (data && data.success) {
                window.location.href = "/index";
            } else {
                $("#login_err_tips").html(data.msg);
            }
        },
        //调用出错执行的函数
        error: function () {
            $("#login_err_tips").html('登录失败,请重试!');
        }
    });
}

// 注册
function regist() {
    var account = $.trim($("#regist_account").val());
    var name = $.trim($("#regist_name").val());
    var idcard_no = $.trim($("#regist_idcard").val());
    var pwd = $.trim($("#regist_pwd").val());
    var pwd_repeat = $.trim($("#regist_pwd_repeat").val());

    if (!isRegisterUserName(account)) {
        $("#regist_err_tips").html('用户名输入有误,重新输入!');
        $('#regist_account').focus();
        return;
    }
    if (!isChinaName(name)) {
        $("#regist_err_tips").html('请输入正确姓名!');
        $('#regist_name').focus();
        return;
    }
    if (!isCardNo(idcard_no)) {
        $("#regist_err_tips").html('请输入正确身份证号!');
        $('#regist_idcard').focus();
        return;
    }
    if (!isPasswd(pwd)) {
        $("#regist_err_tips").html('密码格式输入有误,重新输入!');
        $('#regist_pwd').focus();
        return;
    }
    if (pwd_repeat == '') {
        $("#regist_err_tips").html('请再次输入密码!');
        $('#regist_pwd_repeat').focus();
        return;
    }
    if (pwd != pwd_repeat) {
        $("#regist_err_tips").html('两次密码不一致!');
        return;
    }

    $.ajax({
        type: "POST",
        url: "/user/regist",
        data: {
            account: account,
            name: name,
            pwd: pwd,
            idcard_no: idcard_no
        },
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function (data) {
            console.log(data);
            if (data && data.success) {
                window.location.href = "/index";
            } else {
                $("#regist_err_tips").html(data.msg);
            }
        },
        //调用出错执行的函数
        error: function () {
            $("#regist_err_tips").html('注册失败,请重试!');
        }
    });
}

$(document).ready(function () {
    $("#registBtn").on('click', function () {
        regist();
    });
    $("#loginBtn").on('click', function () {
        login();
    });
    $('li.dropdown').mouseover(function () {
        $(this).addClass('open');
    }).mouseout(function () {
        $(this).removeClass('open');
    });
});
