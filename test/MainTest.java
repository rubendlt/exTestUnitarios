import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000000, T", // Caso válido
            "12345678, Z", // Caso válido
            "87654321, X", // Caso válido
            "11111111, H"  // Caso válido
    })
    void testComprobarDNI(String dni, char letra) {
        assertTrue(Main.comprobarDNI(dni, letra));
    }

    @ParameterizedTest
    @CsvSource({
            "00000000, T", // Resto 0
            "00000001, R", // Resto 1
            "00000002, W", // Resto 2
            "00000022, E"  // Resto 22
    })
    void testCalcularLetraDNI(String dni, char letraEsperada) {
        assertEquals(letraEsperada, Main.calcularLetraDNI(dni));
    }
}