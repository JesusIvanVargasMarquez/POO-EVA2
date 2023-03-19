/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_override;

/**
 *
 * @author ivan2
 */
public class EVA2_10_override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      persona perso1 = new persona();
      persona perso2 = new persona("ivan vargas",18);
      System.out.println(perso2);
      System.out.println(perso1);
      
    }
    
}
class persona{
    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = "----";
        this.edad = 0;
    }

    persona() {
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        //no estamos invocando el metodo sobreescrito de la superclase
        //aqui estamos remplazando totalmente a toString de la superclase
        String cade = "Datos:" +
                      "Nombre:" + nombre + "\n" +
                      "Edad: " + edad;
        return cade;
    }
    
}
