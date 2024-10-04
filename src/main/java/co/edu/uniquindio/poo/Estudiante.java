package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona {
    private LinkedList<Prestamo>prestamos;

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        prestamos=new LinkedList<>();
        assert correo.contains("@");
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
    
    //Metodo para el testeo de Estudiante
    public LinkedList<Prestamo>prestamosMayores3000(){
        LinkedList<Prestamo>prestamosMayores3000=new LinkedList<>();
        for(Prestamo prestamo:prestamos){
            if (prestamo.getValor()>=3000){
                prestamosMayores3000.add(prestamo);
            }
        }
        return prestamosMayores3000;
    }
}
