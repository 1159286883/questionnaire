<#include "/inc/layout.ftl"  />
<@layout "首页">

    <#include "/inc/header-panel.ftl"  /><#---->

    <div class="layui-container"><#---->
        <div class="layui-row layui-col-space15">
            <div class="layui-col-md8">




                <div class="fly-panel" style="margin-bottom: 0;">

                    <div class="fly-panel-title fly-filter">
                        <a href="" class="layui-this">全部问卷</a>
                        <span class="fly-mid"></span>
                        <a href="">我的问卷</a>
                        <span class="fly-mid"></span>
                        <a href="">已发布问卷</a>
                        <span class="fly-mid"></span>
                        <a href="">待发布问卷</a>
                        <span class="fly-filter-right layui-hide-xs">
            <a href="" class="layui-this">按最新</a>
            <span class="fly-mid"></span>
            <a href="">按热度</a>
          </span>
                    </div>

                    <ul class="fly-list">
                        <li>
                            <a href="user/home.html" class="fly-avatar">
                                <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" alt="贤心">
                            </a>
                            <h2>
                                <a class="layui-badge">分享</a>
                                <a href="jie/detail.html">关于疫情防控的问卷</a>
                            </h2>
                            <div class="fly-list-info">
                                <a href="user/home.html" link>
                                    <cite>小明</cite>
                                    <!--
                                    <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                                    <i class="layui-badge fly-badge-vip">VIP3</i>
                                    -->
                                </a>
                                <span>刚刚</span>

                                <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻">ID:12366666</span>
                                <!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
                                <span class="fly-list-nums">
                <i class="iconfont icon-pinglun1" title="回答"></i> 答卷:66
              </span>
                            </div>
                            <div class="fly-list-badge">
                                <!--<span class="layui-badge layui-bg-red">精帖</span>-->
                            </div>
                        </li>
                    </ul>
                </div>

            </div>
        </div>
    </div>

</@layout>