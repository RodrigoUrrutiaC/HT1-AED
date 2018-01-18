package radio;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.01.2018
 * RadioI
 */
public interface RadioI {
    
    public String frecAdelante();
    public String frecAtras();
    public boolean prender();
    public boolean apagar();
    public String cambioFrecuencia();
    public void guardarEstacionActual(int pos);
    public String obtenerEstacion(int pos);
    public String mostrarEstacion();
    public boolean estaPrendido();
    public String obtenerEstado();
    
}
