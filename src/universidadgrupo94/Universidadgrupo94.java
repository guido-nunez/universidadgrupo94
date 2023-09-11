/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo94;

import java.sql.Connection;
import universidadgrupo94.accesoADatos.Conexion;

/**
 *
 * @author guido
 */
public class Universidadgrupo94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = Conexion.getConexion();
    }
    
}
