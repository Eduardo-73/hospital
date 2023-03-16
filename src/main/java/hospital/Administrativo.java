/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public class Administrativo extends Empleado{

    private Grupo grupo;

    public Administrativo(Grupo grupo,String numSeguridadSocial, double salario) {
        super(numSeguridadSocial, salario);
        this.grupo = grupo;
    }

    public void registrarDocumentos(String nombreDoc) {
        System.out.println("El documento esta registrado al doctor: "
                + nombreDoc);
    }

    @Override
    public double calcularIRPF() {
        double irpf = 1;
        return irpf;
    }
    
    
}
