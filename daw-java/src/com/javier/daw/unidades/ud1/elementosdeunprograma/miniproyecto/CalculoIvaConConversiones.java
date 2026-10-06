package com.javier.daw.unidades.ud1.elementosdeunprograma.miniproyecto;

/**
 * Programa que calcula el precio final de un producto aplicando IVA y un descuento.
 * Demuestra la estructura basica de Java, el uso de variables, constantes,
 * operadores y conversiones de tipo (implicitas y explicitas).
 *
 * @author Javier L
 * @version 1.0
 */

public class CalculoIvaConConversiones {

    public static void main(String[] args){
        final double PORCENTAJE_IVA = 0.21;
        int cantidadUnidades = 5;
        double precioBaseUnidad = 19.99;
        boolean tieneDescuentoEspecial = true;

        double subtotalSinIva = cantidadUnidades * precioBaseUnidad;
        double montoIva = subtotalSinIva * PORCENTAJE_IVA;
        double precioTotalOriginal = subtotalSinIva + montoIva;

        boolean aplicaDescuento = (cantidadUnidades > 3) && tieneDescuentoEspecial;

        double unidadesEnDouble = cantidadUnidades;

        int precioTotalRedondeadoEnEuros = (int) precioTotalOriginal;

        System.out.println("--- RESULTADO ---");
        System.out.println("Subtotal con IVA: " + subtotalSinIva + "€" );
        System.out.println("Cantidad de IVA(21%): " + montoIva + "€");
        System.out.println("Precio Total Exacto: "+ precioTotalOriginal + "€");
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Precio total redondeado (Conversion Explicita a int): " + precioTotalRedondeadoEnEuros + "€");
    }

    }

