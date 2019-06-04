// esto es una funcion!
function saludar(){

    return "hola mundo";
}

// esto es un procedimiento
function saludor(nombre){
    console.log('Hola '+nombre);
}

function muestroPorPopup(){
    alert(saludar());
}

function  muetroDatos(){
    // para generar una variable en javascript se hace con el prefijo var aunque no es necesario
    var nombre = document.getElementById("nombre").value;

    // alert("hola " +  nombre);

    var capa= document.getElementById("texto");

    // innerHTML --> es la forma de sobre-escribir el objeto y pasrale valores
    capa.innerHTML= nombre;

    // si fuera un campo tipo input se suele poner innerText
     
}