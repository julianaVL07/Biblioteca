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
public class AppTestEstudiante {
    private static final Logger LOG = Logger.getLogger(AppTestEstudiante.class.getName());

    //Pruebas clase Estudiante
    @Test
        public void datosCompletos(){
            LOG.info("Iniciado test datos completos");

            Estudiante estudiante=new Estudiante("Juan Pérez", "123456789", "3001234567", "juan@estudiante.com");

            assertEquals("123456789", estudiante.getCedula());

            LOG.info("Finalizando test datos completos");

        }

    @Test
    public void ListaPrestamosMayores3000(){
        LOG.info("Iniciado test Lista Prestamos Mayores 3000");

        Estudiante estudiante = new Estudiante("Juan Pérez", "123456789", "3001234567", "juan@estudiante.com");

        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15),3000);
        Prestamo prestamo2 = new Prestamo(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 20),5000);
        Prestamo prestamo3 = new Prestamo(LocalDate.of(2024, 11, 15), LocalDate.of(2024, 10, 20),1000);

        estudiante.agregarPrestamoEstudiante(prestamo);
        estudiante.agregarPrestamoEstudiante(prestamo2);
        estudiante.agregarPrestamoEstudiante(prestamo3);

        var listaesperada=List.of(prestamo,prestamo2);

        assertIterableEquals(listaesperada, estudiante.prestamosMayores3000());

        LOG.info("Finalizando test Lista Prestamos Mayores 3000");
    }

    @Test
    public void validacionCorreo(){
        LOG.info("Iniciando Test validacionCorreo");

        Estudiante  estudiante= new Estudiante("Juan Pérez", "123456789", "3001234567", "juan@estudiante.com");

        assertThrows(Throwable.class, ()-> new Estudiante("Juan Pérez", "123456789", "3001234567", "juanestudiante.com"));

        LOG.info("Finalizando Test validacionCorreo");

    }

}
