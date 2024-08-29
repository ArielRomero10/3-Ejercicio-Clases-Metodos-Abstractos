/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Ariel
 */
public class Main {

    public static void main(String[] args) {

        //LAS CLASES ABSTRACTAS NO PERMITEN ESTO
        
        // Animal animal1 = new Animal ();
        
        //INSTANCIAMIENTO DE LOS OBJETOS
        Perro perro1 = new Perro("Policia", "Frida", "hembra", 10, "omnivoro", "Salchicha", "marron");

        Caballo caballo1 = new Caballo(true, true, "Juan", "Macho", 450, "Herbivoros", "Arabe", "Gris");

        Gato gato1 = new Gato("Redondas", "totono", "Macho", 5, "omnivoro", "Anaranjado", "Naranja");

        //COMUNICACIÓN CON LOS OBJETOS (MSJ)
        String nombrePerro1 = perro1.getNombre();
        String nombreCaballo1 = caballo1.getNombre();
        String nombreGato1 = gato1.getNombre();

        System.out.println("---------------NOMBRES---------------------");

        System.out.println("El nombre del perro 1 es: " + nombrePerro1);
        System.out.println("El nombre del caballo 1 es: " + nombreCaballo1);
        System.out.println("El nombre del gatoo 1 es: " + nombreGato1);

        System.out.println("---------------SONIDO QUE EMITE---------------------");
        
        System.out.print("El perro: "  );
        perro1.hacerSonido();

        System.out.print("El gato: "  );
        gato1.hacerSonido();

        System.out.print("El caballo: "  );
        caballo1.hacerSonido();

    }
    
}
