/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public class Medico extends Empleado{
    
    private String espcialidad;

    
    public void tratar(Paciente paciente, String medicina){
        
    }

    public String getEspcialidad() {
        return espcialidad;
    }

    public void setEspcialidad(String espcialidad) {
        this.espcialidad = espcialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "espcialidad=" + espcialidad + '}';
    }
    
    @Override
    public double calcularIRPF(){
        double irfp = 1;
        return irfp;
    }

}

