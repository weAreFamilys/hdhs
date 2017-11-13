import BuildAdd from '@/pages/partyBuildEdit/build/add'
import BuildEdit from '@/pages/partyBuildEdit/build/edit'
import BuildList from '@/pages/partyBuildEdit/build/list'
import InformationAdd from '@/pages/partyBuildEdit/information/add'
import InformationEdit from '@/pages/partyBuildEdit/information/edit'
import InformationList from '@/pages/partyBuildEdit/information/list'
import PartyMemberAdd from '@/pages/partyBuildEdit/partyMember/add'
import PartyMemberEdit from '@/pages/partyBuildEdit/partyMember/edit'
import PartyMemberList from '@/pages/partyBuildEdit/partyMember/list'
import Home from '@/pages/home'
let partyBuildRouter = [
  {
    path: '/',
    name: '党建工作维护',
    component: Home,
    icon: 'fa fa-folder-open',
    children: [
      // 支部建设维护
          {path: '/party/build/list', component: BuildList, name: '支部建设维护'},
          {path: '/party/build/edit', component: BuildEdit, name: '支部建设修改', hidden: true},
          {path: '/party/build/add', component: BuildAdd, name: '支部建设增加', hidden: true},
      // 工作通知维护
          {path: '/party/information/list', component: InformationList, name: '工作通知维护'},
          {path: '/party/information/edit', component: InformationEdit, name: '工作通知修改', hidden: true},
          {path: '/party/information/add', component: InformationAdd, name: '工作通知增加', hidden: true},
      // 党员风采维护
          {path: '/party/partyMember/list', component: PartyMemberList, name: '党员风采维护'},
          {path: '/party/partyMember/edit', component: PartyMemberEdit, name: '党员风采修改', hidden: true},
          {path: '/party/partyMember/add', component: PartyMemberAdd, name: '党员风采增加', hidden: true}
    ]
  }
]
export default partyBuildRouter
