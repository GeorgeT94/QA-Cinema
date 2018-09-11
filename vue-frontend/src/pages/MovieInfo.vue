<template>
    <div>
        <div class="movie-title">{{movie.original_title}}</div>
        <img class="movie-image" v-bind:src="'https://image.tmdb.org/t/p/original' + movie.poster_path">
        <div class="movie-description">{{ movie.overview }}</div>
    </div>    
</template>

<script>
export default {
    name: 'MovieInfo',
    data(){
          return {
            movie: null,
            id: null
          }
    },
      
    created: function(){

        this.id = this.$route.params.id
    },

    mounted () {
    const axios = require('axios');
    axios
      .get('  https://api.themoviedb.org/3/movie/'+ this.id +'?api_key=cbac8005b1d7ddb6c8dcf5b8f4179220&language=en-US')
      .then(response => (this.movie = response.data))

  },
}
</script>

<style scoped>

.movie-image{
    width:500px;
}

</style>