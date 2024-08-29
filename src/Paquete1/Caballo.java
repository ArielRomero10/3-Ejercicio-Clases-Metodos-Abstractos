/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */
public class Caballo extends Animal {
    
    private boolean domesticado;
    private boolean agilidad;

    public Caballo(boolean domesticado, boolean agilidad, String nombre, String sexo, double peso, String alimentacion, String raza, String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.domesticado = domesticado;
        this.agilidad = agilidad;
    }
    
    @Override
    public void hacerSonido(){
    
        System.out.println("Relinchar");
    }

    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }

    public boolean isAgilidad() {
        return agilidad;
    }

    public void setAgilidad(boolean agilidad) {
        this.agilidad = agilidad;
    }
    
    
    
}
