<#--<div style="width:100%;height: 100%;background-color: #122b40">-->

    <div class="container">
        <div class="page-header">
            <h3><span style="color: #428bca; letter-spacing: 10px;" class="glyphicon glyphicon-camera"></span>校园生活
                <small>Campus Life</small>
            </h3>
        </div>
        <div class="row">
        <#list schoolLifeList as schoolLife>
            <div class="col-md-4">
                <div class="thumbnail">
                    <div class="image view view-first">
                        <img style="width: 100%;height: 220px;display: block;" src="${schoolLife.s_img}" alt="">
                    </div>
                    <h3 style="text-align: center;width: 100%;">
                        <#if (schoolLife.s_title?length lt 12)>
                        ${schoolLife.s_title?default('')}
                        <#else>
                        ${schoolLife.s_title[0..11]}...
                        </#if>
                    </h3>
                    <p style="padding: 10px; line-height: 25px;height: 80px;overflow: hidden; text-align: center">
                        <#if (schoolLife.s_desc?length lt 100)>
                        ${schoolLife.s_desc?default('')}
                        <#else>
                        ${schoolLife.s_desc[0..99]}...
                        </#if>
                    </p>
                </div>
            </div>
        </#list>

        </div>
    </div>
<#--</div>-->