/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gutenberg
 */
public class ConnectionFactory {
    
    public Connection getConnection() throws ClassNotFoundException {         
        
        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SiGCLI", "postgres", "engsoftware");
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }
    
}
