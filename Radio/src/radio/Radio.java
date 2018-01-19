
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
    
    public Radio (){
		estado = false;
		frecActual = "87.9";
		frecuencia = "FM";
                estaciones = new String[] {"87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9","87.9"};
                estados = new String[] {"FM","FM","FM","FM","FM","FM","FM","FM","FM","FM","FM","FM"};
                        
	}
	
	public Radio(boolean estado, String frecuencia, String frecActual) {
		this.estado = estado;
		this.frecuencia = frecuencia;
		this.frecActual = frecActual;
	}
    
//METODOS        
        
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

    @Override
    public boolean prender() {
        estado = true;
        return estado;
    }
    

    @Override
    public boolean apagar() {
	estado = false;
        return estado;
    }

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

    @Override
    public void guardarEstacionActual(int pos) {
        estaciones[pos-1] = frecActual;
        estados[pos-1] = frecuencia;
    }
    
     @Override
    public String obtenerEstacion(int pos) {
        String station=estaciones[pos-1];
        frecuencia = estados[pos-1];
        return station;
    }
    
    @Override
    public String mostrarEstacion() {
	return frecActual;
    }

    @Override
    public boolean estaPrendido() {
	return estado;
    }
    
    @Override
    public String obtenerEstado() {
	return frecuencia;
    }
}
