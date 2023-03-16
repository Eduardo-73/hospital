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
public abstract class Persona extends Empleado {

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos, String numSeguridadSocial, double salario) {
        super(numSeguridadSocial, salario);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void renovarNIF(LocalDate fechaSolicitud) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
