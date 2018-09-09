<template>
  <div id="listing">
    <h3>{{title}}</h3>
    <div class="singleMovie" v-for="movie in movieList">
      <router-link to="/movieInfo">
            <img src="../assets/Deadpool-poster.jpg"><br>
            <a class="social-icon">{{movie.name}}</a>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Listing2',
  props: {
    title: String,
    movieList: Array
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#listing{
  text-align: left;
  color: white;
  padding-left: 15%;
  padding-right: 15%;
  padding-top: 2%;
  padding-bottom: 2%;
  background-color: navy;
}
.singleMovie{
  display: inline-block;
  margin-right: 2%;
  margin-bottom: 2%;
  text-align: center;
}
img{
  width: 150px;
}
</style>
