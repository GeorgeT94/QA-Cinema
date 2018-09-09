<template>
    <div id="adminPage" class="hello">
        <h1>Admin</h1>
        <Admin/>
    </div>
</template>

<script>
    import Admin from "../components/admin/Admin";
    export default {
        name:'AdminPage',
        components: {Admin}
    }
</script>