<template>
  <div id="app">
    <CompPatata></CompPatata>
    <img alt="Vue logo" src="./assets/logo.png">
    <HolaComp msg="Bienvenido a tu Vue.js App"/>
    <ul>
      <li v-for="heroe in heroes" :key="heroe.id">{{heroe.nombre}}</li>
    </ul>

  </div>
</template>

<script>
import HolaComp from './components/HolaMundo.vue'
//Este es el CompHeader pero lo llamamos como queramos
import CompPatata from './components/CompHeader.vue'

export default {
  name: 'App',
  components: {
    HolaComp,
    CompPatata
  },
  data:{
    return{
      heroes:[]
    };
  },
  beforeCreate(){
    let prometemeHeroes = fetch("http://localhost:/8080/api/heroes");
    //La variable la recibiremos en formato JSON asincronamente, no en el momento, en una callback
    prometemeHeroes.then((respuestaHttp) => {
        return respuestaHttp.json()
    }).then((data)=> {
      this.heroes = data;
    })
  }
}
</script>

<style lang="scss">
@import "./assets/estilo.css";
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
