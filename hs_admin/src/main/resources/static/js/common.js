function notify(text) {
    if( typeof (PNotify) === 'undefined'){ return; }
    new PNotify({
        title: "提示",
        type: "notice",
        icon: true,
        animation: "fade",
        text: text,
        addclass: 'dark',
        styling: 'bootstrap3',
        hide: true,
        delay: 3000,
        remove: true,
        destroy: true
    });

};