import Vue from 'vue'
import App from './App.vue'
import router from './router'
import * as VueGoogleMaps from "vue2-google-maps";
import VueDisqus from 'vue-disqus'


Vue.config.productionTip = false

Vue.use(VueGoogleMaps, {
    load: {
        key: "AIzaSyAtgDBVbjtj6d4aahlwmWP7n4-m_ul_t6c",
        libraries: "places"
    }
});

Vue.use(VueDisqus)


new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
