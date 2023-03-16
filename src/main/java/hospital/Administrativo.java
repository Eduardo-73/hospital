/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(String numSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public void registrarDocumentos(String nombreDoc) {
        System.out.println("El documento esta registrado al doctor: "
                + nombreDoc);
    }

    @Override
    public double calcularIRPF() {
        double irpf = 0;
        if (grupo == grupo.C) {
            irpf = (grupo.C.irpf / 100) * this.getSalario();
        } else if (grupo == grupo.D) {
            irpf = (grupo.D.irpf / 100) * this.getSalario();
        } else {
            irpf = (grupo.E.irpf / 100) * this.getSalario();
        }
        return irpf;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + '}';
    }

}
