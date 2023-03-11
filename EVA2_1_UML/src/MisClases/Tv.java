/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author ivan2
 */
public class Tv {
 private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int valor){
        canal = valor;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean valor){
        power = valor;
    }
    public void imprimirDatos(){
        System.out.println("El estado de la Tv es: ");
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
}
