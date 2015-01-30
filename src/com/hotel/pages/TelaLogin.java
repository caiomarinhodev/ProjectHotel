package com.hotel.pages;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public TelaLogin(Connection con) {
        this.conn = con;
        initComponents();
        setLocationRelativeTo(null);
        inicializa();
    }

//    private void executarLogin(){
//        try {
//              pst.close();
//              rs.close();
//              if(usuario.getTipo()==0 || usuario.getTipo()==1){
//                Log.view("TELALOGIN", "Entrada no Painel de Admin", "entra()", 0, null);
//                new PainelAdmin(conn, sistema).setVisible(true);
//              }else{
//                    Log.view("TELALOGIN", "Entrada no Sistema Normal por:"+sistema.getUsuarioAtual().getNome(), "entra()", 0, null);
//                    new TelaEntradaUser(conn, sistema).setVisible(true);
//                }
//                    
//            }catch (Exception e) {
//                    Log.view("TELALOGIN", "Erro ao tentar entrar!", "entra()", 1, e);
//            }
//    }
    public void atualiza() {
        limpaCampos();
    }

    private void ativaBotaoEntrar() {
        boolean loginNulo = campoLogin.getText().replaceAll(" ", "").equals("");
        boolean senhaNula = String.valueOf(campoSenha.getPassword()).replaceAll(" ", "").equals("");
        botaoEntrar.setEnabled(!loginNulo && !senhaNula);
    }

    public void limpaCampos() {
        campoLogin.setText("");
        campoSenha.setText("");
        campoLogin.grabFocus();
    }

    public void fechaJanela() {
        System.exit(0);
        //this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEmCamadas = new javax.swing.JLayeredPane();
        painelCampos = new javax.swing.JPanel();
        labelLogin = new JLabel();
        campoLogin = new JTextField();
        labelSenha = new JLabel();
        campoSenha = new JPasswordField();
        painelBotões = new javax.swing.JPanel();
        botaoEntrar = new JButton();
        btnRegistrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelCampos.setName(""); // NOI18N

        labelLogin.setText("Login:");

        campoLogin.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoLoginCaretUpdate(evt);
            }
        });
        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });

        labelSenha.setText("Senha:");

        campoSenha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoSenhaCaretUpdate(evt);
            }
        });
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painelCamposLayout = new javax.swing.GroupLayout(painelCampos);
        painelCampos.setLayout(painelCamposLayout);
        painelCamposLayout.setHorizontalGroup(
            painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoLogin)
                    .addComponent(campoSenha)
                    .addGroup(painelCamposLayout.createSequentialGroup()
                        .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelLogin))
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCamposLayout.setVerticalGroup(
            painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposLayout.createSequentialGroup()
                .addComponent(labelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelEmCamadas.add(painelCampos);
        painelCampos.setBounds(0, 10, 290, 110);
        painelCampos.getAccessibleContext().setAccessibleDescription("");

        botaoEntrar.setText("Entrar");
        botaoEntrar.setEnabled(false);
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotõesLayout = new javax.swing.GroupLayout(painelBotões);
        painelBotões.setLayout(painelBotõesLayout);
        painelBotõesLayout.setHorizontalGroup(
            painelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotõesLayout.setVerticalGroup(
            painelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1422655255_hotel.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelEmCamadas, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(painelBotões, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEmCamadas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoLoginCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoLoginCaretUpdate
        ativaBotaoEntrar();
    }//GEN-LAST:event_campoLoginCaretUpdate


    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
//        verificaSeContaExiste();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void campoSenhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoSenhaCaretUpdate
        ativaBotaoEntrar();
    }//GEN-LAST:event_campoSenhaCaretUpdate

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            campoSenha.grabFocus();
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botaoEntrar.doClick();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fechaJanela();
    }//GEN-LAST:event_formWindowClosing

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        fechaConexao();
        new TelaRegistrar(conn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel painelBotões;
    private javax.swing.JPanel painelCampos;
    private javax.swing.JLayeredPane painelEmCamadas;
    // End of variables declaration//GEN-END:variables

    public void inicializa() {
        limpaCampos();
    }

    public void fechaConexao() {
        try {
            pst.close();
            rs.close();
            //conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel desconectar!");
        }
    }

}
