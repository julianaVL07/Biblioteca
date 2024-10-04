package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Libro>libros;
    private LinkedList<Bibliotecario>bibliotecarios;
    private LinkedList<Estudiante>estudiantes;
    private LinkedList<Prestamo>prestamos;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros=new LinkedList<>();
        bibliotecarios=new LinkedList<>();
        estudiantes=new LinkedList<>();
        prestamos=new LinkedList<>();
        assert !nombre.isBlank();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Biblioteca - nombre=" + nombre + "\nlibros=\n" + libros + "\nbibliotecarios=\n" + bibliotecarios
                + "\nestudiantes=\n" + estudiantes + "\nprestamos=\n" + prestamos+"\n";
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //metodo para consultar la cantidad de prestamos en los cuales esta incluido el nombre de un libro
    public int consularPrestamoLibro(String nombre){
        int totalPrestamo=0;
        for (Libro libro:libros){
            if (libro.getTitulo().equals(nombre)){
                for (Prestamo prestamo:prestamos){
                    LinkedList <DetallePrestamo>detallesPestamos=prestamo.getDetalleprestamos();
                    for (DetallePrestamo detallePrestamo:detallesPestamos){
                        if (detallePrestamo.getLibro().equals(libro)){
                            totalPrestamo+=1;
                        }
                    }
                    
                }
            }
        }
        return totalPrestamo;
    }

    //metodo para mostrar la cantidad de préstamos realizados por cada empleado
    public LinkedList<String> mostrarCantidadPrestamos(){
        LinkedList<String>cantidadPrestamos=new LinkedList<>();
        for (Bibliotecario bibliotecario:bibliotecarios){
            prestamos=bibliotecario.getPrestamos();
            int totalPrestamos=prestamos.size();
            cantidadPrestamos.add("El bibliotecario "+bibliotecario.getNombre()+" tiene "+totalPrestamos+"\n");
        }
        return cantidadPrestamos;
    }

    //Mostrar datos del estudiante con más préstamos
    public Estudiante mostrarEstudianteMasPrestamos(){
        int masPrestamos=0;
        Estudiante estudianteMasPrestamos=null;
        for (Estudiante estudiante:estudiantes){
            prestamos=estudiante.getPrestamos();
            int totalPrestamos=prestamos.size();
            if (totalPrestamos>masPrestamos){
                masPrestamos=totalPrestamos;
                estudianteMasPrestamos=estudiante;
            }
        }
        return estudianteMasPrestamos;
    }

}


  

