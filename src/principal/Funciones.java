/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RojeruSan
 */
public class Funciones {
    
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
    public static boolean isRegister(Sentencias s){
        String sql = Sentencias.REGISTRAR;
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getHistoriaclinica());
            ps.setString(2, s.getApellido1());
            ps.setString(3, s.getApellido2());
            ps.setString(4, s.getApellido3());
            ps.setString(5, s.getNombres());
            ps.setString(6, s.getSexo());
            ps.setString(7, s.getEdad());
            ps.setString(8, s.getEdadmeses());
            ps.setString(9, s.getEdaddias());
            ps.setString(10, s.getConyuge());
            ps.setString(11, s.getFechanacimiento());
            ps.setString(12, s.getLugardenacimiento());
            ps.setString(13, s.getNacionalidad());
            ps.setString(14, s.getDPI());
            ps.setString(15, s.getEstadocivil());
            ps.setString(16, s.getGrupoetnico());
            ps.setString(17, s.getReligion());
            ps.setString(18, s.getAfiliadoaligss());
            ps.setString(19, s.getNumerotelefono());
            ps.setString(20, s.getEscolaridad());
            ps.setString(21, s.getProfesion());
            ps.setString(22, s.getLugardetrabajo());
            ps.setString(23, s.getResidencia());
            ps.setString(24, s.getNombrepadre());
            ps.setString(25, s.getPadrevivo());
            ps.setString(26, s.getNombremadre());
            ps.setString(27, s.getMadreviva());
            ps.setString(28, s.getEncargado());
            ps.setString(29, s.getDireccionencargado());
            ps.setString(30, s.getClasedeadmision());
            ps.setString(31, s.getServiciodeingreso());
            ps.setString(32, s.getOtraespecialidad());
            ps.setString(33, s.getFecha());
            ps.setString(34, s.getHora());
            ps.setString(35, s.getMedico());
            ps.setString(36, s.getAdmitidopor());
            ps.setString(37, s.getIngresa());
            ps.setString(38, s.getIngresaa());
            ps.setString(39, s.getTipodeadmision());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isUpdate(Sentencias s){
        String sql = Sentencias.ACTUALIZAR;
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getHistoriaclinica());
            ps.setString(2, s.getNombres());
            ps.setString(3, s.getApellido1());
            ps.setString(4, s.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isDelete(Sentencias s){
        String sql = Sentencias.ELIMINAR;
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isTruncate(){
        String sql = Sentencias.ELIMINAR_TODO;
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setListar(String buscar){
        DefaultTableModel modelo = (DefaultTableModel)Crud.tabla.getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        
        String sql = "";
        
        if(buscar.equals("")){
            //sql = Sentencias.LISTAR;
        }else{
            sql = "SELECT * FROM usuarios WHERE ("
                    /*+ "historiaclinica LIKE'%"+buscar+"%' OR "
                    + "nombres LIKE'%"+buscar+"%' OR "
                    + "apellido1 LIKE'%"+buscar+"%' OR "
                    + "apellido2 LIKE'%"+buscar+"%' OR "
                    + "nombrepadre LIKE'%"+buscar+"%' OR "*/
                    + "historiaclinica LIKE'%"+buscar+"%'"
                    + ")";
        }
        
        String datos[] = new String[8];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("historiaclinica");
                datos[2] = rs.getString("nombres");
                datos[3] = rs.getString("apellido1");
                datos[4] = rs.getString("apellido2");
                datos[5] = rs.getString("nombrepadre");
                datos[6] = rs.getString("nombremadre");
                datos[7] = rs.getString("residencia");
                modelo.addRow(datos);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String extraerIDMax(){
        String sql = "SELECT MAX(id) FROM usuarios";
        int id = 0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                id = rs.getInt(1);
            }
            
            if(id == 0){
                id = 1;
            }else{
                id = id + 1;
            }
            
            return String.valueOf(id);
        } 
        catch (SQLException ex) {
        return null;
//      Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
