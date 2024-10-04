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
public class AppTestLibro {
    private static final Logger LOG = Logger.getLogger(AppTestLibro.class.getName());

    //Pruebas clase Libro
    @Test
    public void unidadesMinimas(){
        LOG.info("Iniciando Test unidadesMinimas");

        Libro libro = new Libro("001", "937-06", "Cien años de soledad",LocalDate.of(2024, 11, 13) , 12, null, null);

        assertThrows(Throwable.class, ()-> new Libro("001", "937-06", "Cien años de soledad",LocalDate.of(2024, 11, 13) , 10, null, null));

        LOG.info("Finalizando Test unidadesMinimas");

    }

    @Test
    public void datosCompletos(){
        LOG.info("Iniciado test datos completos");

        Libro libro = new Libro("001", "937-06", "Cien años de soledad",LocalDate.of(2024, 11, 13) , 12, null, null);

        assertEquals("937-06", libro.getIsbn());

        LOG.info("Finalizando test datos completos");

    }
    
    @Test
    public void detallesMayorA3(){
        LOG.info("Iniciado test Detalles mayor a 3");

        Libro libro = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15, null, null);

        DetallePrestamo detallePrestamo = new DetallePrestamo(5, libro);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(3, libro);
        DetallePrestamo detallePrestamo3 = new DetallePrestamo(4, libro);

        libro.agregarDetallePrestamosLibro(detallePrestamo);
        libro.agregarDetallePrestamosLibro(detallePrestamo2);
        libro.agregarDetallePrestamosLibro(detallePrestamo3);

        var listaesperada=List.of(detallePrestamo,detallePrestamo3);

        assertIterableEquals(listaesperada, libro.detallesMayorA3());

        LOG.info("Finalizando test detalles mayor a 3");
    }
    
}
