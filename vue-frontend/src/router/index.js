import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '../pages/Homepage'
import OpeningTimes from '../pages/OpeningTimes'

Vue.use(Router)

export default new Router({
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
        }
    ]
})
