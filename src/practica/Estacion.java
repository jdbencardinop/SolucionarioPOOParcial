package practica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Estacion {
    private String nombre;
    private String ubicacion;
    private String fecha;
    private final Sensor[] sensores = new Sensor[3];
    private ArrayList<String> fechas = new ArrayList<>();

    public Estacion(String nombre, String ubicacion, String fecha) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.sensores[0] = new Temperatura("HOLA", "AAAAA", fecha);
        this.sensores[1] = new MmAgua("HOLA", "BBBBB", fecha);
        this.sensores[2] = new Carga(0, "HOLA", "CCCCC", fecha);
    }
    
    public void addDato(String fecha, int temp, int agua, int carga) {
        this.sensores[0].addRegistro(temp, fecha);
        this.sensores[1].addRegistro(agua, fecha);
        this.sensores[2].addRegistro(carga, fecha);
        this.fechas.add(fecha);
    }
    
    public String getDatos(String fecha){
        return this.fecha + " " + this.sensores[0].getRegistroFecha(fecha) + " " + this.sensores[1].getRegistroFecha(fecha) + " " + this.sensores[2].getRegistroFecha(fecha) + " ";
    }
    
    public double promedioAgua() {
        return this.sensores[1].calcPromedio();
    }
    
    public double promedioTemp() {
        return this.sensores[0].calcPromedio();
    }
    
    public double promedioCarga() {
        return this.sensores[2].calcPromedio();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String ToStringAll() {
        String s = this.nombre + "\n" + this.fechas.size() +"\n";
        for (String fecha1 : fechas) {
            s += this.getDatos(fecha) + "\n";
        }
        return s;
    }
    
}
