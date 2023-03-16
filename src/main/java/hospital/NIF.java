/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author eduardo
 */
public class NIF {
    
    private long numero; 
    private char letra;
    private LocalDate fechaCaducidad;

    public void crearNIF(long numero, LocalDate fechaCaducida){
        
    }
    
    private static char calcularLetra(){
        char letra = 'a';
        return letra;
    }
    
    public void renovar(LocalDate fechaSolicitudRenovacion){
        
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "NIF{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
}
