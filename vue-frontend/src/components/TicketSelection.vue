<template>
  <form>
    <div class="form-group">
      <label for="movies">Movie Title:</label>
      <select class="form-control" id="movies" @change="selectedMovie" ref="selectedMovie">
        <option>--------</option>
        <option v-for="movie in movieList">{{movie.name}}</option>
      </select>
    </div>
    <div class="form-group">
      <label for="dates">Choose Date:</label>
      <select class="form-control" id="dates" @change="selectedDate" ref="selectedDate">
        <option>--------</option>
        <option v-for="date in availableDates">{{date.date}}</option>
      </select>
    </div>
    <div class="form-group">
      <label for="showings">Choose showing:</label>
      <select class="form-control" id="showings" @change="selectedShowing" ref="selectedShowing">
        <option>--------</option>
        <option v-for="showing in availableShowings">{{showing.time}}</option>
      </select>
    </div>
    <div class="form-group">
      <label for="adultTickets">Adult:</label>
      <select class="form-control" id="adultTickets" ref="adultTickets">
        <option>--------</option>
        <option v-for="n in noOfRegularTickets">{{n}}</option>
      </select>
      <a class="price">{{prices.adult}}</a>
    </div>
    <div class="form-group">
      <label for="childTickets">Child:</label>
      <select class="form-control" id="childTickets" ref="childTickets">
        <option>--------</option>
        <option v-for="n in noOfRegularTickets">{{n}}</option>
      </select>
      <a class="price">{{prices.child}}</a>
    </div>
    <div class="form-group">
      <label for="concessionTickets">Concession:</label>
      <select class="form-control" id="concessionTickets" ref="concessionTickets">
        <option>--------</option>
        <option v-for="n in noOfConcessionTickets">{{n}}</option>
      </select>
      <a class="price">{{prices.concession}}</a>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</template>

<script>

export default {
  name: 'TicketSelection',
  data() {
    return {
      availableDates: null,
      availableShowings: null,
      noOfRegularTickets: null,
      noOfConcessionTickets: null,
      prices: {
        adult: "£9",
        child: "£5",
        concession: "£7"
      },
      movieList: [
        {
          name: "Deadpool",
          datesShowing: [
            {
              date: "09/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "10/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "11/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "12/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "13/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            }
          ]
        },
        {
          name: "Avengers",
          datesShowing: [
            {
              date: "09/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "10/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "11/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            },
            {
              date: "12/09/18",
              showings: [
                {time: "12:00", regularTickets: 50, concessionTickets: 10},
                {time: "15:00", regularTickets: 50, concessionTickets: 10},
                {time: "17:30", regularTickets: 50, concessionTickets: 10},
                {time: "19:00", regularTickets: 50, concessionTickets: 10},
                {time: "21:00", regularTickets: 50, concessionTickets: 10},
                {time: "22:30", regularTickets: 50, concessionTickets: 10}
              ]
            }
          ]
        }
      ]
    }
  },
  methods: {
    selectedMovie: function() {
      var currMovieIndex = this.$refs.selectedMovie.selectedIndex
      if(currMovieIndex == 0){
        this.availableDates = null
      } else {
        this.availableDates = this.movieList[currMovieIndex-1].datesShowing
      }
      this.availableShowings = null
      this.noOfRegularTickets = null
      this.noOfConcessionTickets = null
    },
    selectedDate: function() {
      var currDateIndex = this.$refs.selectedDate.selectedIndex
      if(currDateIndex == 0 || currDateIndex == null){
        this.availableShowings = null
      } else {
        this.availableShowings = this.availableDates[currDateIndex-1].showings
      }
      this.noOfRegularTickets = null
      this.noOfConcessionTickets = null
    },
    selectedShowing: function() {
      var selectedShowingIndex = this.$refs.selectedShowing.selectedIndex
      if(selectedShowingIndex == 0 || selectedShowingIndex == null){
        this.noOfRegularTickets = null
        this.noOfConcessionTickets = null
      } else {
        this.noOfRegularTickets = this.availableShowings[selectedShowingIndex-1].regularTickets
        this.noOfConcessionTickets = this.availableShowings[selectedShowingIndex-1].concessionTickets
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.price{
  display: inline-block;
}
form{
  margin-left: 10%;
  width: 50%;
}
label{
  display: inline-block;
  width: 20%;
}
select{
  display: inline-block;
  width: 30%;
}
</style>
