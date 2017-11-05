import NewsEdit from '@/pages/homeEdit/news/edit'
import CarouselEdit from '@/pages/homeEdit/carousel/edit'
import CarouselAdd from '@/pages/homeEdit/carousel/add'
import Home from '@/pages/home'
let newsEditRouter = [
  {
    path: '/',
    name: '首页信息维护',
    component: Home,
    icon: 'fa fa fa-bars',
    children: [
      {path: '/home/carousel/edit', component: CarouselEdit, name: '首页轮播维护'},
      {path: '/home/carousel/add', component: CarouselAdd, name: '首页轮播增加', hidden: true},
      {path: '/home/news/edit', component: NewsEdit, name: '新闻、公告、活动维护'}
    ]
  }
]

export default newsEditRouter
