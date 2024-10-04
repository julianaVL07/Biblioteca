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
public class AppTestBibliotecario {
    private static final Logger LOG = Logger.getLogger(AppTestBibliotecario.class.getName());

    //Pruebas clase Bibliotecario
    @Test
        public void datosEnteros(){
            LOG.info("Iniciado test datos enteros");

            Bibliotecario bibliotecario=new Bibliotecario("Ana Pérez", "123456789", "3001234567", "ana@biblioteca.com",10);

            assertEquals(10, bibliotecario.getAntiguedad());

            LOG.info("Finalizando test datos enteros");

        }

    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datos vacioss");

        assertThrows(Throwable.class, ()-> new Bibliotecario(" ", " ", " ", " ", 0));

        LOG.info("Finalizando test datos vacios");

    }

    @Test
    public void agregarPrestamos(){
        LOG.info("Iniciado test agregar prestamos");

        Bibliotecario bibliotecario = new Bibliotecario("Ana Pérez", "123456789", "3001234567", "ana@biblioteca.com", 10);

        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15),3000);
        Prestamo prestamo2 = new Prestamo(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 20),5000);

        bibliotecario.agregarPrestamoBibliotecario(prestamo);
        bibliotecario.agregarPrestamoBibliotecario(prestamo2);

        assertTrue(bibliotecario.getPrestamos().contains(prestamo));
        assertTrue(bibliotecario.getPrestamos().contains(prestamo2));

        assertEquals(2, bibliotecario.getPrestamos().size());

        LOG.info("Finalizando test agregar prestamo");
    }
    

}
