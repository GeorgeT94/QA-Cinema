<template>
    <div id="adminLogin" class="hello">
        <h1>Login</h1>
        <login/>
    </div>
</template>

<script>
    import Login from "../components/admin/Login";
    export default {
        name:'AdminLogin',
        components: {Login}
    }
</script>