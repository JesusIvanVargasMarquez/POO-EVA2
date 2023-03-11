/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author ivan2
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal Animal = new animal(":3",10);
                
        mamifero mamifero1 = new  mamifero("negro","asdafs",10);
    }
    
}
 

class animal{
    private String nombre;
    private int peso;
    
    public animal(){
        System.out.println("its alive!!");
    }

    public animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("its alive!!  constructor 2");
    }
    
    public void respirar(){
        System.out.println("estoy respirando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}

class mamifero extends animal{
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

   

    public mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso); //llamada al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("soy un mamifero constructor 2");
    }
    
    public mamifero(){
        //super --> apuntador a la superclase
        //lo primero a llamar en un constructor es llamar
        //al constructor de la superclase
        super();//llamada al constructor default
        
        System.out.println("soy un mamifero!!");
    }
    
}
 

class canes extends mamifero{

   
    }
    
    

