package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private LinkedList<DetallePrestamo>detalleprestamos;
    private double valor;
    
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion,double valor) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        detalleprestamos=new LinkedList<>();
        this.valor=valor;
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
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    } 
    
    @Override
    public String toString() {
        return "Prestamo - fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion+", valorPrestamo="+valor
                + "\ndetallesprestamo=\n" + detalleprestamos+"\n";
    }
  
    public void agregarDetallePrestamos(DetallePrestamo detallePrestamo){
        detalleprestamos.add(detallePrestamo);
    }

    
}
