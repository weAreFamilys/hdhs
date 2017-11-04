import NewsEdit from '@/pages/homeEdit/newsEdit'
import Home from '@/pages/home'
let newsEditRouter = [
  {
    path: '/',
    name: '首页信息维护',
    component: Home,
    icon: 'fa fa fa-bars',
    children: [
      {path: '/index/carosel', component: Home, name: '巨幕维护'},
      {path: '/index/news', component: NewsEdit, name: '新闻、公告、活动维护'}
    ]
  }
]

export default newsEditRouter
