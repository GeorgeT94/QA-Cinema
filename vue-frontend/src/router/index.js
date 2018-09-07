import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '../pages/Homepage'
import OpeningTimes from '../pages/OpeningTimes'
import Classifications from '../pages/Classifications'
import TicketPage from '../pages/TicketPage.vue'
import MoviePage from '../pages/MoviesPage.vue'

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
        }

    ]
})