/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public enum Grupo {

    C(17.5), D(18.0), E(18.0);

    protected double irpf;
    
    private Grupo(double irpf) {
        this.irpf = irpf;
    }
}
