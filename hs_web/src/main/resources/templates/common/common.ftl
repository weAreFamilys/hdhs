<#macro timeline_dt datetime=.now>
    <#assign ct = (.now?long-datetime?long)/1000>
    <#if ct gte 86400>
        ${datetime?string("MM月dd日")}
    <#elseif ct gte 3600>
    <#--n小时前-->
        ${(ct/3600)?int}小时前
    <#elseif ct gte 60>
        <#--n分钟前-->
        ${(ct/60)?int}分钟前
    <#elseif ct gt 0>
        <#--n秒前-->
        ${ct?int}秒前
    <#else>
        刚刚
    </#if>
</#macro>