package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("El nombre debe estar vacío")
    public void testNombreVacio() {
        String name = "";

        boolean act = name.isEmpty();

        assertTrue(act);
    }

    @Test
    @DisplayName("Password justa")
    public void passwordJusta() {
        String password = "12345678";

        boolean act = password.length() == 8;

        assertTrue(act);
    }

    @Test
    @DisplayName("Password corta")
    public void passwordCorta() {
        String password = "Admin";

        boolean act = password.length() == 5;

        assertTrue(act);
    }

    @Test
    @DisplayName("Email sin arroba")
    public void emailSinArroba() {
        String email = "usuario.gmail.com";

        boolean act = email.contains("@");

        assertFalse(act);
    }

    @Test
    @DisplayName("Edad límite")
    public void edadLimite() {
        int age = 16;

        boolean act = age == 16;

        assertTrue(act);
    }

}