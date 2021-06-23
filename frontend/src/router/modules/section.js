const sectionRoutes = [
  {
    path: '/sections',
    component: () => import(/* webpackChunkName: "sections" */ '@/views/section/SectionPage')
  }
]
export default sectionRoutes
