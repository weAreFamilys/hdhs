import ProfileAdd from '@/pages/schoolProfile/profile/add'
import ProfileEdit from '@/pages/schoolProfile/profile/edit'
import ProfileList from '@/pages/schoolProfile/profile/list'
import FeatureAdd from '@/pages/schoolProfile/feature/add'
import FeatureEdit from '@/pages/schoolProfile/feature/edit'
import FeatureList from '@/pages/schoolProfile/feature/list'
import InstitutionAdd from '@/pages/schoolProfile/institution/add'
import InstitutionEdit from '@/pages/schoolProfile/institution/edit'
import InstitutionList from '@/pages/schoolProfile/institution/list'
import Home from '@/pages/home'
let schoolProfileRouter = [
  {
    path: '/',
    name: '学校概况维护',
    component: Home,
    icon: 'fa fa-folder-open',
    children: [
      // 学校简介
          {path: '/school/profile/list', component: ProfileList, name: '学校简介维护'},
          {path: '/school/profile/edit', component: ProfileEdit, name: '学校简介修改', hidden: true},
          {path: '/school/profile/add', component: ProfileAdd, name: '学校简介增加', hidden: true},
      // 组织机构维护
          {path: '/school/institution/list', component: InstitutionList, name: '机构组织维护'},
          {path: '/school/institution/edit', component: InstitutionEdit, name: '机构组织修改', hidden: true},
          {path: '/school/institution/add', component: InstitutionAdd, name: '机构组织增加', hidden: true},
      // 办学特色维护
          {path: '/school/feature/list', component: FeatureList, name: '办学特色维护'},
          {path: '/school/feature/edit', component: FeatureEdit, name: '办学特色修改', hidden: true},
          {path: '/school/feature/add', component: FeatureAdd, name: '办学特色增加', hidden: true}
    ]
  }
]
export default schoolProfileRouter
