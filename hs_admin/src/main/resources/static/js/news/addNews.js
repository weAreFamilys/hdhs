$(function () {
    var ue = UE.getEditor('editor');
});
function addNews() {
    var html = UE.getEditor('editor').getContent();
    if (html == '') {
        notify('文章内容不能为空。');
        return;
    }
    var account = $("#account").val();
    var name = $("#name").val();
    // var memo = $("#memo").val();
    // if(account == ''){
    //     return;
    // }
    // if(name == ''){
    //     return;
    // }
    // $.ajax({
    //     type:"POST",
    //     url:"/user/addCommit",
    //     data:{
    //         account: account,
    //         name: name,
    //         memo: memo
    //     },
    //     datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
    //     //成功返回之后调用的函数
    //     success: function(data){
    //         console.log(data);
    //         if (data && data.success) {
    //             window.location.href = "/index";
    //         } else {
    //             alert(data.msg);
    //         }
    //     },
    //     //调用出错执行的函数
    //     error: function(){
    //         alert("错误");
    //     }
    // });
}