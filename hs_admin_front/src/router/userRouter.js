import UserEdit from '@/pages/user/userEdit'
import Home from '@/pages/home'
let userRouter = [
  {
    path: '/',
    name: '',
    component: Home,
    leaf: true, // 只有一级菜单
    icon: 'fa fa-user-circle',
    children: [
      {path: '/user/edit', component: UserEdit, name: '用户管理'}
    ]
  },
  {
    path: '/',
    name: '首页信息维护',
    component: Home,
    icon: 'fa fa fa-bars',
    children: [
      {path: '/index/carolel', component: UserEdit, name: '巨幕维护'},
      {path: '/index/new', component: UserEdit, name: '新闻、公告、活动维护'}
    ]
  }
]

export default userRouter
