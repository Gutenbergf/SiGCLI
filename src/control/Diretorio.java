/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;

/**
 *
 * @author Gutenberg
 */
public class Diretorio {
    public static File diretorio;
    
    public static File getInstance(){
        if(diretorio==null){
            diretorio = new File("C:\\Users\\"+System.getProperty("user.home")+"\\Desktop\\Contratos");
        }
        return diretorio;
    }
    
}
