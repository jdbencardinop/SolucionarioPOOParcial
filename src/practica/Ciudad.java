package practica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private String nombre;
    private final ArrayList<Estacion> estaciones = new ArrayList<>();

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }
    
    public void ActualizarRegistro() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void main(String[] args) {
        
    }
}
