// generamos un procedimiento
function saludo() {
    console.log("hola mundo");
}
// funcion que retorna una string
function saludar() {
    return 'hola mundo';
}
function mostrarPantall() {
    var nombre = " dante";
    console.log(nombre);
    nombre = "diego";
    console.log(nombre);
    // si queremos trabajar con una constrante
    var apellido = "gonazalez";
    console.log(apellido);
    console.log(saludar());
}
function leoElemento() {
    // any = a en java un Object
    var nombre = document.getElementById('nombre').value;
    var capa = document.getElementById("texto");
    capa.innerHTML = nombre;
}
