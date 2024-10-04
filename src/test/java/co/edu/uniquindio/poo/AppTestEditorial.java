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
public class AppTestEditorial {
    private static final Logger LOG = Logger.getLogger(AppTestEditorial.class.getName());

    //Pruebas clase Editorial
    @Test
    public void DatosCompletos() {
        LOG.info("Iniciando test datosCompletos");

        Editorial editorial= new Editorial("Anagrama", "Jorge Herralde");

        assertEquals("Anagrama", editorial.getNombre());
        assertEquals("Jorge Herralde",editorial.getDueno());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void cantidadLibros(){
        LOG.info("Iniciando test cantidadLibros");

        Editorial editorial = new Editorial("Editorial Sudamericana", "Grupo Penguin Random House");

        Autor autor = new Autor("Gabriel García Márquez", "123456789", "3001234567", "gabriel@gabo.com", 87);
        Autor autor2 = new Autor("Isabel Allende", "987654321", "3007654321", "isabel@allende.com", 81);

        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, autor, editorial);
        Libro libro2 = new Libro("002", "978-0-7475-3269-9", "Harry Potter y la piedra filosofal", LocalDate.of(2024, 5, 5), 25, autor2,editorial);

        editorial.agregarLibroEditorial(libro);
        editorial.agregarLibroEditorial(libro2);

        assertTrue(editorial.getLibros().contains(libro));
        assertTrue(editorial.getLibros().contains(libro2));

        assertEquals(2,editorial.getLibros().size());

        LOG.info("Finalizando test cantidadLibros");    
    }

    @Test
    public void datosVacios(){
        LOG.info("Iniciando Test datosVacios");

        Editorial editorial = new Editorial("Alfaguara", "Santillana");

        assertThrows(Throwable.class, ()-> new Editorial(" "," "));

        LOG.info("Finalizando Test datosVacios");

    }
}
