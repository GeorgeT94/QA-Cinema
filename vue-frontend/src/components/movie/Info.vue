<template>
    <div id="info" class="wrapper">
        <table>
        <div class="movieTitle">
            <div class="movieImage">
                <img class="poster" v-bind:src="'https://image.tmdb.org/t/p/w500' + movie.poster_path" width="125"/><br/>
            </div>
            <div class="movieName">
            <h3>{{movie.title}}  <span class="otherTitle" v-if="movie.title !== movie.original_title">({{movie.original_title}})</span>
            </h3>
                <i>{{movie.tagline}}</i>
            </div>
        </div>


        <div class="MovieBody">
            <div class="MovieSide">
                <h5>Genre</h5>
                <span v-for="genre in movie.genres"> {{genre.name}};</span>
                <h5>Rating</h5>
                {{movie.vote_average}}
                <h5>Homepage</h5>
                <a v-if="movie.homepage !== null" target="_blank" v-bind:href="movie.homepage">Official</a>
                <h5>Production Companies</h5>
                <span v-for="company in movie.production_companies"> <img v-if="company.logo_path !== null" class="poster" v-bind:src="'https://image.tmdb.org/t/p/w500/' + company.logo_path" width="50" v-bind:alt="company.name"/><span v-else >{{company.name}} </span> <br/></span>


            </div>
            <div class="MovieDetails">
            <h5>Overveiw</h5>
            {{movie.overview}}

            <h5>Language</h5>
            <span v-for="language in movie.spoken_languages">{{language.name}};</span>

            <div class="">
                <H4>Showings</H4>
                <span class="showing" v-for="showing in showings"> {{showing.showingTime}}</span>
            </div>
            </div>

        </div>


        </table>

        <div class="comments">
            <vue-disqus shortname="qacinama" v-bind::identifier="id" ></vue-disqus>
        </div>
    </div>




</template>

<script>
    export default {
        name: 'Info',
        data(){
            return {
                movie: null,
                id: null,
                showings: null
            }
        },

        created: function(){

            this.id = this.$route.params.id
        },

        mounted () {
            const axios = require('axios');
            axios.get("http://127.0.0.1:8080/tmdb/getById/" + this.id)
                .then((response)  =>  {

                    this.movie = response.data;
                }, (error)  =>  {
                }),
                axios.get("http://127.0.0.1:8080/showing/getShowingByTMDB/" + this.id)
                    .then((response)  =>  {

                        this.showings = response.data;


                        if(this.showings.length===0){
                            this.showings.push({
                                showingTime: "No Showings Planned"
                            });
                        }

                        this.showings.sort(function(a,b) {return (a.showingTime > b.showingTime) ? 1 : ((b.showingTime > a.showingTime) ? -1 : 0);} );

                    }, (error)  =>  {
                    })

        },
    }
</script>

<style scoped>
    .wrapper{
        margin: auto;
        width: 75%;
        padding: 10px;

        position: relative;


    }

    .movieTitle{
        padding: auto;
        height: 200px;


    }

    .movieImage{
        float:left;
    }

    .movieName{
        padding-left: 15px;
        float: left;

    }

    .MovieBody{
        padding: auto;
    }

    .MovieDetails{
        float: right;
        width: 72.5%;

    }

    .MovieSide{
        width: 25%;
        min-width: 102px;
        float: left;
        flex-wrap: wrap;

    }

    .otherTitle{
        font-size: 16px;
    }

    .showing{
        border: 2px black solid;
        padding: 5px;
        margin-right: 5px;
    }

    .comments{
        padding-top: 20px;
    }
</style>