import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login'
import Home from '@/pages/home'
// import loginRouter from './loginRouter'

Vue.use(Router)

let indexRouter = [
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/home',
    name: 'home',
    component: Home
  }]
let routes = []
.concat(indexRouter)
// .concat(loginRouter)

export default new Router({
  routes
})
