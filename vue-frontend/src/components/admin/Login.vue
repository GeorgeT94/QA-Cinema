<template>
    <div id="login">
        <h2>Login</h2>
        <br/>
        <h5>Username</h5>
        <input v-model="username" placeholder="User Name">

        <h6>Password</h6>
        <input datatype="password" v-model="password" placeholder="Password">
        <br/><br/>
        <button id="btnLogin" class="button1" v-on:click="adminLogin">Login</button>

        <div v-if="loginFailed" id="loginMessage">
            Username or Password is Incorrect
        </div>

    </div>

    
</template>

<script>
    import axios from 'axios'



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
    #login{
        text-align: left;
        color: black;
        padding-left: 15%;
        padding-right: 15%;
        padding-top: 2%;
        padding-bottom: 2%;
        background-color: white;
    }

    button {
        background-color: #4CAF50; /* Green */
        border: none;
        color: white;
        padding: 1px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        -webkit-transition-duration: 0.4s; /* Safari */
        transition-duration: 0.4s;
        cursor: pointer;
    }

    .button1 {
        background-color: white;
        color: black;
        border: 2px solid purple;
    }

    .button1:hover {
        background-color: purple;
        color: white;
    }
</style>