package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Autor extends Persona {

    private int edad;
    private LinkedList<Libro>libros;


    public Autor(String nombre, String cedula, String telefono, String correo, int edad) {
        super(nombre, cedula, telefono, correo);
        this.edad = edad;
        libros=new LinkedList<>();
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor - nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", telefono=" + telefono
                + ", libros=\n" + libros + ", correo=" + correo+"\n";
    }

    public void agregarLibroAutor(Libro libro){
        libros.add(libro);
    }

    public LinkedList<Libro>librosMismoEditorial(Editorial editorial){
        LinkedList<Libro>librosMismaEditorial =new LinkedList<>();
        for (Libro libro:libros){
            if (libro.getEditorial().equals(editorial)){
                librosMismaEditorial.add(libro);
            }
        }
        return librosMismaEditorial;
    }
    
}
