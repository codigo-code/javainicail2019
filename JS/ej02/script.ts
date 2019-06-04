// generamos un procedimiento
function saludo(): void {
    console.log("hola mundo");


}

// funcion que retorna una string
function saludar(): string {
    
    return 'hola mundo';
}

function mostrarPantall(): void {
    let nombre =" dante";
    console.log(nombre);
    nombre="diego";
    console.log(nombre);

    // si queremos trabajar con una constrante
    const apellido ="gonazalez";
    console.log(apellido);
    
    console.log(saludar());




}

function leoElemento(): void{

    // any = a en java un Object
    let nombre :any = (<HTMLInputElement>document.getElementById('nombre')).value;

    let capa: HTMLElement = <HTMLElement>document.getElementById("texto");


    capa.innerHTML= nombre;

}

