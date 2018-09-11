<template>
  <footer class="app-footer navbar-fixed-bottom">
    <table class="table table-borderless">
        <thead>
          <tr>
            <th class="footer-heading">Quick Links</th>
            <th class="footer-heading">Follow us</th>
          </tr>
        </thead>
        <tbody>
          <td>
            <router-link to="/"><a href="#" class="push-right-footer">Home</a></router-link>
            <router-link to="/"><a href="#" class="push-right-footer">About us</a></router-link>
            <router-link to="/"><a href="#">Contact us</a></router-link>
          </td>
          <td>
           <a href="#" class="push-right-footer"><img src="../../assets/facebook.png" /></a>
            <a href="#" class="push-right-footer"><img src="../../assets/twitter.png" /></a>
            <a href="#" class="push-right-footer"><img src="../../assets/youtube-2.png" /></a>
            <a href="#"><img src="../../assets/instagram.png" /></a>
          </td>
        </tbody>
      </table>
    <a>© QA Cinemas. All rights reserved.</a>
  </footer>
</template>

<script>
export default {
  name: 'Footer',

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.app-footer{
  font-size: 12px;
  padding-right: 10%;
  background-color: lightgrey;
  margin-bottom: 0px;
  text-align: center;
  padding-bottom: 20px;
}
.footer-heading {
  font-size: 1.5em !important;
}
a {
  color : #2a1b3d;
}
.push-right-footer {
  padding-right: 10px;
}
th{
  padding-top: 20px;
  font-size: 15px;
}
img:hover{
    opacity: 0.5;
    filter: alpha(opacity=50);
}
a{
  line-height: 30px;
}
</style>
