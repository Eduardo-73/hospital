/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class GestioHospital {

    private Hospital hospital;

    public static void main(String[] args) {
        crearPaciente();
    }
    public static Scanner teclado = new Scanner(System.in);

    public static Paciente crearPaciente() {
        NIF nif = new NIF();
        System.out.println("Introduce el número de historial del paciente: ");
        String numeroHistorial = teclado.nextLine();
        System.out.println("Introduce el nombre del paciente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce los apellidos del paciente: ");
        String apellidos = teclado.nextLine();
        Paciente p = new Paciente(numeroHistorial, nombre, apellidos,nif);
        return p;
    }

    public static Medico crearMedico() {
        NIF nif = new NIF();
        System.out.println("Dime la escialida del médico: ");
        String espcialidad = teclado.nextLine();
        System.out.println("Introduce el número de la seguridad Social: ");
        String numSeguridadSocial = teclado.nextLine();
        System.out.println("Introduce el nombre del paciente: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce los apellidos del paciente: ");
        String apellidos = teclado.nextLine();
        System.out.println("Dime el salario del médico: ");
        double salario = teclado.nextDouble();
        Medico m = new Medico(espcialidad, numSeguridadSocial, salario, nombre, apellidos, nif);
        return m;
    }
    
}
