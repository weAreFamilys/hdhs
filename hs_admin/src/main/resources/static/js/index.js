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
function addUser() {
    var account = $("#user_add_account").val();
    var name = $("#user_add_name").val();
    var memo = $("#user_add_memo").val();
    if (!checkUserName(account)) {
        return false;
    }
    if (!checkPassword(password)) {
        return false;
    }
    // if(!checkCaptcha($("#captcha").val())){
    // 	return false;
    // }

    $.ajax({
        type:"POST",
        url:"/login/checkUser",
        data:{
            account: account,
            password: password
        },
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function(data){
            console.log(data);
            if (data && data.success) {
                window.location.href = "/index";
            } else {
                $("#check_message").css("color", "red");
                $("#check_message").html("用户名或密码错误,请重试!");
            }
        },
        //调用出错执行的函数
        error: function(){
            $("#check_message").css("color", "red");
            $("#check_message").html("验证用户信息失败,重试!");
        }
    });
}