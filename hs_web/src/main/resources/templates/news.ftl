<div class="container">
    <div class="row news">
        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-cd"></span>校园新闻
                    <small>Campus News</small>
                </h3>
            </div>

            <ul class="news-ul">
            <#if (newsList?size > 0)>
                <#list newsList as news>
                    <li class="news-li news-title">
                        <span class="news-title-left">
                            <a href="/news/detail?id=${news.n_id?default('')}">
                                <#if (news.n_title?length lt 19)>
                                ${news.n_title}
                                <#else>
                                ${news.n_title[0..18]}...
                                </#if>
                            </a>
                        </span>
                        <span class="news-date">
                            <@timeline_dt datetime=news.n_create_time></@timeline_dt>
                        </span>
                    </li>
                </#list>
            </#if>
            </ul>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>
        </div>
        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-volume-up"></span>通知公告
                    <small>Public Notice</small>
                </h3>
            </div>
            <ul class="news-ul">
            <#if (noticeList?size > 0)>
                <#list noticeList as notice>
                    <li class="news-li news-title">
                        <span class="news-title-left">
                            <a href="/news/detail?id=${notice.n_id?default('')}">
                                <#if (notice.n_title?length lt 19)>
                                ${notice.n_title}
                                <#else>
                                ${notice.n_title[0..18]}...
                                </#if>
                            </a>
                        </span>
                        <span class="news-date">
                            <@timeline_dt datetime=notice.n_create_time></@timeline_dt>
                        </span>
                    </li>
                </#list>
            </#if>
            </ul>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>
        </div>

        <div class="col-sm-6 col-md-4">
            <div class="page-header">
                <h3><span style="color: #428bca;letter-spacing: 10px;" class="glyphicon glyphicon-education"></span>校园活动
                    <small>Campus Activities</small>
                </h3>
            </div>
            <div class="news-ul">
            <#list activityList as activity>
                <div class="media" style="height: 95px;">
                    <div class="media-left">
                        <a href="/news/detail?id=${activity.n_id?default('')}">
                            <img width="120" height="85" class="media-object" src="${activity.n_img?default('')}" alt="">
                        </a>
                    </div>
                    <div class="media-body">
                        <a href="/news/detail?id=${activity.n_id?default('')}">
                            <h5 class="media-heading">
                                <#if (activity.n_title?length lt 15)>
                                    ${activity.n_title?default('')}
                                <#else>
                                    ${activity.n_title[0..14]}...
                                </#if>
                            </h5>
                        </a>
                        <p>
                            ${activity.n_desc?default('')}
                        </p>
                    </div>
                </div>
            </#list>
            </div>
            <hr/>
            <div class="news-more">
                <a href="#">继续浏览 <span class="glyphicon glyphicon-menu-right more-icon"></span></a>
            </div>

        </div>
    </div>
</div>