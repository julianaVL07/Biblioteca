/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestBiblioteca {
    private static final Logger LOG = Logger.getLogger(AppTestBiblioteca.class.getName());

    //Pruebas clase Biblioteca

    @Test
    public void DatosCompletos() {
        LOG.info("Iniciando test datosCompletos");

        Biblioteca  biblioteca= new Biblioteca("La central");

        assertEquals("La central", biblioteca.getNombre());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void agregarLibros(){
        LOG.info("Iniciando test agregarLibros");

        Editorial editorial = new Editorial("Editorial Sudamericana", "Grupo Penguin Random House");
        Editorial editorial2 = new Editorial("Alfaguara", "Santillana");
        Editorial editorial3 = new Editorial("Anagrama", "Jorge Herralde");

        Autor autor = new Autor("Gabriel García Márquez", "123456789", "3001234567", "gabriel@gabo.com", 87);
        Autor autor2 = new Autor("Isabel Allende", "987654321", "3007654321", "isabel@allende.com", 81);
        Autor autor3 = new Autor("Mario Vargas Llosa", "456123789", "3004567890", "mario@vargasllosa.com", 88);

        Biblioteca biblioteca = new Biblioteca("La Central");
        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, autor, editorial);
        Libro libro2 = new Libro("002", "978-0-7475-3269-9", "Harry Potter y la piedra filosofal", LocalDate.of(2024, 5, 5), 25, autor2,editorial2);
        Libro libro3 = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15, autor3, editorial3);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        assertTrue(biblioteca.getLibros().contains(libro));
        assertTrue(biblioteca.getLibros().contains(libro2));
        assertTrue(biblioteca.getLibros().contains(libro3));

        assertEquals(3,biblioteca.getLibros().size());

        LOG.info("Finalizando test agregarLibros");
    }

    @Test
    public void datosVacios(){
        LOG.info("Iniciando Test datosVacios");

        Biblioteca  biblioteca= new Biblioteca("La central");

        assertThrows(Throwable.class, ()-> new Biblioteca(" "));

        LOG.info("Finalizando Test datosVacios");

    }

}
