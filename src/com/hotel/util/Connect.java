/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class Connect {
    
   Connection conn = null;
   
   public static Connection ConnectDb(String ip, String porta, String banco, String login, String senha, boolean isTeste){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://"+ip+":"+porta+"/"+banco+"?zeroDateTimeBehavior=convertToNull", login, senha);
            if(isTeste){
                JOptionPane.showMessageDialog(null, "CONNECTION ESTABLISHED");
            }
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
            return null;
        }
       
       
   }
    
}
