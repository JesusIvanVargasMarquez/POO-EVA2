/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_override_figuras;

/**
 *
 * @author ivan2
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circulo circu = new circulo(10);
        System.out.println("Area: " + circu.calcularArea());
        System.out.println("Perimetro: " + circu.calcularPeri());
        
    }
    
}
