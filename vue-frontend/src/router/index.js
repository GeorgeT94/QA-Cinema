import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '../pages/Homepage'
import OpeningTimes from '../pages/OpeningTimes'
import Classifications from '../pages/Classifications'
import TicketPage from '../pages/TicketPage.vue'
import MoviePage from '../pages/MoviesPage.vue'
import AboutUs from '../pages/AboutUs.vue'
import FutureReleases from '../pages/FutureReleases'
import MovieInfo from '../pages/MovieInfo'
import AdminLogin from '../pages/AdminLogin'
import AdminPage from '../pages/AdminPage'
import NowShowing from '../pages/NowShowing'
import GettingHere from '../pages/GettingHere'
import Guestbook from '../pages/Guestbook'

Vue.use(Router)
export default new Router({
    mode: "history",
    routes: [
        {
            path: "/",
            name: 'Homepage',
            component: Homepage
        },
        {
            path: '/openingTimes',
            name: 'OpeningTimes',
            component: OpeningTimes
        },
        {
            path: '/classifications',
            name: 'Classifications',
            component: Classifications
        },
        {
            path: '/ticketPage',
            name: 'TicketPage',
            component: TicketPage
        },
        {
            path: '/moviesPage',
            name: 'MoviesPage',
            component: MoviePage
        },
        {
            path: '/aboutus',
            name: 'AboutUs',
            component: AboutUs
        },
        {
            path: '/movieinfo/:id',
            name: 'MovieInfo',
            component: MovieInfo
        },
        {
            path: '/adminLogin',
            name: 'AdminLogin',
            component: AdminLogin
        },
        {
            path: '/adminPage',
            name: 'AdminPage',
            component: AdminPage
        },
        {
            path: '/current',
            name: 'NowShowing',
            component: NowShowing
        },
        {
            path: '/upcoming',
            name: 'FutureReleases',
            component: FutureReleases
        },
        {
            path: '/gettingHere',
            name: 'GettingHere',
            component: GettingHere
        },
        {
            path: '/guestbook',
            name: 'Guestbook',
            component: Guestbook
        }


    ]
})
