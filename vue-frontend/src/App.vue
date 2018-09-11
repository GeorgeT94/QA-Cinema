<template>
  <div id="app">

    <Navbar/>
    <!-- <component :is="dynamicComponent"/> -->
    <router-view></router-view>
    <Footer/>
  </div>
</template>

<script>

import Navbar from './components/shellPage/Navbar.vue'
import Homepage from './pages/Homepage.vue'
import Footer from './components/shellPage/Footer.vue'


export default {
  name: 'app',
  components: {

    Navbar,
    Homepage,
    Footer
  },
  data() {
    return {
      dynamicComponent: 'Homepage'
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}
</style>
