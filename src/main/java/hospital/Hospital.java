/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.List;

/**
 *
 * @author eduardo
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numCamas;
    private List<Empleado> listaEmp;
    private List<Paciente> listapa;

    public Hospital(String nombre, String direccion, int numCamas, List<Empleado> listaEmp, List<Paciente> listapa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numCamas = numCamas;
        this.listaEmp = listaEmp;
        this.listapa = listapa;
    }
    
    public void contratarEmpleado(Empleado emp){
        listaEmp.add(emp);
    }
    
    public void ingredarPaciente(Paciente pac){
        listapa.add(pac);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public List<Empleado> getListaEmp() {
        return listaEmp;
    }

    public void setListaEmp(List<Empleado> listaEmp) {
        this.listaEmp = listaEmp;
    }

    public List<Paciente> getListapa() {
        return listapa;
    }

    public void setListapa(List<Paciente> listapa) {
        this.listapa = listapa;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", direccion=" + direccion + ", numCamas=" + numCamas + ", listaEmp=" + listaEmp + ", listapa=" + listapa + '}';
    }
}
