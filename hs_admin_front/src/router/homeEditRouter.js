import CarouselEdit from '@/pages/homeEdit/carousel/edit'
import CarouselAdd from '@/pages/homeEdit/carousel/add'
import CarouselList from '@/pages/homeEdit/carousel/list'

import SchoolLifeEdit from '@/pages/homeEdit/schoolLife/edit'
import SchoolLifeAdd from '@/pages/homeEdit/schoolLife/add'
import SchoolLifeList from '@/pages/homeEdit/schoolLife/list'

import NewsEdit from '@/pages/homeEdit/news/edit'
import NewsAdd from '@/pages/homeEdit/news/add'
import NewsList from '@/pages/homeEdit/news/list'

import Home from '@/pages/home'
let newsEditRouter = [
  {
    path: '/',
    name: '首页信息维护',
    component: Home,
    icon: 'fa fa fa-bars',
    children: [
      // 首页维护 - 轮播维护
      {path: '/home/carousel/list', component: CarouselList, name: '首页轮播维护'},
      {path: '/home/carousel/edit', component: CarouselEdit, name: '首页轮播修改', hidden: true},
      {path: '/home/carousel/add', component: CarouselAdd, name: '首页轮播增加', hidden: true},
      // 首页维护 - 校园生活
      {path: '/home/schoolLife/list', component: SchoolLifeList, name: '校园生活维护'},
      {path: '/home/schoolLife/edit', component: SchoolLifeEdit, name: '校园生活修改', hidden: true},
      {path: '/home/schoolLife/add', component: SchoolLifeAdd, name: '校园生活增加', hidden: true},
      // 首页维护 - 新闻维护
      {path: '/home/news/list', component: NewsList, name: '新闻、公告、活动维护'},
      {path: '/home/news/edit', component: NewsEdit, name: '新闻、公告、活动修改', hidden: true},
      {path: '/home/news/add', component: NewsAdd, name: '新闻、公告、活动增加', hidden: true}
    ]
  }
]

export default newsEditRouter
