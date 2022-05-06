package Controlador;

import bloque1.*;
import static bloque1.Bloque1.devuelveRandom;

public class Main {

    public static void main(String[] args) {

        Persona personaMayorEdad = new Persona("Manolo",25);   
        Bloque1.imprimeDatoPersona(personaMayorEdad);
        
        System.out.println(Bloque1.devuelveRandom(50, 25));

        Persona persona1 = new Persona("Victor",20);
        
        System.out.println(devuelveRandom(2, 17));
        
        Bloque1.imprimeDatoPersona(persona1);

    }

}
