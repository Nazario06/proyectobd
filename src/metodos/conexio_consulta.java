/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.accessibility.AccessibleText;

/**
 *
 * @author nnach
 */
public class conexio_consulta {

    public static void eliminar_reg(String Nombre) {
       String q  = "DELETE FROM inventario WHERE idproducto='"+Nombre+"'";
        ejecutar(q);
    }
    public static void ejecutar(String q){
        try {
            
        } catch (Exception e) {
        }
    }
  
    
}
