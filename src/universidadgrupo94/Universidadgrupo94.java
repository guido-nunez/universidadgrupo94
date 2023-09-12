/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo94;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo94.accesoADatos.AlumnoData;
import universidadgrupo94.accesoADatos.Conexion;
import universidadgrupo94.entidades.Alumno;

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
        Alumno Juan = new Alumno (9,25324439, "luis", "David", LocalDate.of(1990, 3, 20), true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(Juan);
        //alu.modificarAlumno(Juan);
        alu.eliminarAlumno(8);
        
    }
    
    
    
    
}
