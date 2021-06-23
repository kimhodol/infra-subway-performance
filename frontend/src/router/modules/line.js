const lineRoutes = [
  {
    path: '/lines',
    component: () => import(/* webpackChunkName: "lines" */ '@/views/line/LinePage')
  }
]
export default lineRoutes
