package bloque1;

/**
 * clase POJO persona
 * @author alumno
 */
public class Persona {

    //declaro los atributos necesarios
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    //<editor-fold desc="GETTERS Y SETTERS" defaultstate="collapsed">
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//</editor-fold>

    //toString
    @Override
    public String toString() {
        return "La persona de nombre: " + nombre + " tiene: " + edad + " años.";
    }
    
    
    
}
