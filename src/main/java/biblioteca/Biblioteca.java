package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la estructura de una biblioteca
 * Pertime agregar, eliminar y encontrar libros
 * @see Libro
 * @author Luis Calzadilla Romero
 * @version 6.3.2025
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de libros disponibles en la biblioteca */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Contructor por defecto de la biblioteca sin libros */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     *Contructor con parametros
     * @param libros lista de libros
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Agrega un libro a la biblioteca
     * @param libro un libro para agregar
     * @return {@code true} si el libro se agrega o {@code false} si no se agrega
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca
     * @return  devuelve todos los libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Devuelve un libro con un titulo especifico
     * @param titulo titulo del libro a buscar
     * @return libro con el titulo buscado
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * busca un libro de un autor determinado
     * @deprecated metodo obsoleto
     * se recomienda usae {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor nombre del autor de un libro
     * @return libro del autor si lo encuentra o null si no encuentra algun libro
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * busca libros de un autor determinado
     * @since V2.0
     * sustituye al metodo {@link #encuentraLibroPorTitulo(String)}
     * @param autor nombre del autor de uno o varios libros
     * @return lista de libros del autor
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
