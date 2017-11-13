import GuidAdd from '@/pages/educationEdit/guid/add'
import GuidEdit from '@/pages/educationEdit/guid/edit'
import GuidList from '@/pages/educationEdit/guid/list'
import ResearchAdd from '@/pages/educationEdit/research/add'
import ResearchEdit from '@/pages/educationEdit/research/edit'
import ResearchList from '@/pages/educationEdit/research/list'
import SketchAdd from '@/pages/educationEdit/sketch/add'
import SketchEdit from '@/pages/educationEdit/sketch/edit'
import SketchList from '@/pages/educationEdit/sketch/list'
import Home from '@/pages/home'
let educationRouter = [
  {
    path: '/',
    name: '教育科研维护',
    component: Home,
    icon: 'fa fa-folder-open',
    children: [
      // 科研指南维护
          {path: '/education/guid/list', component: GuidList, name: '科研指南维护'},
          {path: '/education/guid/edit', component: GuidEdit, name: '科研指南修改', hidden: true},
          {path: '/education/guid/add', component: GuidAdd, name: '科研指南增加', hidden: true},
      // 课题研究维护
          {path: '/education/research/list', component: ResearchList, name: '课题研究维护'},
          {path: '/education/research/edit', component: ResearchEdit, name: '课题研究修改', hidden: true},
          {path: '/education/research/add', component: ResearchAdd, name: '课题研究增加', hidden: true},
      // 科研简讯维护
          {path: '/education/sketch/list', component: SketchList, name: '科研简讯维护'},
          {path: '/education/sketch/edit', component: SketchEdit, name: '科研简讯修改', hidden: true},
          {path: '/education/sketch/add', component: SketchAdd, name: '科研简讯增加', hidden: true}
    ]
  }
]
export default educationRouter
