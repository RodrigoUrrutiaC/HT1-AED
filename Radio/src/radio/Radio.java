
package radio;

import java.text.DecimalFormat;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.01.2018
 * Radio
 */

//CONSTRUCTOR

public class Radio implements RadioInterfaz{
    
    DecimalFormat df = new DecimalFormat("##.#");
    	public boolean estado;
	public String frecActual;
	public String frecuencia;
	
    
    public Radio (){
		
		estado = false;
		frecActual = "88.1";
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
		
		double emisora  = Double.parseDouble(frecActual);
		
		if (frecuencia.equals("FM")){
			
			if (emisora > 107.8 ) {
				
			}
			
			if (emisora < 107.8) {
				emisora = emisora + 0.1;
			}
		}
		
		if (frecuencia.equals("AM")){
			
			if (emisora > 1600) {
				
			}
			
			if (emisora > 560) {
				emisora = emisora + 10;
			}	
		}
		
		String frecActual = String.valueOf(emisora);
		
		return frecActual;
	}

    @Override
    public String frecAtras() {
		
		double emisora  = Double.parseDouble(frecActual);
		
		if (frecuencia.equals("FM")){
			
			if (emisora > 107.8 ) {
				
			}
			
			if (emisora < 107.8) {
				emisora = emisora - 0.1;
			}
		}
		
		if (frecuencia.equals("AM")){
			
			if (emisora > 1600) {
				
			}
			
			if (emisora > 560) {
				emisora = emisora - 10;
			}	
		}
		
		String frecActual = String.valueOf(emisora);
		
		return frecActual;
	}

    @Override
    public boolean prender() {
		
		boolean estado = true;
		
		return estado;
	}
    

    @Override
   public boolean apagar() {
		
		boolean estado = false;
		
		return estado;
	}

    @Override
    public String cambioFrecuencia() {
		
		if (frecuencia.equals("FM")){
			frecuencia = "AM";
		}
		
		if (frecuencia.equals("AM")){
			frecuencia = "FM";	
		
		}
		
		return frecuencia;
	}

    @Override
   public String mostrarEstacion() {
		
		String estacion = getFrecActual();
		
		return estacion;
	}

    @Override
    public void guardarFrecAM(int frec, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public void guardarFrecFM(float frec, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //SETS Y GETS
    
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
    
}
