/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hotel.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class Login {
    
    public static boolean verificaLogin(String table, Connection conn, PreparedStatement pst, ResultSet rs, String login, String senha){
        String sql = "SELECT * FROM "+table+" WHERE LOGIN=? AND SENHA=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            Log.view("QUERY", sql, "entrar()", 0, null);
            rs = pst.executeQuery();
            if(rs.next()){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "LOGIN NAO EXISTE!");
                return false;
            }
        } catch (Exception e) {
            Log.view("TELALOGIN", "", "entra()", 1, null);
        }
        return false;
    }
    
    public static boolean cadastraUsuario(String table, String nome, String login, String senha, String frase, String email, String tipo, Connection conn, PreparedStatement pst){
        String sql = "INSERT INTO "+table+" (NOME,LOGIN,SENHA,FRASE,EMAIL,TIPO) VALUES (?,?,?,?,?,?)";
        try{
           pst = conn.prepareStatement(sql);
           pst.setString(1, nome);
           pst.setString(2, login);
           pst.setString(3, senha);
           pst.setString(4, frase);
           pst.setString(5, email);
           pst.setString(6, tipo);
           pst.execute();
           JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");
           return true;
        }catch(Exception e){
            Log.view("TELAREGISTRAR", "Tentativa de cadastrar novo usuario", "cadastra()", 1, e);
        }
        return false;
    }
    
}
