package instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void aniadirAlumnoYToString() {
        Curso curso = new Curso("Programacion");
        Persona p1 = new Persona(11111111, "Ana Gomez", 'M', 10, 5, 2005);
        
        curso.aniadirAlumno(p1);
        
        String resultadoImpresion = curso.toString();
        assertTrue(resultadoImpresion.contains("Ana"));
    }
}