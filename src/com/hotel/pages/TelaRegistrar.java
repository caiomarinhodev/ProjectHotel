package com.hotel.pages;

import com.hotel.util.Log;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaRegistrar extends JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    public TelaRegistrar(Connection con) {
        conn = con;
        initComponents();
        setLocationRelativeTo(null);
        inicializa();
        
    }

    private void ativaBotaoConcluir() {
        boolean nomeNulo, sobrenomeNulo, loginNulo, senhaNula, confirmarSenhaNula, fraseSecretaNula, emailNulo;
        nomeNulo = campoNome.getText().replaceAll(" ", "").equals("");
       
        loginNulo = campoLogin.getText().replaceAll(" ", "").equals("");
        senhaNula = String.valueOf(campoSenha.getPassword()).replaceAll(" ", "").equals("");
        confirmarSenhaNula = String.valueOf(campoConfirmarSenha.getPassword()).replaceAll(" ", "").equals("");
        botaoConcluir.setEnabled(!nomeNulo && !loginNulo && !senhaNula && !confirmarSenhaNula);
    }

   
    private void cadastra() {
        String sql = "INSERT INTO USUARIOS (NOME,LOGIN,SENHA,TIPO) VALUES (?,?,?,?,?,?)";
        try{
           pst = conn.prepareStatement(sql);
           pst.setString(1, campoNome.getText());
           pst.setString(2, campoLogin.getText());
           pst.setString(3, campoSenha.getText());
           pst.setInt(4, 2);
           Log.view("QUERY", "Tentativa de inserir cadastro", "cadastra()", 0, null);
           pst.execute();
           JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");
           fechaJanela();
        }catch(Exception e){
            Log.view("TELAREGISTRAR", "Tentativa de cadastrar novo usuario", "cadastra()", 1, e);
        }
    }
    
    public void fechaJanela(){
        if(pst!=null && conn!=null){
            fechaConexao();
            new TelaLogin(conn).setVisible(true);
            this.dispose();
        }else{
            System.exit(0);
        }
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new JTextField(20);
        labelLogin = new javax.swing.JLabel();
        campoLogin = new JTextField(20);
        labelSenha = new javax.swing.JLabel();
        campoSenha = new JPasswordField(20);
        botaoConcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        labelInforma = new javax.swing.JLabel();
        labelConfirmarSenha = new javax.swing.JLabel();
        campoConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labelNome.setText("*Nome:");

        campoNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoNomeCaretUpdate(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeKeyPressed(evt);
            }
        });

        labelLogin.setText("*Login:");

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

        labelSenha.setText("*Senha:");

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

        botaoConcluir.setText("Concluir");
        botaoConcluir.setEnabled(false);
        botaoConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirActionPerformed(evt);
            }
        });
        botaoConcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoConcluirKeyPressed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        botaoCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCancelarKeyPressed(evt);
            }
        });

        labelInforma.setForeground(new java.awt.Color(255, 0, 0));
        labelInforma.setText("Os campos com asterisco são obrigatórios");

        labelConfirmarSenha.setText("*Confirmar senha:");

        campoConfirmarSenha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoConfirmarSenhaCaretUpdate(evt);
            }
        });
        campoConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoConfirmarSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(labelInforma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConcluir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSenha, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome)
                .addGap(10, 10, 10)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labelConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoConcluir)
                    .addComponent(labelInforma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void campoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            campoLogin.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            fechaJanela();
        }
    }//GEN-LAST:event_campoNomeKeyPressed

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            campoSenha.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            fechaJanela();
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            campoConfirmarSenha.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            fechaJanela();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void campoNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoNomeCaretUpdate
        ativaBotaoConcluir();
    }//GEN-LAST:event_campoNomeCaretUpdate

    private void campoLoginCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoLoginCaretUpdate
        ativaBotaoConcluir();
    }//GEN-LAST:event_campoLoginCaretUpdate

    private void campoSenhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoSenhaCaretUpdate
        ativaBotaoConcluir();
    }//GEN-LAST:event_campoSenhaCaretUpdate

    private void botaoConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConcluirActionPerformed
        cadastra();
    }//GEN-LAST:event_botaoConcluirActionPerformed

    private void botaoConcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoConcluirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botaoConcluir.doClick();
        }
    }//GEN-LAST:event_botaoConcluirKeyPressed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        fechaJanela();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fechaJanela();
        }
    }//GEN-LAST:event_botaoCancelarKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            fechaJanela();
        }
    }//GEN-LAST:event_formKeyPressed

    private void campoConfirmarSenhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaCaretUpdate
        ativaBotaoConcluir();
    }//GEN-LAST:event_campoConfirmarSenhaCaretUpdate

    private void campoConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fechaJanela();
        }
    }//GEN-LAST:event_campoConfirmarSenhaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConcluir;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelInforma;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    // End of variables declaration//GEN-END:variables


    public void atualiza() {
        
    }


    public void limpaCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void inicializa() {
        campoNome.grabFocus(); //To change body of generated methods, choose Tools | Templates.
    }


    public void fechaConexao() {
        try {
                pst.close();
                //conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Nao foi possivel fechar a conexao, fechaJanela()");
            }
    }
}
