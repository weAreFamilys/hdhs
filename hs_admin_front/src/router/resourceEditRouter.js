import CourseAdd from '@/pages/resourceEdit/course/add'
import CourseEdit from '@/pages/resourceEdit/course/edit'
import CourseList from '@/pages/resourceEdit/course/list'
import Home from '@/pages/home'
let resourcesRouter = [
  {
    path: '/',
    name: '教学资源维护',
    component: Home,
    icon: 'fa fa-folder-open',
    children: [
      {path: '/resource/course/list', component: CourseList, name: '学科维护'},
      {path: '/resource/course/edit', component: CourseEdit, name: '学科修改', hidden: 'true'},
      {path: '/resource/course/add', component: CourseAdd, name: '学科增加', hidden: 'true'}
    ]
  }
]

export default resourcesRouter
