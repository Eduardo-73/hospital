/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public class Medico extends Empleado implements Nadar{
    
    private String especialidad;

    public Medico(String especialidad, String numSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public void tratar(Paciente paciente, String medicina){
        System.out.println("El paciente " + paciente.getNombre() + 
                "esta siendo tratado por el medico " + Medico.this.getNombre() 
                + " y esta tomando la medicina con el nombre " + medicina);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + '}';
    }
    
    @Override
    public double calcularIRPF(){
        double irfp = 0;
        if(especialidad.equals("Ornitorrino")){
            irfp = this.getSalario() * 0.25;
        }else{
            irfp = this.getSalario() * 0.235;
        }
        return irfp;
    }

    @Override
    public void nadar() {
        System.out.println("El medico esta nadando");
    }
}

