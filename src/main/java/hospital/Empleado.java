/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public abstract class Empleado {
    
    private String numSeguridadSocial;
    private double salario;

    public Empleado(String numSeguridadSocial, double salario) {
        this.numSeguridadSocial = numSeguridadSocial;
        this.salario = salario;
    }

    public abstract double calcularIRPF();

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numSeguridadSocial=" + numSeguridadSocial + ", salario=" + salario + '}';
    }

}
