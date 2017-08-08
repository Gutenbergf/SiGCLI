/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gutenberg
 */
public class Cmd {

    /**
     * @param nome
     * @throws java.io.IOException
     */          
    
    
    
    
    public static void abrirDocumentoWord(String nome) throws IOException{
        String nomeLocatario[] = nome.split(" ");   
        JOptionPane.showMessageDialog(null, nomeLocatario[0]);
        String comando = "cmd.exe /C start WINWORD.exe C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\Contratos\\Contrato-"+nomeLocatario[0]+".doc";      
        
        Process exec;          
           
       
         try{
            exec = Runtime.getRuntime().exec(comando);      
                
            
        }
        catch (IOException e){
        } 
    }
    
}
