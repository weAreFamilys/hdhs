<#if (carouselList?size > 0)>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <#list carouselList as carousel>
            <li data-slide-to="${carousel_index}" <#if (carousel_index == 0)>class="active"</#if>></li>
        </#list>
    </ol>
    <div class="carousel-inner" role="listbox">
        <#list carouselList as carousel>
            <div class="item <#if (carousel_index == 0)>active</#if>">
                <img src="${carousel.c_img}"/>

                <div class="container">
                    <div class="carousel-caption">

                        <h1>${carousel.c_title?default('')}</h1>
                        <p>${carousel.c_desc?default('')}</p>
                        <#if (carousel.c_content != '')>
                            <p><a class="btn btn-lg btn-primary" href="#" role="button">详细信息</a></p>
                        </#if>
                    </div>
                </div>
            </div>
        </#list>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">前翻</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">后翻</span>
    </a>
</div>
<#else>
<div style="height: 300px; background-color: #eeeeee"></div>
</#if>