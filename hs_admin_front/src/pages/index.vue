<template>
  <el-container class="container">
    <el-aside class="aside" width="240px">
      <div style="height:60px;"></div>
      <el-row>
        <el-col>
        <el-menu
          style="border:0"
          default-active="1"
          background-color="#fff"
          >
          <el-menu-item index="1">
            <i class="el-icon-edit"></i>
            <span slot="title">用户管理</span>
          </el-menu-item>
          <el-submenu index="2">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>首页信息维护</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="2-1"><i class="el-icon-caret-right"></i>巨幕维护</el-menu-item>
              <el-menu-item index="2-2"><i class="el-icon-caret-right"></i>新闻、公告、活动维护</el-menu-item>
              <el-menu-item index="2-3"><i class="el-icon-caret-right"></i>校园风采维护</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>学校概况维护</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="3-1"><i class="el-icon-caret-right"></i>学校简介维护</el-menu-item>
              <el-menu-item index="3-2"><i class="el-icon-caret-right"></i>组织机构维护</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="4">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>党建工作维护</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="4-1"><i class="el-icon-caret-right"></i>学校简介维护</el-menu-item>
              <el-menu-item index="4-2"><i class="el-icon-caret-right"></i>组织机构维护</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="5">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>学校德育维护</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="5-1"><i class="el-icon-caret-right"></i>学校简介维护</el-menu-item>
              <el-menu-item index="5-2"><i class="el-icon-caret-right"></i>组织机构维护</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
        </el-menu>
      </el-col>
      </el-row>
    </el-aside>
    <el-container>
      <el-header class="header">
      </el-header>
      <el-main class="main">
        <el-breadcrumb separator-class="el-icon-arrow-right">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item>活动管理</el-breadcrumb-item>
          <el-breadcrumb-item>活动列表</el-breadcrumb-item>
          <el-breadcrumb-item>活动详情</el-breadcrumb-item>
        </el-breadcrumb>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
  export default {
    data () {
      return {
      }
    },
    mounted () {},
    methods: {
    }
  }
</script>
<style>
.container {
  position: absolute;
  height:100%;
  width:100%
}
.main {
  width:100%;
  height:100%;
  background-color:#fff
}
.header {
  background-color:#f0f0f0;
  height:50px;
  width:100%;
}
.title {
  color:#fff; 
  border-right:1px solid #f0f0f0;
  margin:0;
  padding:0;
  height:60px;
}
.aside {
  background-color:#fff;
  overflow-x:hidden;
  height:100%;
  border-right:1px solid #E6EBF5;
}
</style>
