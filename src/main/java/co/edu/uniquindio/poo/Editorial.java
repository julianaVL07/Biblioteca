package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Editorial {
    private String nombre;
    private String dueno;
    private LinkedList<Libro>libros;

    public Editorial(String nombre, String dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
        libros=new LinkedList<>();
        assert !nombre.isBlank();
        assert !dueno.isBlank();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Editorial - nombre=" + nombre + ", dueno=" + dueno + ", libros=\n" + libros+"\n";
    }

    public void agregarLibroEditorial(Libro libro){
        libros.add(libro);
    }

}
