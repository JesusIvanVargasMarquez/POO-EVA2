/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author ivan2
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        estudiante estu = new estudiante();
        estu.setNombre("juan");
        estu.setApellido("Guerra");
        estu.setEdad(18);
        estu.setNoControl("22550351");
        System.out.println("imprimir datos estudiante:");
    
        
        proveedores prove1 = new proveedores();
        prove1.setNombre("miguel");
        prove1.setApellido("caballero");
        prove1.setEdad(40);
        prove1.setRfc("m8192uhd302hf329e303fh");
        
    }
    
}
