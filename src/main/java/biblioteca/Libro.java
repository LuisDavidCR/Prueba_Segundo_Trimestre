package biblioteca;

/**
 * Representa la estructura de  un libro
 * Pertime crear libros
 *
 * @author Luis Calzadilla Romero
 * @version 6.3.2025
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * titulo, autor y anioPublicacion : Son atributos de la clase para los objetos tipo libro
     */

    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor de la clase para objetos tipo libro, recibe tres parametros
     * @param titulo es el titulo que tendra el libro
     * @param autor nombre del autor del libro
     * @param anioPublicacion fecha en la que se publica el libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * devuelve el nombre de autor del libro
     * @return devuelve autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * devuelve la fecha de publicacion
     * @return fecha de publicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
