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
          :default-active="$route.path"
          router
          background-color="#f1f2f7"
          >
          <template v-for="(item, index) in $router.options.routes" v-if="!item.hidden">
						<el-submenu :index = "index+''" v-if = "!item.leaf">
							<template slot="title">
                <i :class="item.icon"></i>
                {{item.name}}
              </template>
							<el-menu-item 
                v-for = "child in item.children" 
                :index = "child.path" 
                :key = "child.path" 
                v-if = "!child.hidden">
                  <i class="el-icon-arrow-right"></i>
                  {{child.name}}
              </el-menu-item>
						</el-submenu>
						<el-menu-item
            v-if = "item.leaf && item.children.length > 0" 
            :index = "item.children[0].path">
              <i :class="item.icon"></i>
              {{item.children[0].name}}
            </el-menu-item>
					</template>
        </el-menu>
      </el-col>
      </el-row>
    </el-aside>
    <section class="content-container">
      <el-col :span="24">
        <el-breadcrumb separator="/">
          <el-breadcrumb-item v-for="item in $route.matched" :key="item.path">
            {{ item.name }}
          </el-breadcrumb-item>
        </el-breadcrumb>
      </el-col>
      <el-col :span="24" class="content-wrapper">
        <transition name="fade" mode="out-in">
          <router-view></router-view>
        </transition>
      </el-col>
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
.fa {
  font-size: 18px;
  display: inline-block;
  margin-right: 10px;
  height: 18px;
}
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
