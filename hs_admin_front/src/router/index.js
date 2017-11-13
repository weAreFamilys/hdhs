import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login'
import userEditRouter from './userEditRouter'
import homeEditRouter from './homeEditRouter'
import resourceEditRouter from './resourceEditRouter'
// import testRouter from './testRouter'
import schoolProfileRouter from './schoolProfileRouter'
import partybuildRouter from './partybuildRouter'
import educationRouter from './educationRouter'

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
.concat(resourceEditRouter)
.concat(schoolProfileRouter)
.concat(partybuildRouter)
.concat(educationRouter)
// .concat(testRouter)

export default new Router({
  routes
})
