const stationRoutes = [
  {
    path: '/stations',
    component: () => import(/* webpackChunkName: "stations" */ '@/views/station/StationPage')
  }
]
export default stationRoutes
