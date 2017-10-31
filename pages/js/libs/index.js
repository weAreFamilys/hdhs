$(function () {

});

//登录
function sendMsg(){
    //按钮类型（注册、登录）
    alert(btntype);
    var name = $("#usrname").val();
    alert("name is"+ name);
    var pwd = $("#psw").val();
    alert("pwd is" + pwd);
    $.ajax({
        type:"POST",
        // url:"#",
        data:{
            username:name,
            possword:pwd,
        },
        dataType:"json",

        success:function(data){
          console.log(data);
            if (data && data.success) {
                alert("success");
            } else {
                alert(data.msg);
            }
        },
        error:function(data){
            alert("error");
        }
    });
}