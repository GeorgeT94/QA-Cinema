<template>
  <div>
    <h1>Book Tickets</h1>
    <TicketSelection/>
  </div>
</template>

<script>
import TicketSelection from '../components/ticketPage/TicketSelection.vue'

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

<style scoped>
h1{
  margin-left: 10%;
  padding: 2% 0 2% 0;
}
</style>
