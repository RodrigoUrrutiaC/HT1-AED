/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Natito
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of frecAdelante method, of class Radio.
     */
    @Test
    public void testFrecAdelante() {
        System.out.println("frecAdelante");
        Radio instance = new Radio();
        String expResult = "88.1";
        String result = instance.frecAdelante();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of frecAtras method, of class Radio.
     */
    @Test
    public void testFrecAtras() {
        System.out.println("frecAtras");
        Radio instance = new Radio();
        String expResult = "107.9";
        String result = instance.frecAtras();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of prender method, of class Radio.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
        Radio instance = new Radio();
        boolean expResult = true;
        boolean result = instance.prender();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.apagar();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of cambioFrecuencia method, of class Radio.
     */
    @Test
    public void testCambioFrecuencia() {
        System.out.println("cambioFrecuencia");
        Radio instance = new Radio();
        String expResult = "AM";
        String result = instance.cambioFrecuencia();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of guardarEstacionActual method, of class Radio.
     */
    @Test
    public void testGuardarEstacionActual() {
        System.out.println("guardarEstacionActual");
        int pos = 1;
        Radio instance = new Radio();
        instance.guardarEstacionActual(pos);

    }

    /**
     * Test of obtenerEstacion method, of class Radio.
     */
    @Test
    public void testObtenerEstacion() {
        System.out.println("obtenerEstacion");
        int pos = 1;
        Radio instance = new Radio();
        String expResult = "87.9";
        String result = instance.obtenerEstacion(pos);
        assertEquals(expResult, result);

    }

    /**
     * Test of mostrarEstacion method, of class Radio.
     */
    @Test
    public void testMostrarEstacion() {
        System.out.println("mostrarEstacion");
        Radio instance = new Radio();
        String expResult = "87.9";
        String result = instance.mostrarEstacion();
        assertEquals(expResult, result);

    }

    /**
     * Test of estaPrendido method, of class Radio.
     */
    @Test
    public void testEstaPrendido() {
        System.out.println("estaPrendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.estaPrendido();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of obtenerEstado method, of class Radio.
     */
    @Test
    public void testObtenerEstado() {
        System.out.println("obtenerEstado");
        Radio instance = new Radio();
        String expResult = "FM";
        String result = instance.obtenerEstado();
        assertEquals(expResult, result);
    }
    
}
