package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    Libro libro;
    @Test
    void setUp() {
         libro = new Libro("El Principito", "Antoine de Saint", 1943);
    }
}