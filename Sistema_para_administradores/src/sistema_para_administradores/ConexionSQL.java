/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema_para_administradores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author christian
 * Clase para hacer conexiones a SQL y recuperar datos
 */
public class ConexionSQL {
    
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd="chdesarrollo";
    static String login="root";
    static String password="toor";
    static String url="jdbc:mysql://localhost/"+bd;

    public static Connection Enlace(Connection conn) throws SQLException {        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,login,password);
        }
    
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    
        return conn;
    }

    public static Statement sta(Statement st) throws SQLException {
        conn=Enlace(conn);
        st=conn.createStatement();
        return st;
    }    

    /* public static ResultSet EnlCliente(ResultSet rs)throws SQLException
    {
    st=sta(st);
    rs=st.executeQuery("select * from cliente");
    return rs;
    } */
    
}
