function changeCaptcha() {
    document.getElementById("captchaImg").src = "/captcha-image?" + Math.random();
}
function checkPassword(pwd) {
    if (pwd == "") {
        $("#check_message").css("color", "red");
        $("#check_message").html("密码不能为空");
        return false;
    }
    return true;
}
function checkUserName(userName) {
    if (userName == "") {
        $("#check_message").css("color", "red");
        $("#check_message").html("用户名不能为空");
        return false;
    }
    return true;
}
function checkCaptcha(captcha) {
    if (captcha == "") {
        $("#check_message").css("color", "red");
        $("#check_message").html("验证码不能为空");
        return false;
    }
    return true;
}
function checkFiled() {
    var userName = $("#account").val();
    var pwd = $("#password").val();
    console.log(userName);
    if (!checkUserName(userName)) {
        return false;
    }
    if (!checkPassword(pwd)) {
        return false;
    }
    // if(!checkCaptcha($("#captcha").val())){
    // 	return false;
    // }

    $.post("/login/checkUser",
        {
            userName: userName,
            pwd: pwd
        },
        function (data, status) {
            if (data && data) {

            }
        }
    );

    $.ajax({
        type:"POST",
        url:"/login/checkUser",
        data:{
            userName: userName,
            pwd: pwd
        },
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function(data){
            if (data && data.success) {
                window.location.href = "/index";
            } else {
                $("#check_message").css("color", "red");
                $("#check_message").html("验证用户信息失败,重试!");
            }
        },
        //调用出错执行的函数
        error: function(){
            $("#check_message").css("color", "red");
            $("#check_message").html("验证用户信息失败,重试!");
        }
    });
}