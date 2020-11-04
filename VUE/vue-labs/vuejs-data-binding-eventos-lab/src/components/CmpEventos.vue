<template>
  <div>
    <!-- con la directiva @click llamamos a una funcion que este dentro del componente-->
    <button  @click="cambiarEstado($event)">Toggle</button>
    <!-- "?" ES EL OPERADOR TERNARIO, QUE INDICA QUE SI ES TRUE DEVUELVE LO QUE HAY JUSTO DESPUES-->
    <p>Calefacción: {{calefaccionEncendida ? 'ON' : 'OFF'}}</p>
    <p>Calefacción: {{calefaccionEncendida ? 'ENCENDIDO' : 'APAGADO'}}</p>
  </div>
</template>

<script>
export default {
  //PROPS ES PUBLICO, DATA ES PRIVADO

  data() {
    return {
      calefaccionEncendida: false
    }
  },
  methods: {
    cambiarEstado(event) {
      console.log(event);
      this.calefaccionEncendida = !this.calefaccionEncendida;
    }
  }
}
</script>

<style>

</style>