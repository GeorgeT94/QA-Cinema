<template>
  <div id="listing">
    <h3>Latest Releases</h3>
    <div class="table-responsive">
      <table class="table table-borderless">
        <tr>
          <td v-for="movie in movieList">
            <img src="../assets/Deadpool-poster.jpg"><br>
            <a class="social-icon">{{movie.name}}</a>
          </td>
        </tr>
      </table>
    </div>
    <!-- <ul class="list-inline">
       <li class="list-inline-item" v-for="movie in movieList">
         <img src="../assets/Deadpool-poster.jpg">
         <a class="social-icon">{{movie.name}}</a>
       </li>
    </ul> -->
  </div>
</template>

<script>
export default {
  name: 'Listing',
  data() {
    return {
      movieList: [
        {
          name: "Deadpool"
        },
        {
          name: "Avengers dhfgggdhgf"
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
  created: function () {
        alert("it worked");
    },
  methods: {

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
