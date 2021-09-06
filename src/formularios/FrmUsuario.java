/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Hilos;
import clases.Reloj2;
import clases.UsuarioJuego;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Samuel David Ortiz
 */
public class FrmUsuario extends javax.swing.JFrame {

    File archivo;
    Reloj2 reloj = new Reloj2();
    
    public FrmUsuario() throws Exception {
        initComponents();
        
        reloj.setLblReloj(lblReloj);
        reloj.start();
        
        lblReloj.setBackground(Color.black);
        lblReloj.setOpaque(true);
        
        jLabel4.setVisible(false);
        pass2Txt.setVisible(false);
        
        String mensaje = "BIENVENIDO AL JUEGO DE MEMORIA SDOM UMG";
        Hilos texto = new Hilos(mensaje, 300, lblTexto, new JLabel());
        texto.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        lblUMG = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        mailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass2Txt = new javax.swing.JPasswordField();
        pass1Txt = new javax.swing.JPasswordField();
        usuarioTxt = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMenu.setText("Nuevo Usuario");

        lblReloj.setBackground(new java.awt.Color(0, 0, 0));
        lblReloj.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(102, 255, 0));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("00:00:00");
        lblReloj.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/umg.png"))); // NOI18N

        lblTexto.setText("jLabel6");

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblUMG))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMenu)
                        .addGap(60, 60, 60)
                        .addComponent(lblReloj)
                        .addContainerGap())
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblUMG)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu)
                            .addComponent(lblReloj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pinwi.png"))); // NOI18N
        lblImage.setToolTipText("Haga clic para cargar una imagen");
        lblImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Email");

        jLabel4.setText("Confirmar");

        jLabel3.setText("Contraseña");

        pass1Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass1TxtKeyReleased(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnAceptar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnAceptar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblImage)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(102, 102, 102)
                                .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pass1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(pass2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(688, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        int resultado;

        FrmImagen buscador = new FrmImagen();
        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG, GIF", "jpg", "png", "gif");

        buscador.jFileChooser.setFileFilter(formato);
        resultado = buscador.jFileChooser.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {
            archivo = buscador.jFileChooser.getSelectedFile();

            try {
                ImageIcon Img = new ImageIcon(archivo.toString());

                Icon icono = new ImageIcon(Img.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),
                    Image.SCALE_DEFAULT));
            lblImage.setIcon(icono);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir " + ex);
        }
        }

        //JOptionPane.showMessageDialog(null, "HOLA", "Seleccion de imagen", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_lblImageMouseClicked

    private void pass1TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass1TxtKeyReleased
        jLabel4.setVisible(true);
        pass2Txt.setVisible(true);
    }//GEN-LAST:event_pass1TxtKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        try {
            new FrmMenu().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        UsuarioJuego usuario = new UsuarioJuego();

        if (pass1Txt.getText().equals(pass2Txt.getText())) {
            //JOptionPane.showMessageDialog(null, "Son iguales");
            usuario.usuario = usuarioTxt.getText();
            usuario.email = mailTxt.getText();
            usuario.contraseña1 = pass1Txt.getText();
            usuario.contraseña2 = pass2Txt.getText();
            usuario.nuevoUsuario();
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, intente de nuevo");
            pass1Txt.requestFocus();
            pass1Txt.selectAll();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmUsuario().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblUMG;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JPasswordField pass1Txt;
    private javax.swing.JPasswordField pass2Txt;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
