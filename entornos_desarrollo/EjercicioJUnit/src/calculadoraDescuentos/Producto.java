package calculadoraDescuentos;

/**
 * Clase que representa un producto sobre el que se puede aplicar un descuento.
 */
public class Producto {
    public String categoria;
    public double precio;
    public int cantidad;

    public Producto(String categoria, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("Precio o cantidad no pueden ser negativos");
        }
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
