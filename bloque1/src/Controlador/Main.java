package Controlador;

import bloque1.*;

public class Main {

    public static void main(String[] args) {
        Persona personaMayorEdad = new Persona("Manolo",25);   
        Bloque1.imprimeDatoPersona(personaMayorEdad);
        
        System.out.println(Bloque1.devuelveRandom(50, 25));
    }

}
