package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private double salario;
    private LinkedList<Prestamo>prestamos;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        prestamos=new LinkedList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario - nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", salario="
                + salario + ", correo=" + correo + "\nprestamos=\n" + prestamos+"\n";
    }

    public void agregarPrestamoBibliotecario(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    
}
