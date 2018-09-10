<template>
    <div id="popular">
        <h3>Now Showing</h3>
        <div class="container">
            <div v-for="movie in film.data" class="movie-info" v-bind:key="movie.filmName">
                <h4>{{movie.filmName}}</h4>
                <router-link v-bind:to="'/movieinfo/' + movie.filmTMDB">
                    <img class="movie-image" v-bind:src="'https://image.tmdb.org/t/p/original' + movie.filmPosterURL"><br>
                </router-link>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'Current',
        data() {
            return {
                film: null,
            }
        },

        mounted () {
            const axios = require('axios');
            axios
                .get(' http://127.0.0.1:8080/film/getAllFilms')
                .then(response => (this.film = response))

        },
        methods: {

        }
    }
</script>

<style scoped>
    .container {
        display: flex;
        flex-flow: row wrap;
        width: 100%;
    }
    /* Medium screens */
    @media all and (max-width: 800px) {
        .container {
            /* When on medium sized screens, we center it by evenly distributing empty space around items */
            justify-content: space-around;
        }
    }

    /* Small screens */
    @media all and (max-width: 500px) {
        .container {
            /* On small screens, we are no longer using row direction but column */
            flex-direction: column;
        }
    }

    .movie-info{
        padding:20px;
    }

    .movie-image{
        width:300px;
    }

    #popular{
        text-align: left;
        color: black;
        padding-left: 2%;
        padding-right: 2%;
        padding-top: 2%;
        padding-bottom: 2%;
        background-color: White;
    }

    img:hover {
        opacity: 0.5;
        filter: alpha(opacity=50); /* For IE8 and earlier */
    }

    td{
        text-align: center;
        padding-top: 2%;
        padding-left: 2%;
        padding-right: 2%;
    }
    img{
        width: 150px;
    }



    table{
        width: 50%;
    }
</style>
