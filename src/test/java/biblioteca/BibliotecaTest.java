package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca;
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("El Principito", "Antoine de Saint", 1943);
    }

    @Test
    void eliminarLibro() {

        biblioteca.agregarLibro(libro);

        //  Test: comprobar si se ha eliminado
        assertTrue(biblioteca.eliminarLibro(libro));

        assertFalse(biblioteca.eliminarLibro(libro));

    }

    @Test
    void encuentraLibroPorTitulo() {


    }

    @Test
    void encuentraLibrosPorAutor() {
    }


}