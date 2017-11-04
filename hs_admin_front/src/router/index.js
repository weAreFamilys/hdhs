import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login'
import userEditRouter from './userEditRouter'
import homeEditRouter from './homeEditRouter'

Vue.use(Router)

let indexRouter = [
  {
    path: '/login',
    name: '登录',
    hidden: true,
    component: Login
  }
]
let routes = []
.concat(indexRouter)
.concat(userEditRouter)
.concat(homeEditRouter)

export default new Router({
  routes
})
