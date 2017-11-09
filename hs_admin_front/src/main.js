// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import App from './App'
import router from './router'
import 'font-awesome/css/font-awesome.min.css'
import filter from './util/filter'

import '../static/ueditor/ueditor.config.js'
import '../static/ueditor/ueditor.all.min.js'
import '../static/ueditor/lang/zh-cn/zh-cn.js'
import '../static/ueditor/ueditor.parse.min.js'

Vue.config.productionTip = false
Object.keys(filter).forEach((key) => {
  Vue.filter(key, filter[key])
})
Vue.use(ElementUI)

// router.beforeEach((to, from, next) => {
//   if (store.state.token) {  // 通过vuex state获取当前的token是否存在
//     next();
//   }
//   else {
//       next({
//           path: '/login',
//           query: {redirect: to.fullPath}  // 将跳转的路由path作为参数，登录成功后跳转到该路由
//       })
//   }
// })

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})
