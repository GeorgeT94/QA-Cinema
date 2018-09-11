<template>
    <div id="guestbook">
        <h4>Guestbook</h4>
        <p> Feel Free to leave a comment on our guestbook and let us knwo that you think</p>

        <div class="comments">
            <vue-disqus shortname="qacinama" :identifier="guestbook" ></vue-disqus>
        </div>

    </div>
</template>

<script>
    export default {
        name: "Guestbook"
    }
</script>

<style scoped>
    #guestbook{
        text-align: left;
        color: black;
        padding-left: 2%;
        padding-right: 2%;
        padding-top: 2%;
        padding-bottom: 2%;
        background-color: aliceblue;
        margin: auto;
    }
</style>