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
public class AppTestPrestamo {
    private static final Logger LOG = Logger.getLogger(AppTestPrestamo.class.getName());

    //Pruebas clase Prestamo
    @Test
    public void cantidadDetalles(){
        LOG.info("Iniciado test cantidadDetalles");

        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 20),5000);

        DetallePrestamo detallePrestamo1 = new DetallePrestamo(5, null);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(3, null);
        DetallePrestamo detallePrestamo3 = new DetallePrestamo(4, null);
        DetallePrestamo detallePrestamo4 = new DetallePrestamo(7, null);
        DetallePrestamo detallePrestamo5 = new DetallePrestamo(1, null);
        DetallePrestamo detallePrestamo6 = new DetallePrestamo(10, null);

        prestamo.agregarDetallePrestamos(detallePrestamo1);
        prestamo.agregarDetallePrestamos(detallePrestamo2);
        prestamo.agregarDetallePrestamos(detallePrestamo3);
        prestamo.agregarDetallePrestamos(detallePrestamo4);
        prestamo.agregarDetallePrestamos(detallePrestamo5);

        assertTrue(prestamo.getDetalleprestamos().contains(detallePrestamo1));
        assertTrue(prestamo.getDetalleprestamos().contains(detallePrestamo2));
        assertTrue(prestamo.getDetalleprestamos().contains(detallePrestamo3));
        assertTrue(prestamo.getDetalleprestamos().contains(detallePrestamo4));
        assertTrue(prestamo.getDetalleprestamos().contains(detallePrestamo5));

        assertEquals(5, prestamo.getDetalleprestamos().size());

        LOG.info("Finalizando test cantidadDetalles");
    }

    @Test
    public void detallesMismoLibro(){
        LOG.info("Iniciado test detalles Mismo Libro");

        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15),3000);

        Libro libro = new Libro("001", "978-3-16-148410-0", "Cien años de soledad",LocalDate.of(2024, 9, 15) , 12, null, null);
        Libro libro3 = new Libro("003", "978-0-553-80370-0", "Fundación", LocalDate.of(2024, 11, 13),15, null, null);

        DetallePrestamo detallePrestamo = new DetallePrestamo(2, libro);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(1, libro3);
        DetallePrestamo detallePrestamo3 = new DetallePrestamo(3, libro3);

        prestamo.agregarDetallePrestamos(detallePrestamo);
        prestamo.agregarDetallePrestamos(detallePrestamo2);
        prestamo.agregarDetallePrestamos(detallePrestamo3);

        var listaesperada=List.of(detallePrestamo2,detallePrestamo3);

        assertIterableEquals(listaesperada, prestamo.detallesMismoLibro(libro3));

        LOG.info("Finalizando test detalles Mismo Libro");
        
    }

    @Test
    public void datosDobles(){
        LOG.info("Iniciado test datosDobles");

        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15),3000);

        assertEquals(3000, prestamo.getValor());

        LOG.info("Finalizando test datosDobles");

    }
        
}
