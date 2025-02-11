package practicaJavaDoc;

//Clase que representa una cuenta bancaria
public class CuentaBancaria {
 private String titular;
 private double saldo;

 // Constructor
 public CuentaBancaria(String titular, double saldoInicial) {
     this.titular = titular;
     this.saldo = saldoInicial;
 }

 // Método para depositar dinero
 public void depositar(double cantidad) {
     if (cantidad > 0) {
         saldo += cantidad;
         System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
     } else {
         System.out.println("Cantidad no válida para depósito.");
     }
 }

 // Método para retirar dinero
 public void retirar(double cantidad) {
     if (cantidad > 0 && cantidad <= saldo) {
         saldo -= cantidad;
         System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
     } else {
         System.out.println("Saldo insuficiente o cantidad inválida.");
     }
 }

 // Método para mostrar el saldo actual
 public void mostrarSaldo() {
     System.out.println("El saldo actual de " + titular + " es: " + saldo);
 }
}
