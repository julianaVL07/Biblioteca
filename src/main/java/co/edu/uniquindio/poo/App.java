package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        //creamos la biblioteca
        Biblioteca biblioteca = new Biblioteca("La Central");

        //creamos los prestamos
        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15),3000);
        Prestamo prestamo2 = new Prestamo(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 20),5000);

        //creamos los autores 
        Autor autor = new Autor("Gabriel García Márquez", "123456789", "3001234567", "gabriel@gabo.com", 87);
        Autor autor2 = new Autor("Isabel Allende", "987654321", "3007654321", "isabel@allende.com", 81);
        Autor autor3 = new Autor("Mario Vargas Llosa", "456123789", "3004567890", "mario@vargasllosa.com", 88);
       

        //creamos las editoriales
        Editorial editorial = new Editorial("Editorial Sudamericana", "Grupo Penguin Random House");
        Editorial editorial2 = new Editorial("Alfaguara", "Santillana");
        Editorial editorial3 = new Editorial("Anagrama", "Jorge Herralde");

        //creamos los libros 
        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, autor, editorial);
        Libro libro2 = new Libro("002", "978-0-7475-3269-9", "Harry Potter y la piedra filosofal", LocalDate.of(2024, 5, 5), 25, autor2, editorial2);
        Libro libro3 = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15, autor3, editorial3);

        //creamos los detalleprestamos
        DetallePrestamo detallePrestamo = new DetallePrestamo(5, libro);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(3, libro2);
        DetallePrestamo detallePrestamo3 = new DetallePrestamo(4, libro3);

        //creamos los bibliotecarios
        Bibliotecario bibliotecario = new Bibliotecario("Ana Pérez", "123456789", "3001234567", "ana@biblioteca.com", 10);
        Bibliotecario bibliotecario2 = new Bibliotecario("Carlos Gómez", "987654321", "3007654321", "carlos@biblioteca.com", 4);

        //creamos los estudiantes
        Estudiante estudiante = new Estudiante("Juan Pérez", "123456789", "3001234567", "juan@estudiante.com");
        Estudiante estudiante2 = new Estudiante("María Gómez", "987654321", "3007654321", "maria@estudiante.com");

        //Agregar bibliotecarios a la biblioteca
        biblioteca.agregarBibliotecario(bibliotecario);
        biblioteca.agregarBibliotecario(bibliotecario2);

        //Agregar estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante);
        biblioteca.agregarEstudiante(estudiante2);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Agregar prestamos a la biblioteca
        biblioteca.agregarPrestamo(prestamo);
        biblioteca.agregarPrestamo(prestamo2);

        // Agregar prestamos al bibliotecario
        bibliotecario.agregarPrestamoBibliotecario(prestamo);
        bibliotecario.agregarPrestamoBibliotecario(prestamo2);
        bibliotecario2.agregarPrestamoBibliotecario(prestamo2);

         // Agregar detalleprestamos a prestamo
        prestamo.agregarDetallePrestamos(detallePrestamo);
        prestamo.agregarDetallePrestamos(detallePrestamo2);
        prestamo2.agregarDetallePrestamos(detallePrestamo);

        // Agregar libros a editorial
        editorial.agregarLibroEditorial(libro);
        editorial2.agregarLibroEditorial(libro2);
        editorial3.agregarLibroEditorial(libro3);

        // Agregar libros a autor
        autor.agregarLibroAutor(libro);
        autor3.agregarLibroAutor(libro2);
        autor3.agregarLibroAutor(libro3);

        // Agregar detalleprestamos a libro
        libro.agregarDetallePrestamosLibro(detallePrestamo);
        libro2.agregarDetallePrestamosLibro(detallePrestamo2);
        libro3.agregarDetallePrestamosLibro(detallePrestamo3);

        // Agregar prestamos a estudiantes
        estudiante.agregarPrestamoEstudiante(prestamo);
        estudiante2.agregarPrestamoEstudiante(prestamo2);
        estudiante2.agregarPrestamoEstudiante(prestamo);

        // Mostrar mensaje biblioteca
        Biblioteca.mostrarMensaje(biblioteca.toString());

        //Consultar la cantidad de prestamos en los cuales esta incluido el nombre de un libro
        String nombreLibro=libro.getTitulo();
        int totalPrestamo=biblioteca.consularPrestamoLibro(nombreLibro);
        Biblioteca.mostrarMensaje("\nEl libro "+nombreLibro+ " está en "+totalPrestamo+" préstamo(s)");

        //mostrar la cantidad de préstamos realizados por cada empleado
        LinkedList<String>cantidadPrestamos=biblioteca.mostrarCantidadPrestamos();
        Biblioteca.mostrarMensaje("\nCantidad de préstamos realizado por cada empleado: \n"+cantidadPrestamos);

        //datos del estudiante con más préstamos
        Estudiante estudianteMasPrestamos=biblioteca.mostrarEstudianteMasPrestamos();
        Biblioteca.mostrarMensaje("\nEl estudiante con mas prestamos es:\n" + estudianteMasPrestamos);

        //total de dinero a pagar a los bibliotecarios o salario
        Biblioteca.mostrarMensaje("\nsalario bibliotecarios\n"+bibliotecario.toString());
        Biblioteca.mostrarMensaje(bibliotecario2.toString());

    }
}
    

