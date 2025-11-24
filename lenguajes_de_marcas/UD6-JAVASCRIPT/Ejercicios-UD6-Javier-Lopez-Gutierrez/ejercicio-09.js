//Crea una función llamada reponeUnidades que reciba dos parámetros: un objeto producto 
//como el del ejercicio anterior y un número entero que representará el número de unidades 
//que  se  repondrán  en  el  stock  del  producto.  La  función  debe  incrementar  el  número  de  
//unidades en stock del producto con el número entero que se reciba como parámetro.
// A  continuación,  llama  la  función  con  un  objeto  que  tenga  10  unidades  y  se  repongan  20.  
//Imprime en consola el objeto antes y después de invocar la función.

let producto = {
    nombre: "patatas",
    stock: 10
};

function reponeUnidades(producto, nuevaUnidad){
    producto.stock += nuevaUnidad;
}
console.log(producto.nombre+" "+producto.stock);

reponeUnidades(producto, 20);

console.log(producto.nombre+" "+producto.stock);
