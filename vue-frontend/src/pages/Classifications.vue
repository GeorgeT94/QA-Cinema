<template>
  <div>
    <h1>Movie Classifications</h1>
    <div id='classification' v-for="info in infoList">
      <h3>{{info.age}}</h3>
      <p>{{info.details}}</p>
      <img :src="info.imageSrc">
    </div>
  </div>
</template>

<script>

export default {
  name: 'Classifications',
  data() {
    return {
      infoList: [
        {
          age: "U",
          imageSrc: "http://2.bp.blogspot.com/-XuISeeEDHBI/VgBBHxtfcbI/AAAAAAAAAnA/7KcJwC_L978/s1600/bbfc-u.png",
          details: "Titles rated bbfc-u have been classified suitable for all."
        },
        {
          age: "PG",
          imageSrc: "http://3.bp.blogspot.com/-_wvENKkMCPc/Un4uKwsyTRI/AAAAAAAAADI/tiSg0Gwafh4/s1600/pgrating.png",
          details: "Titles rated bbfc-pg are for general viewing, but some scenes may be unsuitable for young children."
        },
        {
          age: "12A",
          imageSrc: "https://www.premierpraise.com/var/ezdemo_site/storage/images/media/images/premier-news-images/film-media/12a/18138632-1-eng-GB/12a_galleryfull.png",
          details: "Titles rated bbfc-12a are suitable for 12 years and over. No-one younger than 12 may see a '12A' film in a cinema unless accompanied by an adult."
        },
        {
          age: "12",
          imageSrc: "http://louisabroadheadmediablog.files.wordpress.com/2011/12/bbfc_12_rating1.png",
          details: "Titles rated bbfc-12 are for 12 and over. No-one younger than 12 may rent or buy a '12' rated video or DVD. Responsibility for allowing under-12s to view lies with the accompanying or supervising adult."
        },
        {
          age: "15",
          imageSrc: "https://vignette.wikia.nocookie.net/gtawiki/images/4/4f/BBFC_15_Rating.png/revision/latest?cb=20100225225805",
          details: "Titles rated bbfc-15 are suitable only for 15 years and over. No-one younger than 15 may see a '15' film in a cinema. No-one younger than 15 may rent or buy a '15' rated video or DVD."
        },
        {
          age: "18",
          imageSrc: "http://images2.wikia.nocookie.net/__cb20100225224907/gtawiki/images/5/5a/BBFC_18.png",
          details: "Titles rated bbfc-18 are suitable only for adults. No-one younger than 18 may see an '18' film in a cinema. No-one younger than 18 may rent or buy an '18' rated video."
        }
      ]
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

#classification{
  padding: 2% 0% 5% 0%;
  align-items: center;
  margin-left: 15%;
  margin-right: 15%;
  background-color: aliceblue;
}
h1{
  padding: 5% 0% 0% 15%;
  text-decoration-line: underline;
}
p{
  width: 50%;
  display: inline-flex;
}
img{
  margin-right: 20%;
  float: right;
  width: 15%;
  display:inline;
}
</style>
