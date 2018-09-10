<template>
  <div id="popular">
    <h3>Popular Releases</h3>
    <div class="container">
      <div v-for="movie in upcoming.data.results" class="movie-info"  v-bind:key="movie.title">
        <h4>{{movie.title}}</h4>
        <router-link v-bind:to="'/movieinfo/' + movie.id">
          <img class="movie-image" v-bind:src="'https://image.tmdb.org/t/p/original' + movie.poster_path"><br>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: 'PopularMovies',
        data() {
            return {
                upcoming: null,
            }
        },
        mounted () {
            const axios = require('axios');
            axios
                .get(' http://127.0.0.1:8080/tmdb/popular')
                .then(response => (this.upcoming = response))
        },
        methods: {
        }
    }
</script>

<style scoped>
  .container {
    display: flex;
    flex-flow: row wrap;
    width: 100%;
  }
  /* Medium screens */
  @media all and (max-width: 800px) {
    .container {
      /* When on medium sized screens, we center it by evenly distributing empty space around items */
      justify-content: space-around;
    }
  }
  /* Small screens */
  @media all and (max-width: 500px) {
    .container {
      /* On small screens, we are no longer using row direction but column */
      flex-direction: column;
    }
  }
  .movie-info{
    padding:20px;
  }
  .movie-image{
    width:300px;
  }

  td{
    text-align: center;
    padding-top: 2%;
    padding-left: 2%;
    padding-right: 2%;
  }
  img{
    width: 150px;
  }
  table{
    width: 50%;
  }

  #popular{
    text-align: left;
    color: black;
    padding-left: 2%;
    padding-right: 2%;
    padding-top: 2%;
    padding-bottom: 2%;
    background-color: White;
  }

  img:hover {
    opacity: 0.5;
    filter: alpha(opacity=50); /* For IE8 and earlier */
  }
</style>