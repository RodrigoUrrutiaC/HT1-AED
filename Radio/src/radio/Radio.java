
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
    String[] estaciones = new String[11];
    
    public Radio (){
		estado = false;
		frecActual = "87.9";
		frecuencia = "FM";	
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
        else{
                frecuencia = "FM";
                frecActual = "87.9";
        }
        return frecuencia;
    }

    @Override
    public void guardarEstacionActual(int pos) {
        estaciones[pos-1] = frecActual;
    }
    
     @Override
    public String obtenerEstacion(int pos) {
        String station=estaciones[pos-1];
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

    
    //SETS Y GETS
    /**
    public boolean getEstado() {
		return estado;
	}

    public void setEstado(boolean estado) {
		this.estado = estado;
	}

    public String getFrecActual() {
		return frecActual;
	}

    public void setFrecActual(String frecActual) {
		this.frecActual = frecActual;
	}

    public String getFrecuencia() {
		return frecuencia;
	}

    public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
     */
}
