package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private double salario;
    private LinkedList<Prestamo>prestamos;
    private int antiguedad;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo,int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario =0;
        this.antiguedad=antiguedad;
        prestamos=new LinkedList<>();
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
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

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    @Override
    public String toString() {
        return "Bibliotecario - nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono +  ", correo=" + correo+", antiguedad="+antiguedad +" años "+", salario="+ salario +"\nprestamos=\n" + prestamos+"\n";
    }

    public void agregarPrestamoBibliotecario(Prestamo prestamo){
        prestamos.add(prestamo);
        this.salario=calcularTotalAPagar();
    }

    //metodo que calcula el total de dinero a pagar a los bibliotecarios
    public double calcularTotalAPagar() {
        double totalBase = 0;

        for (Prestamo prestamo : prestamos) {
            totalBase += prestamo.getValor() * 0.20;
        }
        double bonificacion = totalBase * (0.02 * antiguedad);
        return totalBase + bonificacion;
    }
}
