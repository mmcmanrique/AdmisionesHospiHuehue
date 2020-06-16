/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RojeruSan
 */
public class Conexion {
    
    public static Connection conection = null;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost/crud_java", "root", "");
            return conection;
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex); HOLA ESTO ES UNA PRUEBA
        }
    }
}
