<template>
  <div id="app">
    <Navbar/>
    <Homepage/>
  </div>
</template>

<script>
import Navbar from './components/Navbar.vue'
import Homepage from './pages/Homepage.vue'

export default {
  name: 'app',
  components: {
    Navbar,
    Homepage
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
