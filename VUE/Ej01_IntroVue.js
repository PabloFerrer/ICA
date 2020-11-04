Vue.component("app-saludo", {
    "template": `<h2>Hola soy un componente</h2>`
});
Vue.component("app-footer", {
    "template": `<h2>Hola soy un componente-footer</h2>`
});
new Vue({
    "el": "#app-footer",
    template: `<div><app-footer></app-footer></div>`
})
new Vue({
    //el significa element, es hacia que elemento se va a aplicar el codigo
    "el": "#app-section",
    template: `<div><h2>Hola Ica</h2> 
    <app-saludo></app-saludo></div>`
});
new Vue({
    "el": "#app-section2"

});