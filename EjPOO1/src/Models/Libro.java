package Models;
import java.util.Scanner;
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para cargar un libro
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el título: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.numeroPaginas = scanner.nextInt();
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }

}