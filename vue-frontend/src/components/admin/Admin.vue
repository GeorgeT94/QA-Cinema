<template>
    <div id="admin" v-on:ready="listOurFilms">
        <div>
            <div v-if="showingsMode === false">
                <h5>Films</h5>
                <table>
                    <tbody v-for="film in ourFilms" v-bind:key="film.filmId">
                    <td><img v-bind:src="'https://image.tmdb.org/t/p/w200' + film.filmPosterURL" width="50"/><br/></td>
                    <td>{{film.filmName}}</td>
                    <td><button v-on:click="showShowings(film.filmTMDB, film.filmName)">Showings</button></td>
                    <td><button v-on:click="deleteFilm(film.filmId, film.filmTMDB)" >Remove</button></td>
                    </tbody>
                </table>
                <div>
                    <h5>Add Film</h5>
                    <input v-model="searchValue" placeholder="Search" v-on:keypress="searchFilm">
                </div>

                <div v-if="searchResult !== null">
                    <table>
                        <tbody v-for="film in searchResult.results" v-bind:key="film.id">
                        <div v-if="!ourFilmTMDB.includes(film.id)">
                            <td><img v-bind:src="'https://image.tmdb.org/t/p/w200' + film.poster_path" width="50"/><br/></td>
                            <td>{{film.title}}<span v-if="film.title !== film.original_title"> ({{film.original_title}})</span></td>
                            <td><button v-on:click="addFilm(film.title, film.id, film.poster_path)">Add</button></td>
                        </div>
                        </tbody>
                    </table>
                </div>
            </div>



            <div v-if="showingsMode === true">
                <h5>{{thisFilmShowing}} - Showings</h5>
                <table>
                    <tbody v-for="showing in filmShowings" v-bind:key="showing.showingId">
                    <td>{{showing.showingTime}}</td>
                    <td><button v-on:click="deleteShowing(showing.showingId)">Remove</button></td>
                    </tbody>
                </table>


            <div>
                <h5>Add Showing</h5>
                <select v-model="showingTime">
                    <option value="09:00">09:00</option>
                    <option value="10:00">10:00</option>
                    <option value="11:00">11:00</option>
                    <option value="12:00">12:00</option>
                    <option value="13:00">13:00</option>
                    <option value="14:00">14:00</option>
                    <option value="15:00">15:00</option>
                    <option value="16:00">16:00</option>
                    <option value="17:00">17:00</option>
                    <option value="18:00">18:00</option>
                    <option value="19:00">19:00</option>
                    <option value="20:00">20:00</option>
                    <option value="21:00">21:00</option>

                </select>
                <button v-on:click="addShowing(showingTime)">Add</button>
            </div>

                <button v-on:click="showingsMode=false">Back</button>
            </div>

        </div>






    </div>


</template>

<script>
    import axios from 'axios'
    export default {
        name: "Admin",
    data(){
        return{
            loginFailed: null,
            searchValue:"",
            searchResult: null,
            ourFilms: null,
            ourFilmTMDB:[],
            showingsMode:false,
            filmShowings: null,
            thisFilmShowing: "",
            showingTime:"",
            thisFilmTMDB:null

        }
    },
        mounted: function () {
           this.listOurFilms()
        },
    methods:{
        searchFilm:function () {
            axios.get("http://127.0.0.1:8080/tmdb/search/" + this.searchValue)
                .then((response)  =>  {
                    this.searchResult=response.data;
                }, (error)  =>  {

                })
        },
        listOurFilms(){
            axios.get("http://127.0.0.1:8080/film/getAllFilms")
                .then((response)  =>  {
                    this.ourFilms=response.data;
                    for (let film in this.ourFilms) {
                        this.ourFilmTMDB.push(this.ourFilms[film].filmTMDB);

                    }


                }, (error)  =>  {

                })

        },
        addFilm(fName, fId, fPoster){
            axios.post("http://127.0.0.1:8080/film/saveFilm",
                {
                    filmName: fName,
                    filmTMDB: fId,
                    filmPosterURL: fPoster
                }).then(() => {
                    let ref = this;
                    ref.listOurFilms();
            })



        },
        showShowings(tmdb, name){
            axios.get("http://127.0.0.1:8080/showing/getShowingByTMDB/" + tmdb)
                .then((response) => {
                this.showingsMode = true;
                this.thisFilmShowing = name;
                this.thisFilmTMDB = tmdb;
                this.filmShowings = response.data;

            })
        },
        addShowing(time){
            axios.post("http://127.0.0.1:8080/showing/saveShowing",
                {
                    showingTime:time,
                    showingTMDB:this.thisFilmTMDB
                }).then(() => {
                let ref = this;
                ref.showShowings(this.thisFilmTMDB, this.thisFilmShowing);
            })
        },
        deleteShowing(id) {
            axios.delete("http://127.0.0.1:8080/showing/delete/" + id)
                .then(() => {
                    let ref = this;
                    ref.showShowings(this.thisFilmTMDB, this.thisFilmShowing);

                })
        },
        deleteFilm(id, tmdb) {
            axios.delete("http://127.0.0.1:8080/film/delete/" + id)
                .then(() => {
                   let index =  this.ourFilmTMDB.indexOf(tmdb);
                    if(index>-1){
                        this.ourFilmTMDB.splice(index,1);
                    }
                    let ref = this;
                    ref.listOurFilms();
                })
        },
    }


    }
</script>

<style scoped>

</style>