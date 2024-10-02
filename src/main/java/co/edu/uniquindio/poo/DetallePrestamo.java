package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int cantidad;
    private Libro libro;

    public DetallePrestamo(int cantidad, Libro libro) {
        this.cantidad = cantidad;
        this.libro=libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "DetallePrestamo - cantidad=" + cantidad + ", libro=" + libro.getTitulo() + "\n";
    }   
    
}
