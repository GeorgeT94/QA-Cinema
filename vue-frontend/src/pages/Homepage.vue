<template>
  <div class="hello">
    <Carousel/>
  </div>
</template>

<script>
import Carousel from '../components/Carousel.vue'

export default {
  name: 'Homepage',
  components: {
    Carousel
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
