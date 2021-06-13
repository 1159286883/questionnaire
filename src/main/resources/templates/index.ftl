<#include "/inc/layout.ftl"  />
<@layout "首页">

    <#include "/inc/header-panel.ftl"  />

    <div class="layui-container">
        <div class="layui-row layui-col-space15">
            <div class="layui-col-md8">
                <div class="fly-panel" style="margin-bottom: 0;">

                    <div class="fly-panel-title fly-filter">
                        <a href="" class="layui-this">全部问卷</a>
                    </div>

                    <ul class="fly-list">
                        <#list pageData.records as questionnaire>
                        <li>
                            <a href="/user/${questionnaire.authorId}" class="fly-avatar">
                                <img src="${questionnaire.authorAvatar}" alt="${questionnaire.authorName}">
                            </a>
                            <h2>
                                <a class="layui-badge">${questionnaire.status}</a>
                                <a href="/questionnaire/${questionnaire.id}">${questionnaire.title}</a>
                            </h2>
                            <div class="fly-list-info">
                                <a href="/user/${questionnaire.authorId}" link>
                                    <cite>${questionnaire.authorName}</cite>
                                </a>

                                <span class="fly-list-nums">
                                <i class="iconfont icon-pinglun1" title="回答"></i> 答卷:66
                                </span>
                                <span>${questionnaire.created?string("yyyy-MM-dd")}</span>

                            </div>

                        </li>
                        </#list>
                    </ul>



                </div>
            </div>
        </div>
    </div>

</@layout>