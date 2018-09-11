<template>
  <div>
    <UpcomingMovies />
  </div>

</template>

<script>
    import UpcomingMovies from "../components/listings/UpcomingMovies"
    export default {
        name: 'FutureReleases',
        components:{
            UpcomingMovies
        },
        data() {
            return {
            }
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>