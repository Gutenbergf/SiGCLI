/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Gutenberg
 */
public class DAOUsuario {
    
    private Connection con;
    
    public DAOUsuario() throws ClassNotFoundException {
        this.con =  new ConnectionFactory().getConnection();
    }

    public boolean inserir(Usuario u) {
        if(u.getLogin().isEmpty() || u.getSenha().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo login e/ou senha vazios");
            return false;
        }

        String sql = "insert into usuario "
                + "(login, senha)"
                + " values (?,?)";
        try {
// prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);
// seta os valores
            stmt.setString(1, u.getLogin().toString());
            stmt.setString(2, u.getSenha().toString());            
// executa
            stmt.execute();
            stmt.close();
            con.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Este usuario já existe");             
            //throw new RuntimeException(e);    
            return false;
        }
    }
    
    public boolean getDados(Usuario u) throws SQLException{
        String sql = "SELECT login,senha FROM usuario where login = ? AND senha = ?";
        String login = null,senha = null;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,u.getLogin().toString());
        stmt.setString(2,u.getSenha().toString());
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            login = rs.getString("login"); senha = rs.getString("senha");
        }                
        
        if(validaLogin(u,login,senha)){
            return true;
        }             
        return false;
        
    }
    
    public boolean validaLogin(Usuario u,String login,String senha){
        if(u.getLogin().toString().equals(login) && u.getSenha().toString().equals(senha)){
            return true;
        }
        return false;
        
    }
   
    
    
    
}
