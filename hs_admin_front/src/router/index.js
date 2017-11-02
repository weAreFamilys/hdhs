import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login'
import userRouter from './userRouter'

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
.concat(userRouter)

export default new Router({
  routes
})
