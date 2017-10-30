function notify(text,addclass) {
    if( typeof (PNotify) === 'undefined'){ return; }

    if(type == ''){
        addclass = 'dark'
    } else if (type == 'success') {
        addclass = ''
    }
    new PNotify({
        title: "消息提示",
        type: 'notify',
        icon: true,
        animation: "fade",
        text: text,
        addclass: addclass,
        styling: 'bootstrap3',
        hide: true,
        delay: 2000,
        remove: true,
        destroy: true
    });
}