import CarouselList from '@/pages/homeEdit/carousel/list'
import Home from '@/pages/home'
let userEditRouter = [
  {
    path: '/',
    name: '学校概况维护',
    component: Home,
    icon: 'fa fa fa-bars',
    children: [
      // 首页维护 - 轮播维护
      {path: '/home/carousel/list1', component: CarouselList, name: '学校简介'},
      {path: '/home/carousel/edit1', component: CarouselList, name: '组织机构维护'},
      {path: '/home/carousel/add1', component: CarouselList, name: '办学特色维护'}
    ]
  },
  {
    path: '/',
    name: '党建工作维护',
    component: Home,
    icon: 'fa fa-bars',
    children: [
      {path: '/home/carousel/list3', component: CarouselList, name: '工作通知维护'},
      {path: '/home/carousel/edit3', component: CarouselList, name: '党员风采维护'},
      {path: '/home/carousel/add3', component: CarouselList, name: '支部建设维护'}
    ]
  },
  {
    path: '/',
    name: '教育科研维护',
    component: Home,
    icon: 'fa fa-bars',
    children: [
      {path: '/home/carousel/list4', component: CarouselList, name: '课题研究维护'},
      {path: '/home/carousel/edit4', component: CarouselList, name: '科研简讯维护'},
      {path: '/home/carousel/add4', component: CarouselList, name: '科研指南维护'}
    ]
  }
]

export default userEditRouter
