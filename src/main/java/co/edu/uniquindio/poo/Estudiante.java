package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona {
    private LinkedList<Prestamo>prestamos;

    public Estudiante(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        prestamos=new LinkedList<>();
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante - nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo+"\nprestamos=\n"
                + prestamos+ "\n";
    }

    public void agregarPrestamoEstudiante(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    
}
