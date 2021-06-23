const mapRoutes = [
  {
    path: '/maps',
    component: () => import(/* webpackChunkName: "maps" */ '@/views/map/MapPage')
  }
]
export default mapRoutes
