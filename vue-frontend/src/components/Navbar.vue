<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-dark">
      <a class="navbar-brand" href="#">QA Cinemas</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Movie Listing</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Book Tickets</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              About Us
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <router-link to="/classifications"><a class="dropdown-item" href="#">Movie Classifications</a></router-link>
              <div class="dropdown-divider"></div>
              <router-link to="/openingTimes"><a class="dropdown-item" href="#">Opening Times</a></router-link>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#">Disabled</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
  </div>
</template>

<script>

export default {
  name: 'Navbar',

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
nav{
  background-color: #000080;
}
.navbar-brand{
  padding-left: 30px
}
li{
  padding-left: 20px;
  padding-right: 20px
}
a{
  font-size: 18px
}
</style>
