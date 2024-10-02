package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private LinkedList<DetallePrestamo>detalleprestamos;
    
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        detalleprestamos=new LinkedList<>();
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LinkedList<DetallePrestamo> getDetalleprestamos() {
        return detalleprestamos;
    }

    public void setDetalleprestamos(LinkedList<DetallePrestamo> detalleprestamos) {
        this.detalleprestamos = detalleprestamos;
    }

    @Override
    public String toString() {
        return "Prestamo - fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion
                + "\ndetallesprestamo=\n" + detalleprestamos+"\n";
    }
  
    public void agregarDetallePrestamos(DetallePrestamo detallePrestamo){
        detalleprestamos.add(detallePrestamo);
    }
}
