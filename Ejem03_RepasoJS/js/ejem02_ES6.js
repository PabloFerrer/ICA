const PI = 3.1415926;

let unaVar = 20;
let unTexto = "Que pasa!";

document.write(`<br>
Texto en varias
lienas, y ademas podemos <br>
mostrar variables asi: ${unaVar} y otro texto  ${unTexto}`);
document.write("<br>");

// funciones lambda, funciones anonimas o funciones flecha.

var suma = (x, y) => {
    return x + y;
}

//si tenemos un solo parametro podemos ahorrarnos los parentesis, en el momento que tengamos 2 o mas
//tendremos que ponerlos.
var alcuadrado = x => x ** 2;

document.write("<br> suma " + suma(3, 2));
document.write("<br> al cuadrado" + alcuadrado(12));

class Dato {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }
    mostrar() {
        document.write(`<br> Dato: x = ${this.x} y = ${this.y}`);

    }
}
class Info extends Dato {
    constructor(x, y = 20, z = 20) {
        super(x, y);
        this.z = z;
    }
    mostrar() {
        super.mostrar();
        document.write(`z = ${this.z}`);
    }
}

let dato = new Dato("lo que tu quieras", 123);
dato.mostrar();
let info = new Info("otra info");
info.mostrar();