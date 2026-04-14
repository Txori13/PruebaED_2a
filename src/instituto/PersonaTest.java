package instituto;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void testConstruccionYEdad() {
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);
        
        assertEquals("12345678-Z", p.getNif().toString());
        
        int edadEsperada = LocalDate.now().getYear() - 2000;
        assertEquals(edadEsperada, p.getEdad());
    }
}