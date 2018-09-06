<template>
  <footer class="app-footer navbar-fixed-bottom">
    <table class="table table-borderless">
        <thead>
          <tr>
            <th>Quick Links</th>
            <th>Social</th>
          </tr>
        </thead>
        <tbody>
          <td>
            <a href="#">link1</a><br>
            <a href="#">link2</a><br>
            <a href="#">link3</a>
          </td>
          <td>
            <a href="#">social1</a><br>
            <a href="#">social2</a><br>
            <a href="#">social3</a>
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
}
th{
  padding-top: 20px;
  font-size: 15px;
}
a{
  line-height: 30px;
}
</style>
