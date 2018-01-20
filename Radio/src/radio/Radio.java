
package radio;

import java.text.DecimalFormat;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.01.2018
 * Radio
 */

//CONSTRUCTOR

public class Radio implements RadioI{
    
    DecimalFormat df = new DecimalFormat("##.#");
    boolean estado;
    String frecActual;
    String frecuencia;
    String[] estaciones = new String[12];
    String[] estados = new String[12];
    
    /**
     * Construcctor
     */
    public Radio (){
		estado = false;
		frecActual = "87.9";
		frecuencia = "FM";	
                estaciones = new String[] {"87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9"};
                estados = new String[] {"FM","FM","FM","FM","FM","FM","FM","FM","FM","FM","FM","FM"};
	}
    /**
     * Constructor de radio con parametros
     * @param estado
     * @param frecuencia
     * @param frecActual 
     */
	public Radio(boolean estado, String frecuencia, String frecActual) {
		this.estado = estado;
		this.frecuencia = frecuencia;
		this.frecActual = frecActual;
	}
    
//METODOS        
     /**
      * Metodo para avanzar de emisora
      * @return frecuencia siguiente a frecuencia actual
      */   
    @Override
    public String frecAdelante() {
        if (frecuencia.equals("FM")){
            double emisora  = Double.parseDouble(frecActual);
            if (emisora < 107.9 ) {  
                frecActual = df.format(emisora + 0.2);
            }
            else {
                frecActual = "87.9";
            }
        }
        if (frecuencia.equals("AM")){
            int emisora  = Integer.parseInt(frecActual);
            if (emisora < 1610) {
                    frecActual = Integer.toString(emisora + 10);
            }
            else {
                    frecActual = "530";
            }
        }
        return frecActual;
    }
/**
 * metodo para ir a la emisora anterior
 * @return frecuencia anterior a la frecuencia actual
 */
    @Override
    public String frecAtras() {
        if (frecuencia.equals("FM")){
            double emisora  = Double.parseDouble(frecActual);
            if (emisora > 87.9 ) {  
                frecActual = df.format(emisora - 0.2);
            }
            
            else{
                frecActual = "107.9";
            }
        }
        if (frecuencia.equals("AM")){
            int emisora  = Integer.parseInt(frecActual);
            if (emisora > 530) {
                    frecActual = Integer.toString(emisora - 10);
            }
            else {
                    frecActual = "1610";
            }
        }
        return frecActual;
    }
/**
 * metodo que prende la radio
 * @return radio encendida
 */
    @Override
    public boolean prender() {
        estado = true;
        return estado;
    }
    
/**
 * metodo que apaga la radio
 * @return 
 */
    @Override
    public boolean apagar() {
	estado = false;
        return estado;
    }
/**
 * metodo que cambia de frecuencia de radio de FM a AM y vicerversa
 * @return frecuencia cambiada
 */
    @Override
    public String cambioFrecuencia() {
        if (frecuencia.equals("FM")){
                frecuencia = "AM";
                frecActual = "530";
        }
        else if (frecuencia.equals("AM")){
                frecuencia = "FM";
                frecActual = "87.9";
        }
        return frecuencia;
    }
/**
 * metodo para guardar estacion en un boton
 * @param pos posicion de emisora actual
 */
    @Override
    public void guardarEstacionActual(int pos) {
        estaciones[pos-1] = frecActual;
        estados[pos-1] = frecuencia;
    }
    /**
     * metodo para obtener estacion que se guardo
     * @param pos posicion de emisora actual
     * @return 
     */
     @Override
    public String obtenerEstacion(int pos) {
        String station=estaciones[pos-1];
        frecuencia = estados[pos-1];
        return station;
    }
    /**
     * metodo para obtener la emisora que se sintoniza
     * @return emisora actual
     */
    @Override
    public String mostrarEstacion() {
	return frecActual;
    }
/**
 * metodo para obtener el estado de la radio
 * @return estado de la radio
 */
    @Override
    public boolean estaPrendido() {
	return estado;
    }
    /**
     * metodo para obtener frecuencia que tiene la radio
     * @return frecuencia de la radio
     */
    @Override
    public String obtenerEstado() {
	return frecuencia;
    }

}