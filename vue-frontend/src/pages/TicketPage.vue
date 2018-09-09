<template>
  <div>
    <h1>Book Tickets</h1>
    <TicketSelection/>
  </div>
</template>

<script>
import TicketSelection from '../components/TicketSelection.vue'

export default {
  name: 'TicketPage',
  components: {
    TicketSelection
  },
  data() {
    return {

    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1{
  margin-left: 10%;
  padding: 2% 0 2% 0;
}
</style>
