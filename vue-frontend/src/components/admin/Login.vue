<template>
    <div id="login" v-on:load="">

        <h5>Username</h5>
        <input v-model="username" placeholder="User Name">

        <h5>Password</h5>
        <input datatype="password" v-model="password" placeholder="Password">

        <button id="btnLogin" class="" v-on:click="adminLogin">Get Upcoming</button>

        <div v-if="loginFailed" id="loginMessage">
            Username or Password is Incorrect
        </div>

    </div>

    
</template>

<script>
    import axios from 'axios'
    import Router from 'vue-router'



    export default {
        name: "Login",
        data(){
            return{
                loginFailed: null,
                username:"admin",
                password:"password",
                login:{}


            }
        },
        methods:{
            adminLogin:function () {
                axios.get("http://127.0.0.1:8080/admin/loginAdmin/" + this.username + "/" + this.password)
                    .then((response)  =>  {

                        if(response.status !== 500){
                            window.location.pathname = '/adminPage';
                        }
                    }, (error)  =>  {
                        this.username="";
                        this.password="";
                        this.loginFailed = true;
                    })
            }
        }

    }
</script>

<style scoped>

</style>