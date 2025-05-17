package calculadoraDescuentos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class CalculadoraDescuentosUtilsTest {

    @Test
    void testTotalConDescuentoClienteVip() {
        Producto p1 = new Producto("electronica", 100.0, 5); // 20% + 5% VIP = 25%
        Producto p2 = new Producto("ropa", 50.0, 3);         // 15% + 5% VIP = 20%

        List<Producto> productos = Arrays.asList(p1, p2);

        double total = CalculadoraDescuentosUtils.calcularTotalConDescuento(productos, true);

        // Producto 1: 100 * 5 = 500 -> -25% = 375
        // Producto 2: 50 * 3 = 150 -> -20% = 120
        // Total esperado = 495.0

        assertEquals(495.0, total);
    }
}
