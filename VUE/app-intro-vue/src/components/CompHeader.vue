<template>
  <header>
      <div>
          <h1 class="hola">Titulo WEB</h1>
      </div>
      <!-- Dentro de las template string, {{}}, podemos meter pequeños calculos-->
       variableOculta = {{variableOculta}}
       <br>
       nombre = {{nombre}}
       <br>
       3 + 5 = {{3+5}}
  </header>
</template>

<script>
export default {
    data(){
        return{
            variableOculta: "Variable oculta",
            nombre: "Chicho terremoto"
        };
    }
}
</script>

<style>

</style>