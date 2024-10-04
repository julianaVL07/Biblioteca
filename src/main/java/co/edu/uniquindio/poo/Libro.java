package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String titulo;
    private LocalDate fecha;
    private int unidadesDisponibles;
    private LinkedList<DetallePrestamo>detalleprestamos;
    private Autor autor;
    private Editorial editorial;

    public Libro(String codigo, String isbn, String titulo, LocalDate fecha, int unidadesDisponibles, Autor autor, Editorial editorial) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        detalleprestamos=new LinkedList<>();
        this.autor=autor;
        this.editorial=editorial;
        assert unidadesDisponibles>10;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public LinkedList<DetallePrestamo> getDetalleprestamos() {
        return detalleprestamos;
    }

    public void setDetalleprestamos(LinkedList<DetallePrestamo> detalleprestamos) {
        this.detalleprestamos = detalleprestamos;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro - codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", fecha=" + fecha
                + ", unidadesDisponibles=" + unidadesDisponibles + ", autor=" + autor.getNombre() + ", editorial=" + editorial.getNombre()+", detalleprestamos=\n" + detalleprestamos+"\n";
    }

    public void agregarDetallePrestamosLibro(DetallePrestamo detallePrestamo){
        detalleprestamos.add(detallePrestamo);
    }

    public LinkedList<DetallePrestamo> detallesMayorA3(){
        LinkedList<DetallePrestamo> detallesCantidadRequerida=new LinkedList<>();
        for(DetallePrestamo detallePrestamo:detalleprestamos){
            if (detallePrestamo.getCantidad()>3){
                detallesCantidadRequerida.add(detallePrestamo);
            }
        }
        return detallesCantidadRequerida;
    }
}
