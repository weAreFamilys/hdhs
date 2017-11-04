import UserEdit from '@/pages/userEdit/userEdit'
import Home from '@/pages/home'
let userEditRouter = [
  {
    path: '/',
    name: '',
    component: Home,
    leaf: true, // 只有一级菜单
    icon: 'fa fa-user-circle',
    children: [
      {path: '/user/edit', component: UserEdit, name: '用户管理'}
    ]
  }
]

export default userEditRouter
