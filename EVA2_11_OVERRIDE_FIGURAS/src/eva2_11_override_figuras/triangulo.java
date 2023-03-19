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
public class triangulo  extends figura{
     private double lado;
    private double altura;

    public triangulo() {
    }

    public triangulo(double base, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (lado * altura)/2;
    }
    @Override
    public double calcularPeri(){
        return lado * lado * lado;
    }
}
