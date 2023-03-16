/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author eduardo
 */
public class NIF {

    private int numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public static Random gen = new Random();

    public NIF() {
        this.numero = gen.nextInt(1, 9);
        this.letra = letra;
        this.fechaCaducidad = fechaCaducidad;
    }

  
    private char calcularLetra() {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int calculo = numero % 23;
        char letra = letrasDNI[calculo];
        return letra;
    }

    public LocalDate renovar(LocalDate fechaSolicitudRenovacion) {
        LocalDate fechaRenovacion = fechaSolicitudRenovacion.plusYears(10);
        setFechaCaducidad(fechaRenovacion);
        return fechaRenovacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
