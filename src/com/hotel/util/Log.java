/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hotel.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class Log {
   private String message, TAG, method;
   private int type;

    public Log() {
                
    }
    
    private static java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    public static void view(String TAG, String message, String method, int type, Exception e){
        /*
        String q = "INSERT INTO ERROS (ERRO, METODO, DATA) VALUES (?,?,?)";
        try {
            PreparedStatement pst = c.prepareStatement(q);
            pst.setString(1, e.getMessage());
            pst.setString(2, method);
            java.sql.Date d = convertJavaDateToSqlDate(new Date());
            pst.setDate(3, d);
            
            pst.execute();
        } catch (SQLException ex) {
        }*/
       
        if(type==1){
            JOptionPane.showMessageDialog(null, TAG + " \n "+message+" \n "+method+" \n "+e);
        }else{
            System.out.println(TAG+" - "+message+" - "+method);
        }
    }
   
   
}
