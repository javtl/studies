//Crea un objeto que represente a un producto
//  a la venta que tenga por nombre 
// “Auriculares 
//BT”, precio 23 € y con stock de 44 unidades.
//A continuación, imprímelo en la consola.
//Añade  un  método  llamado  importeEnStock()  
//que  devuelva  el  producto  del  precio  por  las  
//unidades en stock. 
//Invócalo y muestra el resultado en la consola.
//Ahora debes decrementar las unidades en stock 
//tres veces y subirle el precio un 5%.
// Vuelve a invocar al método importeEnStock()
// e imprime el resultado en la consola. 

// Creación del objeto producto
const producto = {
    nombre: "Auriculares BT",
    precio: 23,
    stock: 44,
    
    // Método para calcular el importe en stock
    importeEnStock: function() {
      return this.precio * this.stock;
    }
  };
  
  // Imprimimos el objeto inicial
  console.log("Objeto inicial:", producto);
  
  // Invocamos el método importeEnStock()
  console.log("Importe en stock inicial:", producto.importeEnStock());
  
  // Decrementamos las unidades en stock tres veces
  producto.stock -= 1;
  producto.stock -= 1;
  producto.stock -= 1;
  
  // Incrementamos el precio un 5%
  producto.precio *= 1.05;
  
  // Imprimimos el objeto actualizado
  console.log("Objeto actualizado:", producto);
  
  // Invocamos el método importeEnStock() de nuevo
  console.log("Importe en stock actualizado:", producto.importeEnStock());
  