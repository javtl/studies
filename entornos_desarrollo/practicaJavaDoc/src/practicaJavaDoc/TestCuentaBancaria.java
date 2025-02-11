package practicaJavaDoc;

//Clase que contiene el método main y prueba la clase CuentaBancaria
public class TestCuentaBancaria {
 public static void main(String[] args) {
     // Crear una cuenta bancaria
     CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);

     // Mostrar saldo inicial
     cuenta1.mostrarSaldo();

     // Depositar dinero
     cuenta1.depositar(500);

     // Intentar retirar más de lo que hay en la cuenta
     cuenta1.retirar(2000);

     // Retirar dinero correctamente
     cuenta1.retirar(300);

     // Mostrar saldo final
     cuenta1.mostrarSaldo();
 }
}








