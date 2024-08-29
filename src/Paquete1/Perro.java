/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */

//CLASE CONCRETA
public  class Perro extends Animal {
    
    String oficioPerro;

    public Perro(String oficioPerro, String nombre, String sexo, double peso, String alimentacion, String raza, String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.oficioPerro = oficioPerro;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Gua Gua gua");
    }

    public String getOficioPerro() {
        return oficioPerro;
    }

    public void setOficioPerro(String oficioPerro) {
        this.oficioPerro = oficioPerro;
    }

    
    
    
}
