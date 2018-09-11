<template>
  <div id="upcoming">
    <h3>Future Releases</h3>
    <div class="container">
      <div v-for="movie in upcoming.data.results" class="movie-info"  v-bind:key="movie.title">
        <h3>{{movie.name}}</h3>
        <router-link v-bind:to="'/movieinfo/' + movie.id">
          <img class="movie-image" v-bind:src="'https://image.tmdb.org/t/p/original' + movie.poster_path"><br>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'UpcomingMovies',
  data() {
    return {
      upcoming: null,
    }
  },
  mounted () {
    const axios = require('axios');
    axios
      .get(' https://api.themoviedb.org/3/movie/upcoming?api_key=cbac8005b1d7ddb6c8dcf5b8f4179220&language=en-US&page=1')
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

#listing{
  text-align: left;
  color: white;
  padding-left: 15%;
  padding-right: 15%;
  padding-top: 2%;
  padding-bottom: 2%;
  background-color: #2A1B3D;
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
</style>
