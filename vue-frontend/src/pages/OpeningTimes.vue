<template>
  <div>
    <h1>Opening Times</h1>
    <div>
      <a>{{openingTimes.sunday}}</a><br>
      <a>{{openingTimes.monday}}</a><br>
      <a>{{openingTimes.tuesday}}</a><br>
      <a>{{openingTimes.wednesday}}</a><br>
      <a>{{openingTimes.thursday}}</a><br>
      <a>{{openingTimes.friday}}</a><br>
      <a>{{openingTimes.saturday}}</a><br>
    </div>
  </div>
</template>

<script>

export default {
  name: 'OpeningTimes',
  data() {
    return {
      openingTimes: {
        monday: "8:00-21:00",
        tuesday: "8:00-21:00",
        wednesday: "8:00-21:00",
        thursday: "8:00-21:00",
        friday: "8:00-21:00",
        saturday: "8:00-23:00",
        sunday: "10:00-17:00"
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
div{
  height: 500px;
}
</style>
