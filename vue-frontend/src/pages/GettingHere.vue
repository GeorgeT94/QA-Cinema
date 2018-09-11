<template>
    <div id="gettingHere" class="body">
            <GmapMap
                    :center="{lat:53.4739875, lng:-2.2885057}"
                    :zoom="13"
                    map-type-id="terrain"
                    style="width: 100%; height: 300px"
            >
                <GmapMarker
                        :key="index"
                        :position="{lat:53.4739875, lng:-2.2885057}"
                        :clickable="true"
                        :draggable="false"
                />
            </GmapMap>

            <div id="address">
                <h4>Getting Here</h4>
                <p>
                You can reach our cinema opposite from the Anchorage tram stop!
                </p>
                <table>
                <tr>
                    <th>
                        Our Address
                    </th>
                </tr>
                <tr>
                    <td>
                        Anchorage 1
                    </td>
                </tr>
                <tr>
                    <td>
                        Anchorage Quay
                    </td>
                </tr>
                <tr>
                    <td>
                        Salford Quays
                    </td>
                </tr>
                <tr>
                    <td>
                        Salford
                    </td>
                </tr>
                <tr>
                    <td>
                        Manchester
                    </td>
                </tr>
                <tr>
                    <td>
                        M50 3YJ
                    </td>
                </tr>

                     </table>

            </div>
        <div id="photo"></div>
        </div>
</template>

<script>

    export default {
        name: "GettingHere",
        data() {
            return {
                cinemaPosition: {lat: 53.4739875, lng: -2.2885057}

            }

        }
    }



</script>

<style scoped>
    .body{
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