// JSON: JavaScript Object Notation
// Otra forma de crear objetos

let objetoVacio = {};

/*let formaPago = {
    "modo": "Tarjeta credito",
    "comision": 2,
    "activa": true,
    "preparacion": null,
    "clientes": ["Santander", "Sabadell", "BBVA", [1, 20, 55]],
    "configuracion": {
        "conexion": "ssl",
        "latencia": 15
    }
};*/
let formaPago = JSON.parse(window.localStorage.getItem("datos-forma-pago"));
document.write(`<br>
<p> ${formaPago.modo} - ${formaPago.clientes[3][2]} </p>`);
alert(JSON.stringify(formaPago, null, 3));
window.localStorage.setItem("datos-forma-pago", JSON.stringify(formaPago, null, 3));
let petUsu = prompt("¿Que dato quieres?");
document.write(`<br> ${formaPago[petUsu]}`);
let frutas = `[
    { "nombre" : "pera", "precio": 20},
    { "nombre" : "kiwi", "precio": 27},
    { "nombre" : "fresa", "precio": 30} ]`;
/*Parsear es la forma de decir leer o interpretar un texto 
En este caso covertimos un texto en un objeto. (Des-serializamos)
Convertir un objeto o estructura en memoria en un formato transmitible (texto (JSON, XML...),
    formato binario, encriptado) es serializar.
*/
let objFrutas = JSON.parse(frutas);
document.write(`<br> ${objFrutas[1].nombre} - ${objFrutas[2]["precio"]}`)