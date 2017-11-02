<template>
  <el-row class="container">
		<el-col :span="24" class="header">
      <el-row>
        <el-col class="logo">桦树林子学校</el-col>
      </el-row>
		</el-col>
    <el-col :span="24" class="main">
      <el-aside class="aside" width="240px">
      <el-row style="height:100%">
        <el-col style="height:100%">
        <el-menu
          style="border:0;height:100%"
          default-active="1"
          background-color="#f1f2f7"
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
    <section class="content-container">
      <div class="grid-content bg-purple-light">
        <el-col :span="24">
          <el-breadcrumb separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>活动管理</el-breadcrumb-item>
          </el-breadcrumb>
        </el-col>
        <el-col :span="24" class="content-wrapper">
          <transition name="fade" mode="out-in">
            <router-view></router-view>
          </transition>
        </el-col>
      </div>
    </section>
    </el-col>
  </el-row>
</template>

<script>
  export default {
    data () {
      return {
        collapsed: false,
        sysName: '桦树林子学校'
      }
    },
    mounted () {},
    methods: {
      // 折叠导航栏
      collapse () {
        this.collapsed = !this.collapsed
      }
    }
  }
</script>
<style scoped>
.container {
  position: absolute;
  top: 0px;
  bottom: 0px;
  width: 100%;
}
.header {
  height: 60px;
  line-height: 60px;
  background: #20a0ff;
  color:#fff;
}
.header .logo {
  height:60px;
  font-size: 22px;
  padding-left:20px;
  padding-right:20px;
  width:240px;
}
.header .tools{
  padding: 0px 23px;
  width:14px;
  height: 60px;
  line-height: 60px;
  cursor: pointer;
}
.main {
  display: flex;
  position: absolute;
  top: 60px;
  bottom: 0px;
  overflow: hidden;
}
.title {
  color:#fff; 
  border-right:1px solid #f0f0f0;
  margin:0;
  padding:0;
  height:60px;
}
.aside {
  flex:0 0 230px;
	width: 230px;
  height: 100%;
}
.content-container {
  position: absolute;
  right: 0px;
  top: 0px;
  bottom: 0px;
  left: 230px;
  overflow-y: auto;
  padding: 20px;
}
.content-wrapper {
  background-color: #fff;
  box-sizing: border-box;
}
</style>
