package bloque1;

import java.util.Random;

/**
 * clase con método devuelveRandom e imprimeDatoPersona
 * @author alumno
 */
public class Bloque1 {

    /**
     * Este metodo coge dos numeros enteros por parámetros y devuelve uno de ellos alatoriamente
     * @param num1 numero entero 
     * @param num2 numero entero
     * @return retorno el número asignado aleatoriamente entre los dos parámetros
     */
    public static int devuelveRandom(int num1, int num2){
        //declarro una variable que voy a devolver
        int devolucion=0;
        
        //declaro un objeto random para hcer uso del método nextInt()
        Random random = new Random();
        
        if ( random.nextInt(2) == 1) {
            devolucion = num1;
        }else{
            devolucion = num2;
        }
        
        return devolucion;
    }//fin del metodo devuelveRandom
    
    /**
     * método que recibe un objeto Persona y printea los datos de esta persona además de si es mayor o menor de edad
     * @param persona objeto de la clase Persona
     */
    public static void imprimeDatoPersona(Persona persona){
        //croe una variable para ver si es mayor de edad o no
        boolean mayorEdad=false;
        
        if (persona.getEdad()>=18) {
            mayorEdad=true;
        }
        
        //printeo los datos de la persona
        System.out.println(persona.toString());
        System.out.println("ES MAYOR DE EDAD: " + mayorEdad);
    }//fin del metodo
    
}//fin de la clase
