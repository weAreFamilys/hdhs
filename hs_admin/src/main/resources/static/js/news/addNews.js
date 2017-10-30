$(function () {
    var ue = UE.getEditor('editor');
});
function addNews() {
    var content = UE.getEditor('editor').getContent();
    if (content == '') {
        notify('文章内容不能为空。');
        return;
    }
    var title = $("#title").val();
    var type = $("#type").val();
    var briefIntro = $("#briefIntro").val();
    $.ajax({
        type:"POST",
        url:"/news/addCommit",
        data:{
            title: title,
            type: type,
            content: content,
            briefIntro: briefIntro
        },
        datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success: function(data){
            console.log(data);
            if (data && data.success) {
                notify(data.msg,'success');
                setTimeout(function () {
                    window.location.href = '/news/list';
                }, 2000);
            } else {
                notify(data.msg);
            }
        },
        //调用出错执行的函数
        error: function(){
            alert("错误");
        }
    });
}