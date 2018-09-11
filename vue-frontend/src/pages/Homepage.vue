<template>
  <div>
    <Carousel/>
    <Listing/>
  </div>
</template>

<script>
import Carousel from '../components/homePage/Carousel.vue'
import Listing from '../components/homePage/Listing.vue'

export default {
  name: 'Homepage',
  components: {
    Carousel,
    Listing
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
