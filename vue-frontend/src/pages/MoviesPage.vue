<template>
  <div>
    <h1>Movie Gallery</h1>
    <PopularMovies />
  </div>

</template>

<script>
import PopularMovies from "../components/listings/PopularMovies.vue"


export default {
  name: 'MoviesPage',
  components:{
    PopularMovies
  },
  data() {
    return {

    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
