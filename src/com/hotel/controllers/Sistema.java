/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.controllers;

import java.sql.Connection;

/**
 *
 * @author caio
 */
public class Sistema {
    
    private static Connection connection;
    
    private Sistema() {
    }
    
    public static void setConnection(Connection conn){
        connection = conn;
    }
    
    public static Connection getConnection(){
        return connection;
    }

}
