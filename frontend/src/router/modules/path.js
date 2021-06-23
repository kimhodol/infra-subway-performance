const pathRoutes = [
  {
    path: '/path',
    component: () => import(/* webpackChunkName: "path" */ '@/views/path/PathPage')
  }
]
export default pathRoutes
