/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo94.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author guido
 */
public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost:3307/";
    private static final String DB="universidad";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion(){
        
        if (connection ==null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion");
            }
        }
        return connection;
    }
    
}
