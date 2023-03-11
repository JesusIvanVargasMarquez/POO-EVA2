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
public class persona {
    private int ID;
    private String nombre;
    private int edad;
    
    public int getID(){
        return ID;
    }
    public void setID(int valor){
        ID = valor;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("Los datos de la persona son: ");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}