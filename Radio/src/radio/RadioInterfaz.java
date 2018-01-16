package radio;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.01.2018
 * RadioInterfaz
 */
public interface RadioInterfaz {
    
    public String frecAdelante();
    public String frecAtras();
    public boolean prender();
    public boolean apagar();
    public String cambioFrecuencia();
    public String mostrarEstacion();
    public void guardarFrecAM(int frec,int pos);
    public void guardarFrecFM(float frec,int pos);
    
}
