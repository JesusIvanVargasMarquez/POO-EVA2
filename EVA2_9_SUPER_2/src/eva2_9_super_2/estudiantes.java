/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super_2;

/**
 *
 * @author ivan2
 */
public class estudiantes  extends persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String noControl;
    
    
    //hay que incluir el constructor default y la 
    //llamada al constructor de la super clase
    
    public estudiantes(){
        super();//llamada al constructor de la superclase
        this.noControl = "------"
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
    

