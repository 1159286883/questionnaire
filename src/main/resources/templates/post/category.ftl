<#include "/inc/layout.ftl"  />

<@layout "博客分类">

  <#include "/inc/header-panel.ftl"  />

  <div class="layui-container">
    <div class="layui-row layui-col-space15">
      <div class="layui-col-md8">
        <div class="fly-panel" style="margin-bottom: 0;">

          <div class="fly-panel-title fly-filter">
            <a href="" class="layui-this">全部问卷</a>
            <span class="fly-mid"></span>
            <a href="">星标问卷</a>
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




        </div>
      </div>



    </div>
  </div>
  <script>
    layui.cache.page = 'jie';
  </script>
</@layout>



