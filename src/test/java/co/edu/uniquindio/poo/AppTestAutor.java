/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestAutor {
    private static final Logger LOG = Logger.getLogger(AppTestAutor.class.getName());

    //Pruebas clase Autor
    @Test
    public void cantidadLibros(){
        LOG.info("Iniciado test cantidad libros");

        Autor autor=new Autor("Gabriel García Márquez", "123456789", "3001234567", "gabriel@gabo.com", 87);

        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, null, null);
        Libro libro2 = new Libro("002", "978-0-7475-3269-9", "Harry Potter y la piedra filosofal", LocalDate.of(2024, 5, 5), 25, null, null);
        Libro libro3 = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15,null,null);
        Libro libro4=new Libro(null, null, "La odisea", null, 12, null, null);
        
        autor.agregarLibroAutor(libro);
        autor.agregarLibroAutor(libro2);
        autor.agregarLibroAutor(libro3);
        autor.agregarLibroAutor(libro4);

        assertTrue(autor.getLibros().contains(libro));
        assertTrue(autor.getLibros().contains(libro2));
        assertTrue(autor.getLibros().contains(libro3));
        assertTrue(autor.getLibros().contains(libro4));

        assertEquals(4, autor.getLibros().size());

        LOG.info("Finalizando test cantidad libros");
    }

    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datos vacios");

        assertThrows(Throwable.class, ()-> new Autor(" ", " ", " ", " ", 0));

        LOG.info("Finalizando test datos vacios");

    }

    @Test
    public void ListaLibrosMismaEditorial(){
        LOG.info("Iniciado test Lista Libros Misma Editorial");

        Autor autor = new Autor("Gabriel García Márquez", "123456789", "3001234567", "gabriel@gabo.com", 87);

        Editorial editorial = new Editorial("Editorial Sudamericana", "Grupo Penguin Random House");
        Editorial editorial2 = new Editorial("Alfaguara", "Santillana");

        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, autor, editorial);
        Libro libro2 = new Libro("002", "978-0-7475-3269-9", "Harry Potter y la piedra filosofal", LocalDate.of(2024, 5, 5), 25, autor, editorial2);
        Libro libro3 = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15, autor, editorial);

        autor.agregarLibroAutor(libro);
        autor.agregarLibroAutor(libro2);
        autor.agregarLibroAutor(libro3);

        var listaesperada=List.of(libro,libro3);

        assertIterableEquals(listaesperada, autor.librosMismoEditorial(editorial));

        LOG.info("Finalizando test Lista Libros Misma Editorial");
    }
        
}
