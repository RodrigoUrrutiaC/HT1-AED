package radio;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.01.2018
 * RadioI
 */

public interface RadioI {
    /**
     * metodo para avanzar de radio
     * @return emisora adelante de la actual
     */
    public String frecAdelante();
    /**
     * metodo para retroceder de emisora
     * @return  emisora anerior de la actual
     */
    public String frecAtras();
    /**
     * metodo para encender la radio
     * @return radio encendida
     */
    public boolean prender();
    /**
     * metodo para apagar la radio
     * @return radio apagada
     */
    public boolean apagar();
    /**
 * metodo que cambia de frecuencia de radio de FM a AM y vicerversa
 * @return frecuencia cambiada
 */
    public String cambioFrecuencia();
    /**
 * metodo para guardar estacion en un boton
 * @param pos posicion de emisora actual
 */
    public void guardarEstacionActual(int pos);
        /**
     * metodo para obtener estacion que se guardo
     * @param pos posicion de emisora actual
     * @return 
     */
    public String obtenerEstacion(int pos);
        /**
     * metodo para obtener la emisora que se sintoniza
     * @return emisora actual
     */
    public String mostrarEstacion();
    /**
 * metodo para obtener el estado de la radio
 * @return estado de la radio
 */
    public boolean estaPrendido();
        /**
     * metodo para obtener frecuencia que tiene la radio
     * @return frecuencia de la radio
     */
    public String obtenerEstado();
    
}
