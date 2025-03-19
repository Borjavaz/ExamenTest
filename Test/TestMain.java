import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    // Test para comprobar si el DNI y la letra son correctos
    @DisplayName("Comprobar si el DNI y la letra son correctos")
    @ParameterizedTest
    @CsvSource({
            "00000000, T, true",  // Ejemplo correcto
            "12345678, Z, true",  // Ejemplo correcto
            "98765432, R, false", // Ejemplo incorrecto (letra equivocada)
            "00000001, T, false", // Ejemplo incorrecto (DNI incorrecto)
            "00000000, X, false"  // Ejemplo incorrecto (letra incorrecta)
    })

    public void testComprobarDNI(String dni, char letra, boolean esperado) {
        boolean resultado = Main.comprobarDNI(dni, letra);
        assertEquals(esperado, resultado);
    }

    // Test para comprobar la letra calculada del DNI
    @DisplayName("Comprobar la letra calculada del DNI")
    @ParameterizedTest
    @CsvSource({
            "00000000, T", // Ejemplo correcto
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",
            "00000016, S",
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E",
            "12345678, Z", // Ejemplo correcto adicional
            "98765432, M",
            "17463292, J"
    })
    public void testCalcularLetraDNI(String dni, char letraEsperada) {
        char letraCalculada = Main.calcularLetraDNI(dni);
        assertEquals(letraEsperada, letraCalculada);
    }

    // Test para comprobar que el DNI tenga 8 caracteres (caso de error)
    @DisplayName("Comprobar que el DNI tenga exactamente 8 caracteres")
    @ParameterizedTest
    @CsvSource({
            "1234567, false", // DNI corto
            "123456789, false" // DNI largo
    })

    public void testComprobarLongitudDNI(String dni, boolean esperado) {
        boolean resultado = dni.length() == 8;
        assertEquals(esperado, resultado);
    }
}

