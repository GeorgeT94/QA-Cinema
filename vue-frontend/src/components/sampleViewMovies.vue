<template>
    <div id="sampleViewMovies">
        <h3>Movies</h3>

        <button id="btnFilms" class="" v-on:click="getFilms">Get Films</button>
        <button id="btnUpcoming" class="" v-on:click="getUpcoming">Get Upcoming</button>
        <br/>

        <div v-if="loading">
            Loading...
        </div>

        <div v-if="type === 'film'">
            <div v-for="film in films" :key="film.id">
                <div v-on:click="getThisFilm(film.filmTMDB)">
                <img v-bind:src="'https://image.tmdb.org/t/p/w500' + film.filmPosterURL" width="200"/><br/>
                <p>{{film.filmName}}</p>
                </div>
            </div>
        </div>

        <div v-if="type === 'upcoming'">
            <div v-for="film in films" :key="film.id">
                <div v-on:click="getThisFilm(film.id)">
                    <img v-bind:src="'https://image.tmdb.org/t/p/w500' + film.poster_path" width="200"/><br/>
                    <p>{{film.original_title}}</p>
                </div>
            </div>
        </div>

        <div v-if="type === 'thisFilm'">
            <div class="wrapper">
                <div class="header">
                    <span class="image">
                    <img class="poster" v-bind:src="'https://image.tmdb.org/t/p/w500' + films.poster_path" width="125"/><br/>
                    </span>
                    <h3>{{films.title}}</h3>
                    <span v-if="films.title !== films.original_title">{{film.original_title}})</span>
                    {{films.tagline}}


                </div>

                <div class="parchment">
                    <div class="left">
                        <h4>Genre</h4>
                        <span v-for="genre in films.genres"> {{genre.name}};</span>
                        <h4>Rating</h4>
                        {{films.vote_average}}
                        <h4>Homepage</h4>
                        <a target="_blank" v-bind:href="films.homepage">{{films.homepage}}</a>
                        <h4>Production Company</h4>
                        &nbsp<span v-for="company in films.production_companies"> <img class="poster" v-bind:src="'https://image.tmdb.org/t/p/w500/' + company.logo_path" width="50" v-bind:alt="company.name"/>&nbsp</span>

                    </div>

                    <h4>Overveiw</h4>
                    {{films.overview}}

                    <h4>Language</h4>
                    {{films.spoken_languages[0].name}}

                </div>

                <div class="bottom">
                    <H4>Showings</H4>
                    <span class="showing" v-for="showing in showings"> {{showing.showingTime}}</span>
                </div>


            </div>

        </div>
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "sampleViewMovies",
        data () {
            return {
                films: [],
                showings: [],
                loading: false,
                type: ""
            }
        },
        methods: {
            getFilms: function () {
                this.loading = true;
                axios.get("http://127.0.0.1:8080/film/getAllFilms")
                    .then((response)  =>  {
                        console.log(response.data);

                        this.loading = false;
                        this.films = response.data;
                        this.type = "film";
                    }, (error)  =>  {
                        this.loading = false;
                    })
            },
            getUpcoming:function () {
                this.loading = true;
                axios.get("http://127.0.0.1:8080/tmdb/upcoming")
                    .then((response)  =>  {
                        console.log(response.data);
                        this.loading = false;
                        this.films = response.data.results;
                        this.type = "upcoming";
                    }, (error)  =>  {
                        this.loading = false;
                    })
            },
            getThisFilm: function (tmdb) {
                this.loading = true;
                axios.get("http://127.0.0.1:8080/tmdb/getById/" + tmdb)
                    .then((response)  =>  {
                        console.log(response.data);

                        this.loading = false;
                        this.films = response.data;
                        this.type = "thisFilm";
                    }, (error)  =>  {
                        this.loading = false;
                    })
                axios.get("http://127.0.0.1:8080/showing/getShowingByTMDB/" + tmdb)
                    .then((response)  =>  {
                        console.log(response.data);

                        this.showings = response.data;
                    }, (error)  =>  {
                        this.loading = false;
                    })
            },


        },
    }
</script>

<style scoped>
    .wrapper{
        width: 650px;
        margin: 0 auto;

    }

    .header{
        width: 100%;
        padding: 20px;
        height:135px;
        text-align: left;

    }

    .image{
        float: left;
        width: 25%;
        alignment: left;
    }

    .parchment{
        width:100%;
        float: right;
        text-align: left;

    }

    .left{
        float: left;
        width: 35%;
        alignment: left;
        text-align: left;
        flex-wrap: wrap;
    }

    .bottom{
        float: bottom;

    }

    .showing{
        border: 1px black solid;
        padding: 5px;
        margin: 5px;
    }

</style>