<template>
  <div>
    <h1>Movie Gallery</h1>
    <Listing2 title="Whats on" v-bind:movieList="movieList"/>
    <Listing2 title="Coming Soon" v-bind:movieList="movieList"/>
  </div>
</template>

<script>
import Listing2 from '../components/Listing2.vue'

export default {
  name: 'MoviesPage',
  data() {
    return {
      movieList: [
        {
          name: "Deadpool"
        },
        {
          name: "Avengers"
        },
        {
          name: "Deadpool"
        },
        {
          name: "Deadpool"
        },
        {
          name: "Deadpool"
        },
        {
          name: "Deadpool"
        },
        {
          name: "Deadpool"
        },
        {
          name: "Deadpool"
        },
      ]
    }
  },
  components: {
    Listing2
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1{
  margin-left: 15%;
  text-decoration: underline;
  margin-top: 2%;
  margin-bottom: 2%;
}
</style>
