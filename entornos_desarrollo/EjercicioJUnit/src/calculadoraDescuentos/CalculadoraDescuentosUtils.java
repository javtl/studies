package calculadoraDescuentos;

import java.util.List;

public class CalculadoraDescuentosUtils {

    public static double calcularTotalConDescuento(List<Producto> productos, boolean esClienteVip) {
        double total = 0.0;

        for (Producto p : productos) {
            double descuentoBase = calcularDescuentoBase(p.categoria, p.cantidad);
            double descuentoFinal = esClienteVip ? descuentoBase + 0.05 : descuentoBase;

            if (descuentoFinal > 0.30) {
                descuentoFinal = 0.30;
            }

            double subtotal = p.precio * p.cantidad;
            total += subtotal * (1 - descuentoFinal);
        }

        return redondear(total);
    }

    private static double calcularDescuentoBase(String categoria, int cantidad) {
        switch (categoria.toLowerCase()) {
            case "electronica":
                return cantidad >= 5 ? 0.20 : 0.10;
            case "ropa":
                return cantidad >= 3 ? 0.15 : 0.05;
            case "hogar":
                return cantidad >= 2 ? 0.10 : 0.0;
            case "alimentacion":
                return 0.05;
            default:
                throw new IllegalArgumentException("Categoría no válida");
        }
    }

    private static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
