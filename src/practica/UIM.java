package practica;

/**
 *
 * @author Estudiante
 */
public class UIM {
    private String pathRegistro;
    private final Ciudad[] ciudades = new Ciudad[12];

    public UIM() {
        this.pathRegistro = "Registro.txt";
    }
    
    public UIM(String path) {
        this.pathRegistro = path;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }    

    public String getPathRegistro() {
        return pathRegistro;
    }

    public void setPathRegistro(String pathRegistro) {
        this.pathRegistro = pathRegistro;
    }

}
