/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */
public class Gato extends Animal {
    
     private String formaDeOrejas;

    public Gato(String formaDeOrejas, String nombre, String sexo, double peso, String alimentacion, String raza, String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.formaDeOrejas = formaDeOrejas;
    }
    
    @Override
    public void hacerSonido(){
        
        System.out.println("Miauuuuu Miauuu");
    }

    public String getFormaDeOrejas() {
        return formaDeOrejas;
    }

    public void setFormaDeOrejas(String formaDeOrejas) {
        this.formaDeOrejas = formaDeOrejas;
    }

     
     
}
