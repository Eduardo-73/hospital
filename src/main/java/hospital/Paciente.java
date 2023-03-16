/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author eduardo
 */
public class Paciente {
    
    private String numeroHistoria;

    
    public void tomarMedicinas(String medicina){
        System.out.println("El paciente esta tomando la medicina " + medicina);
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }
}
