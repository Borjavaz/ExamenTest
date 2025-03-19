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
            "12345678, Z", // Ejemplo correcto
            "98765432, M", // Ejemplo correcto
            "17463292, J", // Ejemplo correcto

    })

    public void testCalcularLetraDNI(String dni, char letraEsperada) {
        char letraCalculada = Main.calcularLetraDNI(dni);
        assertEquals(letraEsperada, letraCalculada);
    }
}

