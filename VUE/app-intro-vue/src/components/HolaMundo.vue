<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <div id="hola" class="hola">
       Algo
    </div>
  </div>
</template>

<script>
export default {
  name: 'HolaMundo',
  props: {
    msg: String
  },
  data: {
    variableOculta: "Variable oculta"
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
div{
  margin: 40px 0 0;
  background-color: blueviolet;
}
.hola{
  border: solid 2px black;
}

</style>
