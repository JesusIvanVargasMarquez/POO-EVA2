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
public class circulo extends figura {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    circulo() {
       
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
       return Math.PI * (radio * radio); 
    }
    
    @Override
    public double calcularPeri(){
        return Math.PI * (radio * 2);
    }
}
