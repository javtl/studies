
package ejercicioCalculadoraDescuento;

import static 	.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class CalculadoraDescuentosUtilsTest {

    @Test
    void testTotalConDescuentoClienteVip() {
        // Preparar productos
        Producto p1 = new Producto("electronica", 5, 100.0); // 20% + 5% VIP = 25%
        Producto p2 = new Producto("ropa", 3, 50.0);         // 15% + 5% VIP = 20%

        List<Producto> productos = Arrays.asList(p1, p2);

        // Ejecutar método a probar
        double total = CalculadoraDescuentosUtils.calcularTotalConDescuento(productos, true);

        // Verificar resultado
        // Producto 1: 100 * 5 = 500 -> -25% = 375
        // Producto 2: 50 * 3 = 150 -> -20% = 120
        // Total esperado = 375 + 120 = 495

        assertEquals(495.0, total);
    }
}

































/*package ejercicioCalculadoraDescuento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescuentosUtilsTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
*/