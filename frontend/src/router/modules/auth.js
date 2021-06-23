const authRoutes = [
  {
    path: '/login',
    component: () => import(/* webpackChunkName: "login" */ '@/views/auth/LoginPage')
  },
  {
    path: '/join',
    component: () => import(/* webpackChunkName: "join" */ '@/views/auth/JoinPage')
  },
  {
    path: '/mypage',
    component: () => import(/* webpackChunkName: "mypage" */ '@/views/auth/Mypage')
  },
  {
    path: '/mypage/edit',
    component: () => import(/* webpackChunkName: "mypage/edit" */ '@/views/auth/MypageEdit')
  }
]

export default authRoutes
